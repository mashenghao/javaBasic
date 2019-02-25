
import java.awt.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;

public class ListFrame {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		JFrame j = new JFrame();
		JList list = new JList();
		
		v.addElement("第一条消息");
		v.addElement("第二天");
		list.setListData(v);
		j.add(list);
		j.setSize(300, 400);
		j.setVisible(true);
	}
}
