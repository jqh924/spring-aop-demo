package advice;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import service.Business;

/**
 * Created by jinqinghua on 16/1/30.
 */
public class MyIntroductionInterceptor extends DelegatingIntroductionInterceptor
    implements Business {

    public void doBusiness() {
        System.out.println("do business");
    }
}
