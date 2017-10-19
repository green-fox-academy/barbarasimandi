public class Car {

  public enum Type {FIAT, JUSTABIKE, CITROEN, PEUGEOT, MERCEDES, BMW}
  public enum Color {GREEN, YELLOW, BLUE, BLACK, WHITE, BROWN}
  Type type;
  Color color;

  public Car() {
      type = getARandomType();
      color = getARandomColor();
  }

    public Type getARandomType() {
    return Type.values()[(int)(Math.random() * (Type.values().length))];
    }

    public Color getARandomColor() {
      return Color.values()[(int)(Math.random() * Color.values().length)];
    }

    @Override
    public String toString() {
    return type.toString() + ": " + color.toString();
    }

}
