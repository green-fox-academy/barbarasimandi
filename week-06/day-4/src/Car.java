public class Car {

  public enum Type {FIAT, JUSTABIKE, CITROEN, PEUGEOT, MERCEDES, BMW}
  public enum Color {GREEN, YELLOW, BLUE, BLACK, WHITE, BROWN}
  String type;
  String color;

  public Car() {
      type = getARandomType();
      color = getARandomColor();
  }

    public String getARandomType() {
    return Type.values()[(int)(Math.random() * (Type.values().length))].toString();
    }

    public String getARandomColor() {
      return Color.values()[(int)(Math.random() * Color.values().length)].toString();
    }

    @Override
    public String toString() {
    return type + ": " + color;
    }

}
