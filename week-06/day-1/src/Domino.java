import java.util.Comparator;

public class Domino implements Comparable<Domino> {
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  public int getFirstNumber() {
    return getValues()[0];
  }

  public int getSecondNumber() {
    return getValues()[1];
  }

  public int compareTo(Domino otherDomino) {

    return Comparator.comparingInt(Domino::getFirstNumber)
        .thenComparingInt(Domino::getSecondNumber)
        .compare(this, otherDomino);
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }
}