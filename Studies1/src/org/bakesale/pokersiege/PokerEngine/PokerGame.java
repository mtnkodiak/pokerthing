package org.bakesale.pokersiege.PokerEngine;

import java.util.ArrayList;

/**
 * a state machine...
 * @author cjjohnson
 *
 */
public class PokerGame {

	private ArrayList<Player> players;
	
	private Player currentButton;
	private Player whoseTurn;
	
	public PokerGame(int numPlayers)
	{
		players = new ArrayList<>(7);
		
		for (int i=0 ; i < numPlayers; i++)
		{
			players.add(new Player("Player" + i));
		}
		
		
	}
	
}
