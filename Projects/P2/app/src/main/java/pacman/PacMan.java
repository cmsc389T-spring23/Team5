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
    return false;
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
