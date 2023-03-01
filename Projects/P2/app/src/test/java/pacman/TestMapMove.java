package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    Mainframe frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 2));

    boolean result = frame.myMap.move("pacman", new Location(1,5), frame.myMap.Type.PACMAN);
    if(!result) {
      throw new FileNotFoundException();
    }
  }
}
