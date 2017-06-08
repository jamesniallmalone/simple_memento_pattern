package memento.savedstate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OriginatorTest {

	private Originator or;

	@Before
	public void initialise(){
		or = new Originator();
	}
	
	@Test
	public void testBasicCase() {
		String aa = "AAAAA";
		or.set(aa);
		
		Object memobject = or.saveToMemento();
		
		or.restoreFromMemento(memobject);
		
		assertEquals(aa, or.getState());
		
	}
	
	@Test
	public void testBasicCaseNewSet() {
		String aa = "AAAAA";
		or.set(aa);
		
		Object memobject = or.saveToMemento();
		
		or.set("FOOBAR");
		
		or.restoreFromMemento(memobject);
		
		assertEquals(aa, or.getState());
		
	}
	
	@Test
	public void testRestoreNonMemento() {
		String aa = "AAAAA";
		or.set(aa);
		
		or.saveToMemento();
		String dummy = "FOOBAR";
		or.set(dummy);
		
		or.restoreFromMemento(5);
		
		assertEquals(dummy, or.getState());
		
	}

}
