package view;

import java.awt.Color;

import javax.swing.*;

/**
 * 
 * @class this is the centimetersConversionArea class which has the value given by the user.
 *
 */

public class MeterConversionArea extends JTextArea {
	
	/**
	 * to set the way this TextArea will look certain attributes are updates through parent methods.
	 */
	
	
	public MeterConversionArea() {
		super();
		super.setText("0 m");
		super.setBackground(Color.ORANGE);
		super.setBounds(289, 33, 222, 200);
	}

}
