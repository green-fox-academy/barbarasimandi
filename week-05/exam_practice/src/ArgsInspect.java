public class ArgsInspect {

  String[] args;
  ListManipulating listing = new ListManipulating();

  public void inspectArgs(String[] args) {
    if (args.length == 0) {
      listing.listingTxt();
    }

    else if (args[0].equals("-a")) {
      listing.append(args[1]);
    }
  }
}

