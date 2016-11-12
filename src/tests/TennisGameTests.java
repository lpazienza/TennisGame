package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import esercizio2.*;

public class TennisGameTests {
	Player player1, player2;
	TennisGame aMatch;
	
	@Before
	public void setUp(){
		player1 = new Player("Player 1");
		player2 = new Player("Player 2");
		aMatch = new TennisGame(player1,player2);
	}
	
	@Test
	public void isMatchFinishedAfterAPlayerGains4points() {
		//act
		aMatch.playMatch();
		//assert
		assertTrue(aMatch.getStato());
	}
	
	@Test
	public void OnlyTheWinnerPlayerHas4Points(){
		//act
		aMatch.playMatch();
		//assert
		assertFalse(player1.getPunteggio()==4 && player2.getPunteggio()==4);
	}
	
	@Test
	public void has4PointsWinnerPlayer(){
		//act
		aMatch.playMatch();
		//assert
		assertTrue(player1.getPunteggio()==4 || player2.getPunteggio()==4);
	}
	
	@Test
	public void test(){
		//act
		aMatch.playMatch();
		//asserts
		if(player1.getPunteggioOltranza() == 0 && player2.getPunteggioOltranza()==0){
			assertTrue(aMatch.getStato());
		}
		else
			assertTrue(player1.getPunteggioOltranza() - player2.getPunteggioOltranza() == 2 || player2.getPunteggioOltranza() - player1.getPunteggioOltranza() == 2);
	}

}
