package advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by jinqinghua on 16/1/30.
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
        throws Throwable {
        System.out.println("始终在方法返回后执行");
    }
}
