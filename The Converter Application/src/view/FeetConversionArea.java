package view;

import java.awt.Color;

import javax.swing.*;

/**
 * 
 * @class this is the centimetersConversionArea class which has the value given by the user.
 *
 */
public class FeetConversionArea extends JTextArea {
	
	/**
	 * to set the way this TextArea will look certain attributes are updates through parent methods.
	 */
	
	public FeetConversionArea() {
		super();
		super.setText("0 ft");
		super.setBackground(Color.GREEN);
		super.setBounds(61, 33, 222, 200);
	}

}
