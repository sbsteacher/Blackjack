package kr.doheum.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> cards = new ArrayList();
	
	public CardDeck() {
		for(int i=0; i<Card.shapes.length; i++) {			
			for(int z=1; z<=Card.MAX_NO; z++) {
				Card c = new Card(Card.shapes[i], z);
				cards.add(c);	
			}
		}
	}
	
	public Card getCard() {
		if(cards.size() == 0) {
			return null;
		}
		
		int randomIdx = (int)(Math.random() * cards.size());//0~51		
		Card c = cards.get(randomIdx);
		cards.remove(c);
		return c;
	}
}












