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
    ArrayList<Location> moves = new ArrayList<Location>();
    Location up = this.myLoc.shift(0,-1);
    Location down = this.myLoc.shift(0,1);
    Location left = this.myLoc.shift(-1,0);
    Location right = this.myLoc.shift(1,0);

    if(!myMap.getLoc(up).contains(Map.Type.WALL)){
      moves.add(up);
    }
    if(!myMap.getLoc(down).contains(Map.Type.WALL)){
      moves.add(down);
    }
    if(!myMap.getLoc(left).contains(Map.Type.WALL)){
      moves.add(left);
    }
    if(!myMap.getLoc(right).contains(Map.Type.WALL)){
      moves.add(right);
    }
  
    return moves;
  }

  public boolean move() {
    ArrayList<Location> valid_moves = get_valid_moves();

    if (valid_moves.size() == 0) {
      return false;
    }

    Location new_location = valid_moves.get(0);
    boolean success = myMap.move(myName, new_location, Map.Type.PACMAN);

    if (!success) {
      return false;
    }

    myLoc = new_location;
    return true;
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
    if (Map.myLoc(this.myLoc).contains(Type.COOKIE)) {
      return Map.eatCookie("consume");
    } else {
      return null;
    }
  }
}
