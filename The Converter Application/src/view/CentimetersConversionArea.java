package view;

import java.awt.Color;

import javax.swing.*;

/**
 * 
 * @class this is the centimetersConversionArea class which has the value given by the user.
 *
 */

public class CentimetersConversionArea extends JTextArea {
	
	/**
	 * to set the way this TextArea will look certain attributes are updates through parent methods.
	 */
	
	public CentimetersConversionArea() {
		super();
		super.setText("0");
		super.setBackground(Color.YELLOW);
		super.setBounds(171, 240, 222, 200);
	}

}
