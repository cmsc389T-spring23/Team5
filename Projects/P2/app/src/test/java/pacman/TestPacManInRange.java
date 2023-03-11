package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {

    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(2,2), "Andrew", Color.red);

    if (ghost.is_pacman_in_range()) {
      throw new FileNotFoundException();
    }
    PacMan leftman = frame.addPacMan(new Location(1, 2)); 
    if (!ghost.is_pacman_in_range()) {
      throw new FileNotFoundException();
    }
    
    return;
  }
}
