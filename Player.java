public class Player {

	ArrayList<Card> cards;
	private int points;

	public Player() {
		cards = new ArrayList<Card>();
	}

	public void add(Hex.Resource r) {
		cards.add(new ResourceCard(r));
	}
	
	public boolean pay(int wood,int brick,int rock,int sheep,int wheat) {
		if(fulfils(wood,brick,rock,sheep,wheat)) {
			remove(wood,brick,rock,sheep,wheat);
			return true;
		}
		return false;
	}
	public boolean createBuilding() {
		return pay(1,1,0,1,1);
	}
	public boolean upgradeBuilding() {
		return pay(0,0,3,2,0);
	}
	public boolean createRoad() {
		return pay(1,1,0,0,0);
	}
	public boolean getDevelopment() {
		return pay(0,0,1,1,1);
	}
}
