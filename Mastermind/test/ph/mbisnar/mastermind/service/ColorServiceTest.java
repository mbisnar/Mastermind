package ph.mbisnar.mastermind.service;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import ph.mbisnar.mastermind.type.Peg;

public class ColorServiceTest {
	
	ColorService service = new ColorService();

	@Test
	public void testGenerateColors_createNewList() {
		// given
		List<Peg> orderedColors = Peg.getPegs();
		
		//when
		List<Peg> randomColors = service.generateColors();
		
		// then
		assertNotSame(orderedColors, randomColors);
	}
	
	@Test
	public void testGeneratedColors_notReturningEmptyList() {
		// given
		// when
		List<Peg> randomColors = service.generateColors();
		
		// then
		assertFalse(randomColors.isEmpty());
	}
	
	@Test
	public void testGeneratedColors_returnExactly6Pegs() {
		// given
		// when
		List<Peg> randomColors = service.generateColors();
		
		// then
		assertEquals(6, randomColors.size());
	}
}
