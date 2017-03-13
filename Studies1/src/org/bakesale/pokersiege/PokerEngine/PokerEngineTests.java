package org.bakesale.pokersiege.PokerEngine;

import static org.junit.Assert.*;

import org.bakesale.pokersiege.PokerEngine.Card.CardSuit;
import org.bakesale.pokersiege.PokerEngine.Card.CardValue;
import org.junit.Test;

public class PokerEngineTests {

	@Test
	public void testHandCreate() {
		MultiDeck deck = new MultiDeck(1);
		Hand hand = new Hand(deck);

		assertTrue(hand != null);
	}
	
	@Test
	public void testDeckCreate() 
	{
		MultiDeck deck = new MultiDeck(1);
		
		Card aceCard = new Card(CardSuit.SPADE, CardValue.ACE);
		Card sevenOfHearts = new Card(CardSuit.HEART, CardValue.SEVEN);
		
		assertTrue(deck.contains(aceCard));
		assertTrue(deck.contains(sevenOfHearts));
		
		assertTrue(deck.getNumCards() == 52);
	}
	
	@Test
	public void testDealerCreate()
	{
		Dealer dealer = new Dealer();
		
		assertTrue(dealer != null);
	}
}
