package ml.rubypowered.ide;

import ml.rubypowered.ide.files.ConfigFile;
import ml.rubypowered.ide.graphics.FileList;
import ml.rubypowered.ide.graphics.MainWindow;

public class Main {

	public static void main(String[] args) {
		ConfigFile conf = ConfigFile.getConfigFileInstance();
		boolean configFileExtists = conf.checkForConfig();
		
		if(configFileExtists == true) {
			conf.loadConfigFile();
		}else {
			conf.createConfigFile();
			conf.loadConfigFile();
		}
		
		new MainWindow();
		new FileList(conf.getDefaultWorkspaceDirectory());
	}

}
