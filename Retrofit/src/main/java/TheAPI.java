import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface TheAPI {

    //String key = "84afbdd4bbmsh8357420c470620fp11eabdjsnf5d7dd810be4";
    //'X-RapidAPI-Key=84afbdd4bbmsh8357420c470620fp11eabdjsnf5d7dd810be4'
   // @Header("X-RapidAPI-Key");
    //@HEAD("X-RapidAPI-Key=84afbdd4bbmsh8357420c470620fp11eabdjsnf5d7dd810be4")
    @GET("weather")
    Call<elementito> loadelementitos(@Query("q") String city);

}
