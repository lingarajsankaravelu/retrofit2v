package lingaraj.hourglass.com.retrofit2v;

import java.util.List;

import lingaraj.hourglass.com.retrofit2v.models.Links;
import lingaraj.hourglass.com.retrofit2v.models.PhoneResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by lingaraj on 10/26/16.
 */

public interface Service {

    @GET("/stackoverflowquestion")
    Call<List<PhoneResponse>> getstackoverflowResponse();



}
