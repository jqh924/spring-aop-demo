package advisor;

import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Created by jinqinghua on 16/1/23.
 */
public class PopularAdvisor extends StaticMethodMatcherPointcutAdvisor {
    public boolean matches(Method method, Class<?> targetClass) {
        if (method.getName().equals("service")) {
            return true;
        }

        if(method.getName().equals("throwException")){

        }
        return false;
    }
}
