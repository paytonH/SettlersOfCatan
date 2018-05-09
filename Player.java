public class Player {

	ArrayList<Card> cards;
	private int points;

	public Player() {
		cards = new ArrayList<Card>();
	}
	public void add(Hex.Resource r) {
		cards.add(new ResourceCard(r));
	}

}
