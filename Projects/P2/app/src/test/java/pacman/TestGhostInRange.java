package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    Mainframe frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(2, 2)); 

    if (pacman.is_ghost_in_range()) {
      throw new FileNotFoundException();
    }
    Ghost leftGhost = frame.addGhost(new Location(1,2), "Andrew", Color.red);
    if (!pacman.is_ghost_in_range()) {
      throw new FileNotFoundException();
    }

    return;
  }
}
