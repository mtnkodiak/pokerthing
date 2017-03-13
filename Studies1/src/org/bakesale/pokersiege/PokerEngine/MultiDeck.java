package org.bakesale.pokersiege.PokerEngine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.bakesale.pokersiege.PokerEngine.Card.CardSuit;
import org.bakesale.pokersiege.PokerEngine.Card.CardValue;

public class MultiDeck implements Collection<Card> {

	private List<Card> deck;
	
	private static int NUMDECKS=1;

	private Random generator;
	
	public MultiDeck(int numDecks)
	{
		deck = new ArrayList<>();
		reset();
	}
	
	/**
	 * resets deck to shuffled, complete deck
	 */
	public void reset() 
	{
		deck = new ArrayList<>();
		
		int index = 0;
		for (CardValue value : CardValue.values())
		{
			for (CardSuit suit : CardSuit.values())
				{
					deck.add(new Card(suit, value));
				}
		}
		
		shuffle();
		
	}
	
	private void shuffle() {
		
		generator = new Random(System.currentTimeMillis());
		Card temp;
		
		for (int i=0; i<100; i++) 
		{
			int cardIndexToSwap1 = generator.nextInt(deck.size());
			int cardIndexToSwap2 = generator.nextInt(deck.size());
			
			Collections.swap(deck, cardIndexToSwap1, cardIndexToSwap2);
		}
		
	}

	public Card draw() {		
		return deck.remove(generator.nextInt(deck.size()));
	}

	@Override
	public boolean add(Card e) {
		return deck.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends Card> c) {
		return deck.addAll(c);
	}

	@Override
	public void clear() {
		deck.clear();
	}

	@Override
	public boolean contains(Object o) {
		return deck.contains((Card)o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return deck.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return deck.isEmpty();
	}

	@Override
	public Iterator<Card> iterator() {
		return deck.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return deck.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return deck.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return deck.retainAll(c);
	}

	@Override
	public int size() {
		return deck.size();
	}

	@Override
	public Object[] toArray() {
		return deck.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return deck.toArray(a);
	}

	public int getNumCards() {
		return deck.size();
	}

}
