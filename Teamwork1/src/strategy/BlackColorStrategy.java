package strategy;

import java.awt.Color;

public class BlackColorStrategy implements ColorStrategy{

	private int r = 40;
	private int g = 40;
	private int b = 40;
	
	@Override
	public Color handle() {
		// TODO Auto-generated method stub
		return new Color(r, g, b);
	}

}
