import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface TheAPI {

    @GET("weather")
    Call<elementito> loadelementitos(@Query("q") String city);

}
