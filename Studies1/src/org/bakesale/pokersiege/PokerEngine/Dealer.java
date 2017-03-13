package org.bakesale.pokersiege.PokerEngine;

import java.util.ArrayList;

public class Dealer {
	
	private MultiDeck deck;
	
	public enum HANDRANK {NOTHING, PAIR, TWO_PAIR, THREE_OF_A_KIND, STRAIGHT, FLUSH, FULL_HOUSE, STRAIGHT_FLUSH, FOUR_OF_A_KIND};

	private ArrayList<Player> players;
	
	private PokerGame game;
	
}
