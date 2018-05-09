
public class TerrainHex extends Hex {

  private Building[] buildings;
  
  public TerrainHex(Resource.Material resource,int trigger) {
    super();
    this.resource = resource;
    this.trigger = trigger;
    
    buildings = new Building[];
    for(int i = 0;i < buildings.length;i++) {
      buildings[i] = new Building();
    }
    //trail = new Road[];
    //for(int i = 0;i < trail.length;i++) {
    //  trail[i] = new Road();
    //}
  }
  
  public Resource.Material getResource() { return resource; }
  
  public boolean matchesRoll(int roll) { return trigger==roll; }
  
  public int addResource() { return getSettlements()+getCities*2; }
  private int getSettlements {
    int settlements = 0;
    for(int i = 0;i < buildings.length;i++) {
      if(buildings[i] != null)
        if(buildings[i].isASettlement())
          settlements++;
    }
    return settlements;
  }
  private int getCities {
    int cities = 0;
    for(int i = 0;i < buildings.length;i++) {
      if(buildings[i] != null)
        if(buildings[i].isACity())
          cities++;
    }
    return cities;
  }
  
  public void upgradeBuilding(int corner) { buildings[corner].upgrade(); }
  //public void buildRoad(int edge) { trail[edge].build(); }
  
}
