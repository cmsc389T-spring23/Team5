package pacman;
import java.util.ArrayList;
import java.util.HashSet;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_pacman_in_range() {
    Location ghostLoc = this.myLoc;
    Location north = new Location(ghostLoc.x, ghostLoc.y -1);
    Location south = new Location(ghostLoc.x, ghostLoc.y +1);
    Location west = new Location(ghostLoc.x - 1, ghostLoc.y);
    Location east = new Location(ghostLoc.x + 1, ghostLoc.y);

    HashSet<Type> nTypes = this.myMap.getLoc(north);
    HashSet<Type> sTypes = this.myMap.getLoc(south);
    HashSet<Type> wTypes = this.myMap.getLoc(west);
    HashSet<Type> eTypes = this.myMap.getLoc(east);
    
    if (nTypes.contains(Map.Type.PACMAN) || sTypes.contains(Map.Type.PACMAN) || wTypes.contains(Map.Type.PACMAN)|| eTypes.contains(Map.Type.PACMAN)) {
      return true;
    }
    return false;
  }

  public boolean attack() {
    return false;
  }
}
