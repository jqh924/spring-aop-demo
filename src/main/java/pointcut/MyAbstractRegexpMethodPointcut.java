package pointcut;

import org.springframework.aop.support.AbstractRegexpMethodPointcut;

/**
 * Created by jinqinghua on 16/1/30.
 */
public class MyAbstractRegexpMethodPointcut extends AbstractRegexpMethodPointcut {
    @Override protected void initPatternRepresentation(String[] patterns)
        throws IllegalArgumentException {

    }

    @Override protected void initExcludedPatternRepresentation(String[] patterns)
        throws IllegalArgumentException {

    }

    @Override protected boolean matches(String pattern, int patternIndex) {
        return false;
    }

    @Override protected boolean matchesExclusion(String pattern, int patternIndex) {
        return false;
    }
}
