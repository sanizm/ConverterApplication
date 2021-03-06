package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import model.*;
import view.*;

/**
 * 
 * @class MenuBarListener
 * This class basically takes care of the user-action and displaying of calculation done by model class
 * 
 */

public class MenuBarListener implements ActionListener{
	
	public ConverterPanel panel;
	private double centimeter;
	private JTextArea fa;
	private JTextArea ma;
	private JTextArea ca;
	private ValueToConvert calc;
	
	public MenuBarListener(ConverterPanel panel, JTextArea fa, JTextArea ma, JTextArea ca) {
		this.panel = panel;
        this.ca = ca;
		this.fa = fa;
		this.ma = ma;
	}

	/**
	 * In this method whenever the user click Update Model button the conversion calculated in the model class
	 * are displayed on the respected TextArea.
	 * @param ActionEvent e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("update")) {
	    this.centimeter = Double.parseDouble(ca.getText());
		this.calc = new ValueToConvert(this.centimeter);
			this.fa.setText(""+this.calc.getinFeet()+"ft");
			this.ma.setText(""+this.calc.getinMeter()+"m");
		}
		
		
	}

}
