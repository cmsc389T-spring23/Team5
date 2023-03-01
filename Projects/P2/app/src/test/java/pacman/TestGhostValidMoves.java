package pacman;
import java.io.*;
import java.util.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(0, 0), "name", Color.red);
    ArrayList<Location> moves = ghost.get_valid_moves();
    if(moves.size() != 2){
      throw new FileNotFoundException();
    }
  }
}
