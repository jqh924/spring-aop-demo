package advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by jinqinghua on 16/1/30.
 */
public class MyThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
        throws Throwable {
        System.out.println("始终在抛出异常后执行");
    }

    public void afterThrowing(RuntimeException e) throws Throwable {
        System.out.println("始终在抛出异常后执行,且异常类型为RuntimeException");
    }
}
