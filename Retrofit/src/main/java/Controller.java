import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class Controller implements Callback<List<elementito>> {

    static final String BASE_URL = "https://community-open-weather-map.p.rapidapi.com/";

    public void start(){
        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();


        TheAPI theAPI = retrofit.create(TheAPI.class);

        //String key = "84afbdd4bbmsh8357420c470620fp11eabdjsnf5d7dd810be4";
        Call call = theAPI.loadelementitos("Lima");
        //An invocation of a Retrofit method that sends a request to a webserver and returns a response

        call.enqueue(this);

    }

    @Override
    public void onResponse(Call call, Response response) {

        if(response.isSuccessful()){

          elementito Respuesta = (elementito) response.body();

            System.out.println(response);

            System.out.println(Respuesta.getNombre());

        }else{
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call call, Throwable t) {
        t.printStackTrace();
    }

}
