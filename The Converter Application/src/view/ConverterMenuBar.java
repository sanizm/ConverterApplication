package view;

import java.awt.event.*;

import javax.swing.*;

public class ConverterMenuBar extends JMenuBar {

	public ConverterMenuBar(ActionListener mbListener) {
		super();
		super.setBounds(0, 0, 582, 22);
		JMenu updateModel = new JMenu("Update model");
		super.add(updateModel);
		JMenuItem save = new JMenuItem("Save input centimeters");
		save.setActionCommand("update");
		save.addActionListener(mbListener);
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.ALT_MASK));
		updateModel.add(save);
		
	}
}
