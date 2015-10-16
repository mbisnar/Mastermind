package ph.mbisnar.mastermind.type;

import java.awt.Color;

public enum PegColor {
	// Colored Pegs
	RED(new Color(0xff, 0x00, 0x00)),
	YELLOW(new Color(0xff, 0xd7, 0x00)),
	GREEN(new Color(0x00, 0x80, 0x00)),
	BROWN(new Color(0x8b, 0x45, 0x13)),
	BLUE(new Color(0x00, 0x00, 0xff)),
	ORANGE(new Color(0xff, 0x8c, 0x00)),
	
	// Score Pegs
	WHITE(new Color(0xff, 0xff, 0xff)),
	BLACK(new Color(0x00, 0x00, 0x00));
	
	private final Color color;
	
	private PegColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public String getName() {
		return name();
	}
}
