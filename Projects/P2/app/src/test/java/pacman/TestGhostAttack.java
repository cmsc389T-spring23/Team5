package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostAttack extends TestCase {

  public void testGhostAttack() throws FileNotFoundException {
    Mainframe frame = new Mainframe();
    PacMan pacman = frame.addPacMan(new Location(0,0));
    Ghost ghost = frame.addGhost(new Location(0,0), "clyde", ghost.colors[1]);
    if (ghost.attack() == false) {
      throw new FileNotFoundException();
    }
  }
}
