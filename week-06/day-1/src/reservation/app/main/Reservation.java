package reservation.app.main;

import java.util.ArrayList;

public class Reservation implements Reservationy {

  static String[] LETTERSANDNUMERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "G", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
  String reservationCode;
  static String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
  String reservationDay;

  public Reservation() {
    this.reservationDay = getDowBooking();
    this.reservationCode = getCodeBooking();
    System.out.println("Booking# " + reservationCode + " for " + reservationDay);
  }

  public String getDowBooking() {
    int random = (int)(Math.random()* DOW.length - 1);
    String day = DOW[random];
    return day;
  }

  public String getCodeBooking() {
    StringBuilder eight = new StringBuilder();
    for (int i = 0; i < 7; i++) {
      int random = (int)(Math.random()* LETTERSANDNUMERS.length - 1);
      eight.append(LETTERSANDNUMERS[random]);
    }
    return eight.toString();
  }
}
