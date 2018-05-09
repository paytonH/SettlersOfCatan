
public class TerrainHex implements Hex {

  private Resource.Material resource;
  private Building[] buildings;
  private int trigger;
  
  public TerrainHex(Resource.Material resource,int trigger) {
    super();
    this.resource = resource;
    this.trigger = trigger;
    
    buildings = new Building[];
    for(int i = 0;i < buildings.length;i++) {
      buildings[i] = new Building();
    }
  }
  
  public Resource.Material getResource() { return resource; }
  
  public boolean matchesRoll(int roll) { return trigger==roll; }
  
  public void addResources() {
    for(Building b:buildings) {
      b.give(resource);
    }
  }
  
  public void upgradeBuilding(int corner) { buildings[corner].upgrade(); }
  
}
