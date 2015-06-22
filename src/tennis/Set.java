package tennis;

import java.util.ArrayList;

public class Set {
	
	private ArrayList<Score> set;
	
	public Set(ArrayList<Score> set){
		this.set = set;		
	}
	
	public ArrayList<Score> GetSet(){
		return set;
	}
	
	public void add(Score gm){
		if(!set.contains(gm)){
			set.add(gm);
		}
	}
	
	/**
	 * @param gm is a score which fills up a set
	 * @return boolean if gm is in set
	 */
	public boolean contains(Score gm) {
		return set.contains(gm);
	}

}
