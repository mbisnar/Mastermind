package ph.mbisnar.mastermind.type;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public enum Peg {

	RED(new Color(0xff, 0x00, 0x00)),
	YELLOW(new Color(0xff, 0xd7, 0x00)),
	GREEN(new Color(0x00, 0x80, 0x00)),
	BROWN(new Color(0x8b, 0x45, 0x13)),
	BLUE(new Color(0x00, 0x00, 0xff)),
	ORANGE(new Color(0xff, 0x8c, 0x00));

	private final Color color;
	
	private Peg(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public String getName() {
		return name();
	}

	public static List<Peg> getPegs() {
		return Arrays.asList(RED, YELLOW, GREEN, BROWN, BLUE, ORANGE);
	}
}
