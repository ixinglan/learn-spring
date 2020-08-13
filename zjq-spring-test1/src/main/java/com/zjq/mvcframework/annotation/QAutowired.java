package com.zjq.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author:zhaojq
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QAutowired {
    String value() default "";
}
