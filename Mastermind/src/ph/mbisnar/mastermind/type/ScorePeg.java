package ph.mbisnar.mastermind.type;

import java.awt.Color;

public enum ScorePeg {
	WHITE(Color.WHITE),
	BLACK(Color.BLACK);
	
	private final Color color;
	
	private ScorePeg(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
}
