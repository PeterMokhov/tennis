package tennis;

import static java.lang.String.valueOf;

public class Score {
    private int points;
    
    public Score(int points) {
        this.points = points;
    }

    public void winsPoint() {
        int increase = 15;
        if (points == 30){
            increase = 10;
        }
        points += increase;
    }
    
   
    /**
     * gets points
     * @return points
     */
    public int getPoints() {
		return points;
	}
    

	@Override
    public String toString() {
        return valueOf(points);
    }


}
