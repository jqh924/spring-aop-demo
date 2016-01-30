package pointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * Created by jinqinghua on 16/1/30.
 */
public class MyDynamicPointcut extends DynamicMethodMatcherPointcut {
    public boolean matches(Method method, Class<?> targetClass, Object[] args) {
        if (args.length > 0) {
            String name = (String) args[0];
            if (name.equals("jinqinghua")) {
                return true;
            }
        }
        return false;
    }

    @Override public boolean matches(Method method, Class<?> targetClass) {
        System.out.println("动态切点,方法匹配检查"+method.getName());
        return true;
    }

    @Override public ClassFilter getClassFilter() {
        ClassFilter classFilter = new ClassFilter() {
            public boolean matches(Class<?> clazz) {
                System.out.println("动态切点,类类型匹配检查" + clazz.getName());
                return true;
            }
        };

        return classFilter;
    }
}
