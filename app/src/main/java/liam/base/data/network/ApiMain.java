package liam.base.data.network;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by nghiavo on 2/7/17.
 */

public interface ApiMain {
    @GET("")
    Observable<String> get(@Query("") String a);
}
