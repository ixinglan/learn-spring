package com.zjq.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author:zhaojq
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QRequestMapping {
    String value() default "";
}
