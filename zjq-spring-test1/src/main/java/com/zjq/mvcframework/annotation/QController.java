package com.zjq.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author:zhaojq
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QController {
    String value() default "";
}
