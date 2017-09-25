
public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost() {
    this.authorName = "John Doe";
    this.title = "Lorem Ipsum";
    this.text = "Lorem ipsum dolor sit amet.";
    this.publicationDate = "2000.05.04";
  }

  public static void main(String[] args) {
  BlogPost basic = new BlogPost();

  BlogPost blogPost2 = new BlogPost();
      blogPost2.authorName = "Tim Urban";
      blogPost2.title = "Wait but why";
      blogPost2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
      blogPost2.publicationDate = "2010.10.10";

  BlogPost blogPost3 = new BlogPost();
      blogPost3.authorName = "William Turton";
      blogPost3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
      blogPost3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn't want to be the center of attention. When I asked to take his picture outside one of IBM's New York City offices, he told me that he wasn't really into the whole organizer profile thing.";
      blogPost3.publicationDate = "2017.03.28.";


    System.out.println(basic.publicationDate + " " + basic.title + " " + basic.text + " " + basic.authorName);
    System.out.println(blogPost2.publicationDate + " " + blogPost2.title + " " + blogPost2.text + " " + blogPost2.authorName);
    System.out.println(blogPost3.publicationDate + " " + blogPost3.title + " " + blogPost3.text + " " + blogPost3.authorName);

  }
}