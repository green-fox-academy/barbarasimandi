
public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost() {
    this.authorName = "";
    this.title = "";
    this.text = "";
    this.publicationDate = "";
  }

  @Override
  public String toString() {
    return "Author: " + authorName + "\nTitle: " + title + "\nText: " + text + "\nReleased: " + publicationDate + "\n";
  }
}