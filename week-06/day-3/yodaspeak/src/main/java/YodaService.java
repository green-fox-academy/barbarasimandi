import com.sun.deploy.net.HttpResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

  public interface YodaService {

    HttpResponse<String> response = Unirest.get("https://yoda.p.mashape.com/yoda?sentence=You+will+learn+how+to+speak+like+me+someday.++Oh+wait.")
        .header("X-Mashape-Key", "YnoqCU2vmfmshTfVaqyO0pbVL4Lgp1q2DmxjsncJmD9qa9eJEQ")
        .header("Accept", "text/plain")
        .asString();

    @GET("yoda")
    Call<ResponseBody> getAnswer(@Query("sentence") String sentence);

  }
