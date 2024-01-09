package app9.apcoders.netflix.Retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public   static final String BASE_URL="https://gist.githubusercontent.com/HuzaifaAliBaig/423fe81a5f107eeb1f0d1e257d023342/raw/ee50ce1ea24596fb4c5b06928dc07c66c659a55c/project.json";
    public  static Apiinterface getRetrofitClient(){
        Retrofit.Builder builder=new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL);
        return builder.build().create(Apiinterface.class);
    }
}
