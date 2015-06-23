package tennis;

import java.util.ArrayList;

public class Set {
	
	private ArrayList<Game> set;
	public Set(){
		set = new ArrayList<Game>();
	}
	
	public ArrayList<Game> GetSet(){
		return set;
	}
	
	public void add(Game gm){
		if(!set.contains(gm)){
			set.add(gm);
		}
	}
	
	/**
	 * @param a gm fills up a set
	 * @return boolean if gm is in set
	 */
	public boolean contains(Game gm) {
		return set.contains(gm);
	}
	
	public boolean SetWon(Object other) {
		if (other instanceof Set) {
			Set that = (Set) other;

			if (this.set.size() == 6 && that.set.size() < 6) {
				return true;
			}

		}
		return false;
	}
	
	public int numSet(Player a, Player b){
		int numSet = 0;
		if(a.getSet().SetWon(b)){
			numSet++;
		}
		return numSet;	
	}
}
