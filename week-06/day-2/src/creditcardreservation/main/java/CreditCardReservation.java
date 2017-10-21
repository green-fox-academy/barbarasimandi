package creditcardreservation.main.java;
import creditcard.main.app.CreditCard;
import creditcard.main.app.CreditCardy;
import reservation.app.main.*;

public class CreditCardReservation extends CreditCard implements Reservationy {

  Reservation res;

  public CreditCardReservation() {
    res = new Reservation();
  }

  public String getDowBooking() {
    return res.getDowBooking();
  }

  public String getCodeBooking() {
    return res.getCodeBooking();
  }

  public String toString() {
    return String.format("Booking#%s %s for %s Name=ABC%s CC#=%s CVV=%d %s", res.counter, getCodeBooking(), getDowBooking(), getNameCardholder(), getCodeAccount(), getSumCVV(), printWhetherValidated());
  }
}
