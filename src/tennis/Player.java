package tennis;

public class Player {
	private String name;
	private Set set;
	private boolean match;
	public Player(String name, Set set, boolean match){
		this.name = name;	
		this.set = set;
		this.match = match;
	}
	


	public String toString() {
		return "Player [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public Set getSet() {
		return set;
	}

	public boolean isMatch() {
		return match;
	}

	
	

}
