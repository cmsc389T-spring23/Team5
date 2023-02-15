package pacman;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
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

  public boolean is_ghost_in_range() {
    Location pacLoc = this.myLoc;
    Location north = new Location(pacLoc.x, pacLoc.y -1);
    Location south = new Location(pacLoc.x, pacLoc.y +1);
    Location west = new Location(pacLoc.x - 1, pacLoc.y);
    Location east = new Location(pacLoc.x + 1, pacLoc.y);

    HashSet<Type> nTypes = this.myMap.getLoc(north);
    HashSet<Type> sTypes = this.myMap.getLoc(south);
    HashSet<Type> wTypes = this.myMap.getLoc(west);
    HashSet<Type> eTypes = this.myMap.getLoc(east);
    
    if (nTypes.contains(Map.Type.GHOST) || sTypes.contains(Map.Type.GHOST) || wTypes.contains(Map.Type.GHOST)|| eTypes.contains(Map.Type.GHOST)) {
      return true;
    }

    return false;
  }

  public JComponent consume() {
    return null;
  }
}
