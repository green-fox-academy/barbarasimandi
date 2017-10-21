package creditcardreservation.main.java;
import creditcard.main.app.CreditCard;
import creditcard.main.app.CreditCardy;
import reservation.app.main.*;

public class CreditCardReservation implements CreditCardy, Reservationy {

  Reservation res;
  CreditCard card;

  public CreditCardReservation() {
    res = new Reservation();
    card = new CreditCard();
  }

  public String getDowBooking() {
    return res.getDowBooking();
  }

  public String getCodeBooking() {
    return res.getCodeBooking();
  }

  public int getSumCVV() {
    return card.getSumCVV();
  }

  public String getNameCardholder() {
    return card.getNameCardholder();
  }

  public String getCodeAccount() {
    return card.getCodeAccount();
  }
  
  public int cumeSumCVV(String codeAccount) {
    return card.cumeSumCVV(card.getCodeAccount());
  }

  public String toString() {
    return String.format("Booking#%s %s for %s Name=ABC%s CC#=%s CVV=%d %s", res.counter, getCodeBooking(), getDowBooking(), getNameCardholder(), getCodeAccount(), getSumCVV(),
        card.printWhetherValidated());
  }
}
