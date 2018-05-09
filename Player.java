public class Player {

	ArrayList<Card> cards;
	private int points;

	public Player() {
		cards = new ArrayList<Card>();
	}

	public void add(Hex.Resource r) {
		cards.add(new ResourceCard(r));
	}
	
	private boolean pay(int... resources) {
		if(fulfils(resources)) {
			remove(resources);
			return true;
		}
		return false;
	}
	private boolean fulfils(int... resources) {
		int[] r = new int[resources.length];
		for(int i = 0;i < r.length;i++) r[i] = 0;
		for(Card rc:cards) {
			if(rc.isAResource()) {
				for(int i = 0;i < r.length;i++) {
					if(((ResourceCard) rc).isResource(i)) r[i]++;
				}
			}
		}
		for(int i = 0;i < r.length;i++) if(r[i] < resources[i]) return false;
		return true;
	}
	private void remove(int... r) {
		for(int i = cards.size()-1;i >= 0;i--) {
			if(rc.isAResource()) {
				for(int j = 0;j < r.length;j++) {
					if(r[j] > 0 && ((ResourceCard) rc).isResource(j)) {
						cards.remove(i);
						r[j]--;
					}
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
