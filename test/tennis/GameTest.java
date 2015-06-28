package tennis;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;



import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GameTest {

    private Game gametest;

    @Before
    public void setUp() throws Exception {
        gametest = new Game(30,5);
    }

    @Test
    public void winsGameTest() {
    	assertEquals(5, gametest.getGames());
    	gametest.setPoints(50);
    	gametest.winsGame();
    	assertEquals(6, gametest.getGames());
}
    
    @Test
    public void winsPoint(){
    	gametest.winsPoint();
    	assertEquals(40, gametest.getPoints());
    	gametest.winsPoint();
    	assertEquals(0, gametest.getPoints());
    	gametest.winsPoint();
    	assertEquals(15, gametest.getPoints());
    }
    
    
}