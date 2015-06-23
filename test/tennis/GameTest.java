package tennis;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GameTest {

    private Game game;
    private Score score;

    @Before
    public void setUp() throws Exception {
        score = mock(Score.class);
        game = new Game(score,5);
    }

    @Test
    public void playerwinsgametest() {
        score.winsPoint();
        score.winsPoint();
        score.winsPoint();
        score.getPoints();
        System.out.println(score.getPoints());
 //       verify(scoreBoard).player1Scores();
    }

//    @Test
//    public void player2ShouldScoreWhenTheFirstCharacterIs2() {
//        game.score("2");
//
//        verify(scoreBoard).player2Scores();
//    }
//
//    @Test
//    public void shouldScorePlayer1TwiceWhenThereAreTwo1s() {
//        game.score("11");
//
//        verify(scoreBoard, times(2)).player1Scores();
//    }
//
//    @Test
//    public void shouldScoreBothPlayersWhenThereIsA1AndA2() {
//        game.score("21");
//
//        verify(scoreBoard).player1Scores();
//        verify(scoreBoard).player2Scores();
//    }
}