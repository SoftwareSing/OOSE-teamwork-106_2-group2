package flyweight;

import java.awt.Color;
import java.util.HashMap;

import strategy.*;

// Color Strategy is flyweight
public class ColorFactory {
	private HashMap<String, Color> ColorList = new HashMap<>();
	private Color result = null;

	//	private Mediator mediator = new Mediator();
	//	
	//	public ColorFactory(Mediator mediator) {
	//		this.mediator = mediator;
	//	}

	public Color getColor(String color) {
		result = ColorList.get(color);

		if (result == null) {
			result = createNewColor(color);
			ColorList.put(color, result);
		}

		return result;
	}

	public Color createNewColor(String color) {
		ColorStrategy colorStrategy = new BlackColorStrategy();
		switch (color.toLowerCase()) {
			case "black":
				colorStrategy = new BlackColorStrategy();
				break;
			case "mikugreen":
				colorStrategy = new MikuGreenColorStrategy();
				break;
			case "orange":
				colorStrategy = new OrangeColorStrategy();
				break;
			case "yellow":
				colorStrategy = new YellowColorStrategy();
				break;
			case "pink":
				colorStrategy = new PinkColorStrategy();
				break;
			case "red":
				colorStrategy = new RedColorStrategy();
				break;
			case "blue":
				colorStrategy = new BlueColorStrategy();
				break;
			default:
				colorStrategy = new BlackColorStrategy();
				break;
		}
		result = colorStrategy.handle();

		return result;
	}
}
