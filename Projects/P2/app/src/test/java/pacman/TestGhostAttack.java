package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostAttack extends TestCase {

  public void testGhostAttack() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(0,0));
    Ghost ghost = frame.addGhost(new Location(1,0), "clyde", Color.RED);
    if (ghost.attack() == false) {
      throw new FileNotFoundException();
    }
  }
}
