package memento.savedstate;

public class Originator {

	private String state;

	public void set(String state) {
		this.state = state;
		System.out.println("Originator: State set to " + this.state);
	}

	public Object saveToMemento() {
		return new Memento(state);
	}

	public void restoreFromMemento(Object mem) {
		if (mem instanceof Memento)
		{
			Memento m = (Memento) mem;
			
			state = m.getSavedState();
			
			System.out.println("Originator: Just restored from Memento to state: " + state);
		}
	}
	
	public String getState(){
		return state;
	}
	
	
	

}
