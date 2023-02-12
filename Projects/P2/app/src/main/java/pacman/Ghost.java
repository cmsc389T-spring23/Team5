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
    ArrayList<Location> valid_moves = get_valid_moves();

    if (valid_moves.size() == 0) {
      return false;
    }

    Location new_location = valid_moves.get(0);
    boolean success = myMap.move(myName, new_location, Map.Type.GHOST);

    if (!success) {
      return false;
    }

    myLoc = new_location;
    return true;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
