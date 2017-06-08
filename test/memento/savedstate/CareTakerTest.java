package memento.savedstate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CareTakerTest {
	
	private CareTaker ct;

	@Before
	public void initialise(){
		ct = new CareTaker();
	}

	@Test
	public void testCareTakerEmpty() {
		assertEquals("", 0, ct.countSavedStates());
	}
	
	@Test
	public void testCareTakerAddSingleObject() {
		int item = 5;
		ct.addMemento(item);
		assertEquals("", 1, ct.countSavedStates());
		
		assertEquals("", item, ct.getMemento(0));
	}

}
