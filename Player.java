public class Player {

	ArrayList<Card> cards;
	private int points;

	public Player() {
		cards = new ArrayList<Card>();
	}

	public void add(Hex.Resource r) {
		cards.add(new ResourceCard(r));
	}
	
	private boolean pay(int wood,int brick,int rock,int sheep,int wheat) {
		if(fulfils(wood,brick,rock,sheep,wheat)) {
			remove(wood,brick,rock,sheep,wheat);
			return true;
		}
		return false;
	}
	private boolean fulfils(int w,int b,int r,int s,int wh) {
		int wood,brick,rock,sheep,wheat;
		for(Card rc:cards) {
			if(rc.isAResource()) {
				if(((ResourceCard) rc).isWood()) wood++;
				if(((ResourceCard) rc).isBrick()) brick++;
				if(((ResourceCard) rc).isRock()) rock++;
				if(((ResourceCard) rc).isSheep()) sheep++;
				if(((ResourceCard) rc).isWheat()) wheat++;
			}
		}
		return wood>=w && brick>=b && rock>=r && sheep>=s && wheat>=wh;
	}
	private void remove(int w,int b,int r,int s,int wh) {
		for(int i = cards.size()-1;i >= 0;i--) {
			if(rc.isAResource()) {
				if(w > 0 && ((ResourceCard) rc).isWood()) {
					cards.remove(i);
					w--;
				}
				if(b > 0 && ((ResourceCard) rc).isBrick()) {
					cards.remove(i);
					b--;
				}
				if(r > 0 && ((ResourceCard) rc).isRock()) {
					cards.remove(i);
					r--;
				}
				if(s > 0 && ((ResourceCard) rc).isSheep()) {
					cards.remove(i);
					s--;
				}
				if(wh > 0 && ((ResourceCard) rc).isWheat()) {
					cards.remove(i);
					wh--;
				}
			}
		}
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
