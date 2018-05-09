
public class Board {
  
  private Hex[][] hexes;
  /* TODO figure out how to implement roads and buildings */
  //private Edge[][] edges; for roads
  //private Corner[][] corners; for buildings
  
  public Board() {
    hexes = new Hex[7][];
    for(int i = 3;i < 7;i++) {
      hexes[i] = new Hex[i];
    }
    for(int i = 6;i >= 4;i++) {
      hexes[i] = new Hex[i];
    }
  }
