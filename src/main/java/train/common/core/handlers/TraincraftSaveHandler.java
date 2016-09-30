package train.common.core.handlers;

import net.minecraft.server.MinecraftServer;

import java.io.*;
import java.util.ArrayList;

public class TraincraftSaveHandler {
	
	public static boolean createFile(MinecraftServer server) {
		try {
			File file;
			//System.out.println(server.getFile("Traincraft.dat"));
			if (server.isDedicatedServer()) {
				file = server.getFile(server.getFolderName() + "/data/Traincraft.dat");
			}
			else {
				file = server.getFile("saves/" + server.getFolderName() + "/data/Traincraft.dat");
			}
			if (file != null && file.exists()) {
				return true;
			}
			else if (file != null) {
				file.createNewFile();
				return false;
			}
			return false;
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
	}

	public static int readInt(MinecraftServer server, String name) {
		try {
			File file;
			if (server.isDedicatedServer()) {
				file = server.getFile(server.getFolderName() + "/data/Traincraft.dat");
			}
			else {
				file = server.getFile("saves/" + server.getFolderName() + "/data/Traincraft.dat");
			}
			if (file != null && file.exists()) {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line;
				while ((line = reader.readLine()) != null) {
					//if(!line.startsWith(name))continue;//numberOfTrains:
					if (line.startsWith(name)) {
						return (Integer.parseInt(line.substring(name.length())));
					}
					else {
						reader.close();
					}
				}
			}
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
		return -1;
	}

	public static void writeValue(MinecraftServer server, String name, String value) {
		try {
			File file;
			File newFile;
			ArrayList<String> content = new ArrayList<String>();
			if (server.isDedicatedServer()) {
				file = server.getFile(server.getFolderName() + "/data/Traincraft.dat");
				newFile = server.getFile(server.getFolderName() + "/data/newTraincraft.dat");
			}
			else {
				file = server.getFile("saves/" + server.getFolderName() + "/data/Traincraft.dat");
				newFile = server.getFile("saves/" + server.getFolderName() + "/data/newTraincraft.dat");
			}
			if (file != null && file.exists()) {
				newFile.createNewFile();
				BufferedReader reader = new BufferedReader(new FileReader(file));
				BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
				String line;
				while ((line = reader.readLine()) != null) {
					content.add(line);
				}
				reader.close();
				boolean replaced = false;
				for (int i = 0; i < content.size(); i++) {
					if (content.get(i).startsWith(name)) {
						content.remove(i);
						content.add(i, name + value);
						replaced = true;
					}
					if (i == content.size() - 1 && !replaced) {
						content.add(name + value);
					}
				}
				if (content.size() == 0) {
					bw.write(name + value + "\n");
				}
				else {
					for (String item : content) {
						bw.write(item + "\n");
					}
				}

				bw.close();

				file.delete();
				newFile.renameTo(file);
			}
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
	}
}