package ml.rubypowered.ide.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {

	private static final File CONFIG = new File("C:\\BPus\\IDE\\ConfigFile.conf");
	
	private static final Properties properties = new Properties();
	
	public void loadConfigFile() {
		try {
			properties.load(new FileInputStream(CONFIG));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Config file loaded");
		
	}
	
	public ConfigFile() {
		//Empty
	}
	
	public static ConfigFile getConfigFileInstance() {
		return new ConfigFile();
	}
	
	public static boolean checkForConfig() {
		boolean exists;
		
		if(CONFIG.exists()) {
			exists = true;
		}else {
			exists = false;
		}
		
		return exists;
	}
	
	public static void createConfigFile() {
		CONFIG.mkdirs();
		try {
			CONFIG.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static File getDefaultWorkspaceDirectory() {
		return new File(properties.getProperty("defaultWorkspaceDirectory"));
	}
	
}
