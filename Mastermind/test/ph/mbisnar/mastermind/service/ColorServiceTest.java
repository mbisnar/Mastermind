package ph.mbisnar.mastermind.service;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import ph.mbisnar.mastermind.type.Peg;

public class ColorServiceTest {

	ColorService service = new ColorService();
		
	@Test
	public void testGenerateColors() {
		// given
		List<Peg> orderedColors = Peg.getPegs();
		List<Peg> randomColors = service.generateColors();
		
		
	}
	
}
