package pacman;
import java.io.*;

import javax.xml.stream.Location;

import junit.framework.*;
import java.awt.Color;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    Mainframe frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 2));

    if (!((frame.myMap.getLoc(new Location(1, 2))).contains(Map.Type.PACMAN))) {
      throw new FileNotFoundException();
    }
    
    return;
  }
}
