package kr.doheum.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	private List<Card> myCards = new ArrayList();
	
	//카드 한장 받기
	public void setCard(Card c) {
		myCards.add(c);
	}
	
	//카드 오픈
	public int openCards(boolean isShow) {
		int sum = 0;
		for(Card c : myCards) {
			sum += c.getScore();
			if(isShow) {
				System.out.println(c);	
			}
		}
		return sum;
	}
	
}
