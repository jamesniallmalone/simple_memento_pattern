package memento.savedstate;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Object> savedStates;
	
	public CareTaker(){
		savedStates = new ArrayList<Object>();
	}

	public void addMemento(Object m) {
		savedStates.add(m);
	}

	public Object getMemento(int i) {
		return savedStates.get(i);
	}
	
	public int countSavedStates(){
		return savedStates.size();
	}

}
