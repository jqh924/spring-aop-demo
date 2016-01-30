package advisor;

import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Created by jinqinghua on 16/1/30.
 */
public class MyStaticMethodMatcherPointcutAdvisor extends StaticMethodMatcherPointcutAdvisor {
    public boolean matches(Method method, Class<?> targetClass) {
        return true;
    }
}
