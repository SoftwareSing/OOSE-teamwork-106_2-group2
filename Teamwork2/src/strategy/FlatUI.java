package strategy;

import java.awt.Color;

import view.View;

public class FlatUI implements GuiStrategy{

	View vMdtr = View.getInstance();
	
	@Override
	public Color changeButton() {
		// TODO Auto-generated method stub
		return new Color(52, 73, 94);
	}

	public Color changeButtonFont() {
		return new Color(255, 255, 255);
	}
	
	@Override
	public Color changePanel() {
		// TODO Auto-generated method stub
		return new Color(189, 195, 199);
	}}
