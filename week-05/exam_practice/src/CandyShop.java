import java.util.ArrayList;

public class CandyShop {

  int sugarAmount;
  double income;
  ArrayList<Dessert> storage;
  final static String CANDY = "candy";
  final static String LOLLIPOP = "lollipop";

public CandyShop(int sugarAmountGrams) {
  sugarAmount = sugarAmountGrams;
  income = 0;
  storage = new ArrayList<>();
  }

  public void createSweets(String dessertType) {
    if (dessertType.equals("candy")) {
      storage.add(new Candy());
    } else {
      storage.add(new Lollipop());
    }
    sugarAmount -= storage.get(storage.size() - 1).sugar;
  }

  public void raise(int percentage) {
    for (Dessert dessert : storage) {
      dessert.raisePrice(percentage);
    }
  }

  public void sell(String dessertType, int amount) {
      for (int i = 0; i < amount; i++) {
        if (getDessert(dessertType) == null) {
          break;
        }
        income += getDessert(dessertType).price;
        storage.remove(getDessert(dessertType));
      }
  }

  public Dessert getDessert(String dessertType) {
    for (int i = 0; i < storage.size(); i++) {
      if (storage.get(i) instanceof Lollipop && dessertType.equals("lollipop")) {
        return storage.get(i);
      }
      else if (storage.get(i) instanceof Candy && dessertType.equals("candy")) {
        return storage.get(i);
      }
    }
    return null;
  }

  public void buySugar(int amount) {
    sugarAmount += amount;
    income -= 0.1 * amount;
  }

  private int dessertCounter(String dessertType) {
    int counter = 0;
    for (int i = 0; i < storage.size(); i++) {
      if (storage.get(i) instanceof Lollipop && dessertType.equals("lollipop")) {
        counter++;
      }
      else if (storage.get(i) instanceof Candy && dessertType.equals("candy")) {
        counter++;
      }
    }

    return counter;
  }

  @Override
  public String toString() {
    return "Inventory: " + dessertCounter(CANDY) + " candies, " + dessertCounter(LOLLIPOP) + " lollies, Income: " + income + ", Sugar: " + sugarAmount;
  }
}
