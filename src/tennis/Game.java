package tennis;

//
public class Game {
    private Score score;
    private int games;
    public Game(Score score, int games) {
        this.score = score;
        this.games = games;
    }


    
    public void winsGame(){
    	if(score.getPoints() > 40){
    		games++;
    	}
    }




}
