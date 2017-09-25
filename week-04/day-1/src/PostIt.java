public class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  //Create a few example post-it objects:
  //an orange with blue text: "Idea 1"
  //a pink with black text: "Awesome"
  //a yellow with green text: "Superb!"

  public PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  class MorePostIts {
    PostIt idea1 = new PostIt("orange", "Idea1", "blue");
    PostIt awesome = new PostIt("pink", "Awesome", "black");
    PostIt superb = new PostIt("yellow", "Superb", "green");
  }
}
