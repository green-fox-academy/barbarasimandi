public class SumTheArrayMain {
  public static void main(String[] args) {

    SumTheArray sumTheArrayInstance = new SumTheArray();

    Integer[] intArray = {3, 6, 1, 7, 2, 4, 5};
    Double[] doubleArray = {6.1, 2.1, 4.3, 4.4};
    Float[] floatArray = {6.24f, 12.53f, 29.0000f};

    System.out.println(sumTheArrayInstance.sumTheArray(intArray, 4));
    System.out.println(sumTheArrayInstance.sumTheArray(doubleArray, 2));

    try {
      System.out.println(sumTheArrayInstance.sumTheArray(doubleArray, 0));
    } catch (IllegalArgumentException e) {
      System.out.println("The given length parameter is not acceptable");
    }

    System.out.println(sumTheArrayInstance.sumTheArray(floatArray, 2));
  }
}
