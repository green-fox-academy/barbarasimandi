public abstract class EggLayer extends Animal {

  public EggLayer(String name) {
    super(name);
  }

  String wantChild() {
    return "want child from an egg.";
  }
}
