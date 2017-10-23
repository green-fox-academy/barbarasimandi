import com.sun.deploy.net.HttpResponse;
import java.io.IOException;
import java.util.Scanner;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class YodaMain {

  public static void main(String[] args) {

    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://yoda.p.mashape.com/yoda")
        .build();

    YodaService yodaService = retrofit.create(YodaService.class);

    String toBeTranslated = "I hope I'll understand API soon";

    Call<ResponseBody> answer = yodaService.getAnswer(toBeTranslated);

    try {
      System.out.println(answer.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
