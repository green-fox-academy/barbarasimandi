//public class ArgumentHandler {
//
//  FileManipulation file;
//
//  public void inspectArgs(String[] args) {
//    file = new FileManipulation();
//    if (args.length == 0) {
//      file.listMenu();
//    }
//    else if (args[0].equals("-l")) {
//      file.listTasks();
//    }
//    else if (args[0].equals("-a")) {
//      try {
//        file.addTask(args[1]);
//      } catch (ArrayIndexOutOfBoundsException e) {
//        System.out.println("Unable to add: no task provided");
//      }
//    }
//    else if (args[0].equals("-r")) {
//      try {
//        file.removeTask(args[1]);
//      } catch (ArrayIndexOutOfBoundsException ex) {
//        System.out.println("Unable to remove: no index provided");
//      } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Unable to remove: index is out of bound");
//      } catch (NumberFormatException ex) {
//        System.out.println("Unable to remove: index is not a number");
//      }
//    }
//    else if( args[0].equals("-c")) {
//      try {
//        for (int i = 0; i < file.taskList.size(); i++) {
//          file.taskList.get(i).complete(args[1]);
//        }
//      } catch (ArrayIndexOutOfBoundsException e) {
//        System.out.println("Unable to check: no index provide");
//      } catch (IndexOutOfBoundsException e) {
//        System.out.println("Unable to check: index is out of bound");
//      } catch (NumberFormatException e) {
//        System.out.println("Unable to check: index is not a number");
//      }
//    }
//    else {
//      System.out.println("Unsupported argument\n");
//      file.listMenu();
//    }
//  }
//
//}
