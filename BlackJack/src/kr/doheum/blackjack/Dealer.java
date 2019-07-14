package kr.doheum.blackjack;

public class Dealer extends Gamer {
	//카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑는다.
	public void addCardMore(CardDeck cd) {
		int sum = openCards(false);
		if(sum <= 16) {
			Card c = cd.getCard();
			setCard(c);
		}
	}
}
