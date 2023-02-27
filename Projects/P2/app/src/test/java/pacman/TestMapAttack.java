package pacman;
import junit.framework.*;
import java.io.*;
import java.awt.Color;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    Mainframe frame = new MainFrame();
    Ghost ghost = frame.addGhost(new Location(2,2), "Andrew", Color.red);

    if (ghost.myMap.attack(ghost.myName)) {
      throw new FileNotFoundException();
    }
    PacMan leftman = frame.addPacMan(new Location(1, 2)); 
    if (!ghost.myMap.attack(ghost.myName)) {
      throw new FileNotFoundException();
    }

    return;
  }
}
