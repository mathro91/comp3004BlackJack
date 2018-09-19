package comp3004BlackJack;

public class Cards {
	private String cardRank;
	private String cardSuit;
	
	public Cards(String cardRank, String cardSuit) {
		this.cardRank = cardRank;
		this.cardSuit = cardSuit;
	}
	
	public String getcardRank() {
		return this.cardRank;
	}
	
	public String getcardSuit() {
		return this.cardSuit;
	}

}
