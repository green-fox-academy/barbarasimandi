public class GnitrMain {

  public static void main(String[] args) {

    Gnirt gnirt = new Gnirt("kiscica");

    System.out.println(gnirt.length());
    System.out.println(gnirt.charAt(1));
    System.out.println(gnirt.subSequence(0, 6));

    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));

  }

}
