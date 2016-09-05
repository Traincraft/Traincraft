/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.core.helpers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class CapesHelper extends Thread {
	
	private String username;
	public boolean MCCape = true;
	
	private boolean isStatic = false;
    private boolean isAnimated = false;
    private String staticUrl;
    private ArrayList<String> animatedFrameUrls;
    private ResourceLocation staticRL;
    private ResourceLocation[] animatedFramesRL;
    private ThreadDownloadImageData staticImage;
    private ThreadDownloadImageData[] animatedFramesImages;
    private int currFrame;
    private long lastFrameTime;
    private int animInterval = 500;
	
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

	private void dlImages() {
		if(isAnimated) {
			animatedFramesRL = new ResourceLocation[animatedFrameUrls.size()];
			animatedFramesImages = new ThreadDownloadImageData[animatedFrameUrls.size()];
			for (int i = 0; i < animatedFrameUrls.size(); i++) {
				animatedFramesRL[i] = capeAnimatedRL(username, i+1);
				animatedFramesImages[i] = dlImage(animatedFramesRL[i], animatedFrameUrls.get(i));
			}
		}
		else if(isStatic) {
			staticRL = capeStaticRL(username);
			staticImage = dlImage(staticRL, staticUrl);
		}
		else {
			MCCape = false;
		}
		isLoaded = true;
	}

	public ResourceLocation getCurrentRL() {
		if(isAnimated) {
			long time = Minecraft.getSystemTime();
			if(time > lastFrameTime + animInterval) {
				lastFrameTime = time;
				currFrame++;
				if(currFrame >= animatedFramesImages.length) {
					currFrame = 0;
				}
			}
			return animatedFramesRL[currFrame];
		}
		return staticRL;
	}

	private static ResourceLocation capeStaticRL(String username) {
		return new ResourceLocation("cloaks/" + StringUtils.stripControlCodes(username));
	}

	private static ResourceLocation capeAnimatedRL(String username, int frameNumber) {
		return new ResourceLocation("cloaks/" + StringUtils.stripControlCodes(username) + "/" + frameNumber);
	}

	private static ThreadDownloadImageData dlImage(ResourceLocation rl, String url) {
		TextureManager textures = Minecraft.getMinecraft().renderEngine;
		File file = new File(rl.getResourcePath());
		ThreadDownloadImageData data = new ThreadDownloadImageData(file, url, rl, null);
		textures.loadTexture(rl, data);
		return data;
	}
}
