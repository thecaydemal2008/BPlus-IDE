package ml.rubypowered.ide.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import ml.rubypowered.ide.graphics.MainWindow;

public class Save {
	
	private JFileChooser path = new JFileChooser();
	
	public Save(File fileLocation) throws IOException{
		FileWriter writer = new FileWriter(fileLocation);
		Scanner areaScanner = new Scanner(MainWindow.editPane.getText());
		
		while(areaScanner.hasNextLine()) {
			writer.append(areaScanner.nextLine());
		}
		
		writer.flush();
		writer.close();
		areaScanner.close();
		
	}
	
	public static void selectLocation() {
		
	}
	
}
