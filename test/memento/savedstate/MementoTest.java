package memento.savedstate;

import static org.junit.Assert.*;

import org.junit.Test;

public class MementoTest {

	@Test
	public void testMemento() {
		String beep = "Ipsum Lorem";
		assertEquals(beep, new Memento(beep).getSavedState());
	}

}
