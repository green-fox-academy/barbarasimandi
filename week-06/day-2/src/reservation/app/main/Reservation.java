package reservation.app.main;

public class Reservation implements Reservationy {

  static String[] LETTERSANDNUMERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "G", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
  static String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  public static int counter;
  String reservationCode;
  String reservationDay;
  private static int numberToIncrease = 0;

  public Reservation() {
    reservationDay = getDowBooking();
    reservationCode = getCodeBooking();
    counter = ++numberToIncrease;

  }

  public String getDowBooking() {
    int random = (int)(Math.random() * DOW.length - 1);
    return DOW[random];
  }

  public String getCodeBooking() {
    StringBuilder eightCharacter = new StringBuilder();
    for (int i = 0; i < 7; i++) {
      int random = (int)(Math.random() * LETTERSANDNUMERS.length - 1);
      eightCharacter.append(LETTERSANDNUMERS[random]);
    }
    return eightCharacter.toString();
  }

  @Override
  public String toString() {
      return String.format("Booking#%s %s for %s", counter, getCodeBooking(), getDowBooking());
    }
  }

