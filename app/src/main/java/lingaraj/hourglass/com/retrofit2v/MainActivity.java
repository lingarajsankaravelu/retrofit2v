package lingaraj.hourglass.com.retrofit2v;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import lingaraj.hourglass.com.retrofit2v.models.PhoneResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataUsingRetrofit();
    }

    private void getDataUsingRetrofit() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://demo5585860.mockable.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Service retrofit_service = retrofit.create(Service.class);
        List<PhoneResponse> data_list;
        final Call<List<PhoneResponse>> call = retrofit_service.getstackoverflowResponse();
        call.enqueue(new Callback<List<PhoneResponse>>() {
            @Override
            public void onResponse(Call<List<PhoneResponse>> call, Response<List<PhoneResponse>> response) {
                List<PhoneResponse> data_list = response.body();
                Log.d(TAG,"success"+data_list);

            }

            @Override
            public void onFailure(Call<List<PhoneResponse>> call, Throwable t) {
                Log.d(TAG,"failure"+t.toString());
            }
        });


    }


}
