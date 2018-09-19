package comp3004BlackJack;

import junit.framework.TestCase;

public class CardTest extends TestCase {
	public void testRank() {
		for(int i=3; i<=10;i++) {
			Cards cards = new Cards("H",String.valueOf(i));
			assertEquals(String.valueOf(i),cards.getcardRank());
			
		}
		
		Cards cards = new Cards("H","A");
		assertEquals("A",cards.getcardRank());
		
		cards = new Cards("H","K");
		assertEquals("K",cards.getcardRank());
		
		cards = new Cards("H","Q");
		assertEquals("A",cards.getcardRank());
		
		cards = new Cards("H","J");
		assertEquals("",cards.getcardRank());
	}
	
	public void testSuit() {
		Cards cards = new Cards("C", "3");
		assertEquals("C", cards.getcardSuit());
		
		cards= new Cards("S","3");
		assertEquals("S", cards.getcardSuit());
		
		cards= new Cards("D","3");
		assertEquals("D", cards.getcardSuit());
		
		cards= new Cards("H","3");
		assertEquals("H", cards.getcardSuit());
		
	}

}
