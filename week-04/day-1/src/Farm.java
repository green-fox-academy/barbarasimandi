import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> farm;
  int slot;

  public Farm (Integer slot) {
    this.slot = slot;
    this.farm = new ArrayList<>();
  }

  public void breed(Animal animal) {
    if (farm.size() < slot) {
      farm.add(animal);
    }
  }

  public void slaughter() {
    for (int i = 0; i < farm.size() - 1; i++) {
      for (int j = i + 1; j < farm.size(); j++) {
        if (farm.get(i).hunger > farm.get(j).hunger) {
          farm.remove(farm.get(i));
        }
      }
    }
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < farm.size(); i++) {
      result += farm.get(i) + "\n";
    }
    return result;
  }
}
