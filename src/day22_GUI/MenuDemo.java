package day22_GUI;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.StringBufferInputStream;

import javax.swing.JFrame;

public class MenuDemo {
	JFrame f;
	MenuBar bar;
	Menu menu1, menu2;
	TextArea tx;
	MenuItem it1, it2, it3;
	FileDialog openDia, saveDia;
	Button but;
	public MenuDemo() {
		init();
	}

	public void init() {
		f = new JFrame();
		bar = new MenuBar();
		menu1 = new Menu("file");
		menu2 = new Menu("BBB");
		it1 = new MenuItem("open");
		it2 = new MenuItem("save");
		it3 = new MenuItem("exit");
		tx = new TextArea();
		openDia = new FileDialog(f, "打开文件",FileDialog.LOAD);
		saveDia = new FileDialog(f, "保存文件", FileDialog.SAVE);
		menu2.add(it3);
		menu1.add(it1);
		menu1.add(it2);
		menu1.add(menu2);

		bar.add(menu1);

		addListen();
		f.setMenuBar(bar);
		f.add(tx);
		f.setSize(400, 500);
		f.setVisible(true);
		f.setLocation(40, 50);
	}

	public void addListen() {
		// 文件打开
		it1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openDia.setVisible(true);
				String path = openDia.getDirectory();
				String filename = openDia.getFile();
				if (path != null && filename != null) {
					tx.setText("");
					try {
						String as =null ;
						BufferedReader bu = new BufferedReader(new FileReader(path + filename));
						while( (as= bu.readLine())!=null){
							tx.append(as+'\n');
						}
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		it2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveDia.setVisible(true);
				String path = saveDia.getDirectory();
				String filename = saveDia.getFile();
				System.out.println(path+filename);
				if (path != null && filename != null) {
					try {
						BufferedWriter out =new BufferedWriter(
									new FileWriter(path+filename));
						String txt = tx.getText();
						out.write(txt);
						out.flush();
						out.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		new MenuDemo();
	}
}
