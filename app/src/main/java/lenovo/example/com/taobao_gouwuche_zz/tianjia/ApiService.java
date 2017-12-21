package lenovo.example.com.taobao_gouwuche_zz.tianjia;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Lenovo on 2017/12/20.
 */

public interface ApiService {
    /**
     * @param
     * @return
     */
    @GET("getCarts?uid=88&source=android")
    Observable<bean> getNoParams();
//    /**
//     * 结合RxJava
//     * @param user
//     * @return
//     * https://api.github.com/users/forever
//     */
//    @GET("users/{user}")
//    Observable<bean>  getHasParams(@Path("user")String user);
}
