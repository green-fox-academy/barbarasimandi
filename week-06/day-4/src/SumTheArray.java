public class SumTheArray {

  public <T extends Number> T sumTheArray(T[] inputArray, int length) {

    if (length > inputArray.length || length <= 0 || inputArray.length == 0)
      throw new IllegalArgumentException("Illegal argument");

    if (inputArray instanceof Integer[]) {             //Integer case
      Integer sum = 0;
      for (int i = 0; i < length; i++)
        sum += inputArray[i].intValue();
      return (T) sum;
    }

    else if (inputArray instanceof Float[]) {          //Float case
      Float sum = (float)0;
      for (int i = 0; i < length; i++)
        sum += inputArray[i].floatValue();
      return (T) sum;
    }

    else if (inputArray instanceof Double[]) {         //Double case
      Double sum = (double)0;
      for (int i = 0; i < length; i++)
        sum += inputArray[i].doubleValue();
      return (T) sum;
    }
    return null;     //there are three other cases from the Number class: long, byte, short, which could be other 'else if's
  }
}
