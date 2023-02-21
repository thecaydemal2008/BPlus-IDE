package ml.rubypowered.ide.graphics;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame implements ActionListener{
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileOptions = new JMenu();
	
	private JPanel p = new JPanel();
	private static JPanel filePanel = new JPanel();
	
	public static JEditorPane editPane = new JEditorPane();
	private JScrollPane scrollPane = new JScrollPane(editPane);
	
	private JLabel fileLabel = new JLabel();
	
	public MainWindow() {
		super("Offical B+ IDE");
		this.setSize(1200,900);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.gray);
		
		p.setVisible(true);
		p.setSize(1200,900);
		p.setLayout(null);
		
		//File window
		filePanel.setVisible(true);
		filePanel.setBounds(0,0, 250,900);
		filePanel.setBackground(Color.gray);
		
		fileLabel.setVisible(true);
		fileLabel.setBounds((250 / 2) - (100 / 2) - 10 , 5, 100, 24);
		fileLabel.setFont(new Font("Candara", Font.PLAIN, 18));
		fileLabel.setForeground(Color.green);
		fileLabel.setText("Project Files");
		
		scrollPane.setVisible(true);
		scrollPane.setBounds(250,50,935,900);
		
		editPane.setFont(new Font("Arial", Font.PLAIN, 18));
		
		
		
		//Adding stuff
		
		this.add(p);
		
		p.add(filePanel);
		p.add(scrollPane);
		
		filePanel.add(fileLabel);
	}
	
	public static void addToFilePanel(Component c) {
		filePanel.add(c);
	}
	public static void addToFilePanel(JComponent jc) {
		filePanel.add(jc);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
