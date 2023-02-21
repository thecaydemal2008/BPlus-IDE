package ml.rubypowered.ide.graphics;

import java.io.File;

import javax.swing.JList;

public class FileList extends JList{

	File[] workingDirFiles;
	
	public FileList(File workingDir) {
	
		workingDirFiles = workingDir.listFiles();
		this.setListData(workingDirFiles);
		
		MainWindow.addToFilePanel(this);
	}
	
}
