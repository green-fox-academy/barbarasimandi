public class Gnirt implements CharSequence {

  String word;

  public Gnirt(String word) {
    this.word = word;
  }

  @Override
  public int length() {
    return word.length();
  }

  @Override
  public char charAt(int index) {
    return word.charAt(word.length() - 1 - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return word.subSequence((word.length() - 1 - end), (word.length() - start));
  }
}
