package org.bakesale.pokersiege.PokerEngine;

public class Card implements Comparable<Card>{

	public enum CardSuit {SPADE, CLUB, DIAMOND, HEART};
	public enum CardValue {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

	private CardSuit suit;
	private CardValue value;
		
	public Card(CardSuit suit, CardValue value)
	{
		this.suit = suit;
		this.value = value;
	}
	
	public CardSuit getSuit() {
		return suit;
	}
	public void setSuit(CardSuit suit) {
		this.suit = suit;
	}
	public CardValue getValue() {
		return value;
	}
	public void setValue(CardValue value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Card) 
		{
			Card cardIn = (Card)obj;
			if (cardIn.compareTo(this) == 0)
				return true;
			else
				return false;
		}
		return super.equals(obj);
	}

	@Override
	public int compareTo(Card cardIn) {
		//same value?
		if (this.value == cardIn.value )
		{
			if (this.suit.ordinal() == cardIn.suit.ordinal())
			{
				return 0; //same card!
			}
			if (this.suit.ordinal() < cardIn.suit.ordinal()) 
			{
				return -1;
			} else 
			{
				return 1;
			}
		}
		if (this.value.ordinal() < cardIn.value.ordinal())
		{
			return -1;
		}
		else 
		{
			return 1;
		}
	}
}
