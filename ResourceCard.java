
public class ResourceCard extends Card {

	private Hex.Resource resource;
	public ResourceCard(Hex.Resource resource) {
		this.resource = resource;
	}

	public boolean isWood() { return resource==Hex.Resource.Wood }

}
