package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 2));

    if (pacman.get_valid_moves().size() > 0) {
      Location prev = pacman.myLoc;
      if (!pacman.move()) {
        throw new FileNotFoundException();
      } else if (pacman.myLoc == prev) {
        throw new FileNotFoundException();
      }
    } else {
      if (pacman.move()) {
        throw new FileNotFoundException();
      }
    }
    
    return;
  }
}
