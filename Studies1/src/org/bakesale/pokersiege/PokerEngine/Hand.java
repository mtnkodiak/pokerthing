package org.bakesale.pokersiege.PokerEngine;

import java.util.ArrayList;

public class Hand implements Comparable<Card>{

	private static int NUM_CARDS = 5;
	
	private ArrayList<Card> hand;
	
	public Hand(MultiDeck deck)
	{
		hand = new ArrayList<Card>(NUM_CARDS);
		
		for (int i=0; i<5; i++)
		{
			hand.add(deck.draw());
		}
	}
	
	@Override
	public int compareTo(Card arg0) {
		return 0;
	}

	public int getNumCards() {
		return hand.size();
	}
}
