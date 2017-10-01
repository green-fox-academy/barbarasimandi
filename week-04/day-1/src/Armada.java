import java.util.ArrayList;
import java.util.Collections;

public class Armada {

  ArrayList<Ship> armada;

  public void fillArmada() {
    // filling up with random number ships.
    int random = (int) (Math.random()*10);
    for (int i = 0; i < random; i++) {
      armada.add(new Ship());
    }
  }

  public ArrayList<Integer> getArmadaStrength() {
    armada = new ArrayList<>();
    ArrayList<Integer> strength = new ArrayList<>();
    for (int i = 0; i < armada.size(); i++) {
      strength.add(armada.get(i).score());
    } return strength;
  }       // returns an ArrayList<Integer> with the Ships' strength.

// Stuck at using merge sort for two armadas.
  public boolean war(ArrayList<Ship> otherArmada) {         //I should use Armada otherArmada rather than ArrayList<Ship> otherArmada
    for (int i = 0; i < armada.size(); i++) {               // but that doesn't have a size().
      for (int j = 0; j < otherArmada.size(); j++) {
        if (j == otherArmada.size() || armada.get(i).score() > otherArmada.get(j).score()) {
          armada.add(i, otherArmada.get(j));
        }
      }
    } return true;
  }
}

