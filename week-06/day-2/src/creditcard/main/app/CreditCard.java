package creditcard.main.app;

import java.util.ArrayList;

public class CreditCard implements CreditCardy {

  int sumCVV;
  String nameCardholder;
  String codeAccount;
  int cumeCodeAccount;
  private static int increasingNumber = 0;
  int number;

  public CreditCard() {
    sumCVV = getSumCVV();
    nameCardholder = getNameCardholder();
    codeAccount = getCodeAccount();
    cumeCodeAccount = getSumCVV();
    number = increasingNumber++;
  }

  public int getSumCVV() {
    return 0;
  }

  public String getNameCardholder() {
    return String.valueOf(number);
  }

  public String getCodeAccount() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 15; i++) {
      int nr = (int)(Math.random()*9);
      sb.append(nr);
    }
    return sb.toString();
  }

  public int cumeSumCVV(String codeAccount) {
    codeAccount = getCodeAccount();
    int sum = 0;
    for (int i = 0; i < codeAccount.length(); i++) {
      int num = Integer.parseInt(String.valueOf(codeAccount.charAt(i)));
      sum += num;
    }
    return sum;
  }

  public boolean check(String codeAccount) {
    codeAccount = getCodeAccount();
    ArrayList<Integer> digits = new ArrayList<>();
    int sum = 0;
    for (int i = 0; i < codeAccount.length(); i++) {
      digits.add(Integer.parseInt(String.valueOf(codeAccount.charAt(i))));
    }
    int length = digits.size();

    for (int i = 0; i < length; i++) {
      // get digits in reverse order
      int digit = digits.get(length - i - 1);
      // every 2nd number multiply with 2
      if (i % 2 == 1) {
        digit *= 2;
      }
      sum += digit > 9 ? digit - 9 : digit;
    }
    return sum % 10 == 0;
  }

  public String printWhetherValidated() {
  return check(codeAccount) ? "(validated)" : "(not validated)";
  }

  public String toString() {
    return String.format("Name=ABC" + getNameCardholder() + " CC#=" + getCodeAccount() + " CVV=" + cumeSumCVV(codeAccount) + " " + printWhetherValidated());
  }
}
