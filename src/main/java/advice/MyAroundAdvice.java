package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by jinqinghua on 16/1/23.
 */
public class MyAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        beforeInvokation(invocation);
        invocation.proceed();
        afterInvokation(invocation);
        return null;
    }


    private void beforeInvokation(MethodInvocation invocation) {
        System.out.println("环绕增强 执行前" + invocation.getMethod().getName());
    }

    private void afterInvokation(MethodInvocation invocation) {
        System.out.println("环绕增强 执行后" + invocation.getMethod().getName());
    }
}
