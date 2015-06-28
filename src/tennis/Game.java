package tennis;

import static java.lang.String.valueOf;


public class Game {
    private int games;
    private int points;
    public Game(int points, int games) {
        this.points = points;
        this.games = games;
    }


    
    public void winsGame(){
    	if(points > 40){
    		games++;
    		points = 0;
    	}
    }

    public void winsPoint() {
        int increase = 15;
        if (points == 30){
            increase = 10;
        }
        points += increase;
        if(points > 40){
        	points = 0;
        }
    }
    
   
    /**
     * gets points
     * @return points
     */
    public int getPoints() {
		return points;
	}
    

	public int getGames() {
		return games;
	}



	@Override
    public String toString() {
        return valueOf(points);
    }



	public void setGames(int games) {
		this.games = games;
	}



	public void setPoints(int points) {
		this.points = points;
	}

	

}
