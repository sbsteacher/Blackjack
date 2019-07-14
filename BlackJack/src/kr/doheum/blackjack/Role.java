package kr.doheum.blackjack;

public class Role {
	//점수 측정
	public static int calcScore(Gamer g) {
		int sum = g.openCards(false);
		System.out.printf("점수 : %d\n", sum);
		return sum;
	}
	
	public static void whoIsWin(Gamer g, Dealer d) {
		int gamerSum = calcScore(g);
		int dealerSum = calcScore(d);
		
		if((gamerSum > 21 && dealerSum > 21) || (gamerSum == dealerSum)) {
			System.out.println("비겼습니다.");
			
		} else if(gamerSum > 21) {
			System.out.println("딜러가 이겼습니다.");
			
		} else if(dealerSum > 21) {
			System.out.println("게이머가 이겼습니다.");
			
		} else {
			if(gamerSum > dealerSum) {
				System.out.println("게이머가 이겼습니다.");
			} else {
				System.out.println("딜러가 이겼습니다.");	
			}
		}
	}
}
