package pacman;
import java.io.*;
import java.util.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

    //Creating Players
    PacMan pacman = frame.addPacMan(new Location(0, 0));
    ArrayList<Location> moves = pacman.get_valid_moves();
    if(moves.size() != 2){
      throw new FileNotFoundException();
    }
  }
}
