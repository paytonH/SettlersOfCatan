
public class ResourceCard {

	private Hex.Resource resource;

	public ResourceCard(Hex.Resource r) {
		resource = r;
	}
	
	public boolean isResource(int r) {
		int[] resources = Hex.Resource.values();
		return resources[r]==resource;
	}

}
