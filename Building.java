
public class Building {

  private int level;
  private Player owner;
  
  public Building() {
    level = 0;
  }
  
  public void upgrade() {
    if(level >= 2) {
      System.out.println("Cannot do");
      return;
    }
    level++;
  }
  
  public boolean isASettlement() { return level==1; }
  public boolean isACity() { return level==2; }
  
  public void setOwner(Player owner) { this.owner = owner; }
  public Player getOwner() { return owner; }
  
  public void give(Resource.Material resource) {
    for(int n = 0;n < level;n++) owner.add(resource);
  }
  
}
