package memento;

import memento.savedstate.CareTaker;
import memento.savedstate.Originator;

public class Runner {

	public static void main(String[] args) {
		CareTaker ct = new CareTaker();
		Originator orig = new Originator();
		
		orig.set("State 1");
		orig.set("State 2");
		
		ct.addMemento(orig.saveToMemento());
		
		orig.set("State 3");
		
		ct.addMemento(orig.saveToMemento());
		
		orig.set("State 4");
		
		System.out.println("Restoring to previous state...");
		
		orig.restoreFromMemento(ct.getMemento(1));
	}

}
