package pointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import service.Service;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jinqinghua on 16/1/30.
 */
public class MyStaticMethodMatcherPointcut extends StaticMethodMatcherPointcut {
    public boolean matches(Method method, Class<?> targetClass) {
        if (method.getName().equals("adviced")) {
            return true;
        }
        return false;
    }

    @Override public ClassFilter getClassFilter() {
        final ClassFilter classFilter = new ClassFilter() {
            public boolean matches(Class<?> clazz) {
                if (clazz.isAssignableFrom(Service.class)) {

                    return true;

                }

                Class<?>[] classes = clazz.getInterfaces();
                List<Class<?>> classList = Arrays.asList(classes);
                for (Class c : classList) {
                    if (c.getName().equals(Service.class.getName())) {
                        return true;
                    }
                }
                return false;
            }
        };

        return classFilter;
    }
}
