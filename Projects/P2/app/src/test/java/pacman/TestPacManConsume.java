package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManConsume extends TestCase {

  public void testPacManConsume() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(7,9));
    if (frame.getMap().eatCookie("pacman") == null) {
      throw new FileNotFoundException();
    }
  }
}
