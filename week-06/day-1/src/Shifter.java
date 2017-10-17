public class Shifter implements CharSequence {
   int howManyToShift;
   String word;

  public Shifter(String word, int howManyToShift) {
    this.word = word;
    this.howManyToShift = howManyToShift;
  }

  @Override
  public int length() {
    return word.length();
  }

  @Override
  public char charAt(int index) {
    return word.charAt(index + howManyToShift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return word.subSequence(start, end);
  }
}
