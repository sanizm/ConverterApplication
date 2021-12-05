package main;

import javax.swing.*;

import controller.*;
import model.*;
import view.*;


public class TheConverterApp {

	public static void main(String[] args) {
	
		JFrame frame = new JFrame("The Converter Application");
		ConverterPanel panel = new ConverterPanel();
		
		FeetConversionArea feetarea = new FeetConversionArea();
		CentimetersConversionArea centimeterarea = new CentimetersConversionArea();
		MeterConversionArea meterarea = new MeterConversionArea();
		MenuBarListener mbListener = new MenuBarListener(panel, feetarea,meterarea,centimeterarea);
		ConverterMenuBar menuBar = new ConverterMenuBar(mbListener);
		panel.add(feetarea);
		panel.add(centimeterarea);
		panel.add(meterarea);
		panel.add(menuBar);
		frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
	
	}

}
