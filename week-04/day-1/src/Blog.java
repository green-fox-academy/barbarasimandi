import java.util.ArrayList;

public class Blog {

  ArrayList<BlogPost> blog= new ArrayList<>();

  public void addPost(BlogPost post) {
    blog.add(post);
  }

  public void removePost(int index) {
      blog.remove(index - 1);
  }

  public void update(int index, BlogPost post) {
    blog.set(index - 1, post);
  }

  @Override
  public String toString() {
    String result = "";
    for (int i = 0; i < blog.size(); i++) {
      result += blog.get(i) + "\n";
    }
    return result;
  }
}