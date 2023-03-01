package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 2));

    if (!((frame.getMap().getLoc(new Location(1, 2))).contains(Map.Type.PACMAN))) {
      throw new FileNotFoundException();
    }
    
    return;
  }
}
