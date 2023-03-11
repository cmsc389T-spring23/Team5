package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 2));

    boolean result = frame.getMap().move("pacman", new Location(1,5), Map.Type.PACMAN);
    if(!result) {
      throw new FileNotFoundException();
    }
  }
}
