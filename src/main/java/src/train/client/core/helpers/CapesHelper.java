/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.client.core.helpers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import src.train.client.core.handlers.ClientTickHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.util.ResourceLocation;

public class CapesHelper extends Thread {
	
	public String username;
	public boolean MCCape = true;
	
	public boolean isStatic = false;
    public boolean isAnimated = false;
    public String staticUrl;
    public ArrayList<String> animatedFrameUrls;
    public ResourceLocation staticRL;
    public ResourceLocation[] animatedFramesRL;
    public ThreadDownloadImageData staticImage;
    public ThreadDownloadImageData[] animatedFramesImages;
    public int currFrame;
    public long lastFrameTime;
    public int animInterval = 500;
	
	public static HashMap<String, CapesHelper> users = new HashMap();
	public static boolean isLoaded = false;
	
	public CapesHelper(String username) {
		this.username = username;
	}

	@Override
	public void run() {
		try {
          URL url = new URL("https://dl.dropbox.com/u/25602663/Traincraft/Capes/" + username.toLowerCase() + "_cape.txt");
          BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
          String line;
          int sub = 3;
          while ((line = reader.readLine()) != null) {
        	  if(line.startsWith("SU")) {
        		  isStatic = true;
        		  staticUrl = line.substring(sub);
        	  }
        	  else if(line.startsWith("AU")) {
        		  isAnimated = true;
        		  if(animatedFrameUrls == null) {
        			  animatedFrameUrls = new ArrayList<String>();
        		  }
        		  animatedFrameUrls.add(line.substring(sub));
        	  }
        	  else if(line.startsWith("AI")) {
        		  animInterval = Integer.parseInt(line.substring(sub));
        	  }
          }
          reader.close();
          dlImages();
        }catch(Exception e) {}
	}
	
	public void dlImages() {
		if(isAnimated) {
			animatedFramesRL = new ResourceLocation[animatedFrameUrls.size()];
			animatedFramesImages = new ThreadDownloadImageData[animatedFrameUrls.size()];
			for (int i = 0; i < animatedFrameUrls.size(); i++) {
				animatedFramesRL[i] = ClientTickHandler.capeAnimatedRL(username, i+1);
				animatedFramesImages[i] = ClientTickHandler.dlImage(animatedFramesRL[i], (String)animatedFrameUrls.get(i));
			}
		}
		else if(isStatic) {
			staticRL = ClientTickHandler.capeStaticRL(username);
			staticImage = ClientTickHandler.dlImage(staticRL, staticUrl);
		}
		else {
			MCCape = false;
		}
		isLoaded = true;
	}
	
	public ThreadDownloadImageData getCurrentImage() {
		if(isAnimated) {
			long time = Minecraft.getSystemTime();
			if(time > lastFrameTime + animInterval) {
				lastFrameTime = time;
				currFrame++;
				if(currFrame >= animatedFramesImages.length) {
					currFrame = 0;
				}
			}
			return animatedFramesImages[currFrame];
		}
		return staticImage;
	}
	
	public ResourceLocation getCurrentRL() {
		if(isAnimated) {
			return animatedFramesRL[currFrame];
		}
		return staticRL;
	}
}
