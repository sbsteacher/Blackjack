package kr.doheum.blackjack;

public class Card {
	public static final String[] shapes = {"spade", "heart", "clover", "diamond"};
	public static final String[] markers = {"A", "J", "Q", "K"};
	public static final int MAX_NO = 13;
	
	private String shape; //spade, heart, clover, diamond
	private String marker; //A, 2~10, J, Q, K
	private int score;
	
	public Card(String shape, int no) {
		setShape(shape);
		createMarkerScore(no);
	}
	
	public String getShape() {
		return shape;
	}
	
	private void setShape(String shape) {
		for(int i=0; i<shapes.length; i++) {
			if(shape.equals(shapes[i])) {
				this.shape = shape;
				return;
			}
		}
		this.shape = "";
	}
	
	public String getMarker() {
		return marker;
	}
	
	private void createMarkerScore(int no) { //마커, 스코어 처리용
		if(no == 1) { //A
			setMarker("A");
			setScore(no);
			
		} else if(no >= 2 && no <= 10) { //B
			String sNo = Integer.toString(no);
			setMarker(sNo);
			setScore(no);
			
		} else if(no <= 13) { //C			
			if(no == 11) { //(J)
				setMarker("J");				
			} else if (no == 12) { //(Q)
				setMarker("Q");
			} else if (no == 13) { //(K)
				setMarker("K");
			}
			setScore(10);
		} else { //D
			setScore(0);
			setMarker("");
		}	
	}
	
	private void setMarker(String marker) { //1~13 스트링		
		this.marker = marker;
	}
	public int getScore() {
		return score;
	}
	private void setScore(int score) {
		this.score = score;
	}	
	
	@Override
	public String toString() {
		return shape + " : " + marker + " : " + score; 
	}
	
}













