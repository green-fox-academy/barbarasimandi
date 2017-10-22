import com.sun.deploy.net.HttpResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class YodaMain {

  public static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .build();

    GitHubService service = retrofit.create(GitHubService.class);

    Call<ResponseBody> repos = service.listRepos("barbarasimandi");


    try {
      System.out.println(repos.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public interface GitHubService {
    @GET("users/{user}/repos")
    Call<ResponseBody> listRepos(@Path("user") String user);
  }
}
