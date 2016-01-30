package pointcut;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by jinqinghua on 16/1/30.
 */
public class MyComposablePointcut implements FactoryBean<Pointcut> {

    public Pointcut originPointcut;


    public void setPointcut(Pointcut pointcut) {
        this.originPointcut = pointcut;
    }

    public Pointcut getObject() {
        ComposablePointcut composablePointcut = new ComposablePointcut();
        return composablePointcut.intersection(originPointcut);
    }

    public Class<?> getObjectType() {
        return Pointcut.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
