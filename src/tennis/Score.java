package tennis;

import static java.lang.String.valueOf;

public class Score {
    private int points;
    private int games;
    public Score(int points, int games) {
        this.points = points;
        this.games = games;
    }

    public void winsPoint() {
        int increase = 15;
        if (points == 30){
            increase = 10;
        }

        points += increase;
    }
    
    public void winsGame(){
    	games++;
    }

    @Override
    public String toString() {
        return valueOf(points);
    }
}
