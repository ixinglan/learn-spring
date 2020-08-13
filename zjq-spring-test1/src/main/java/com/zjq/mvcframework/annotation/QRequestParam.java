package com.zjq.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @description:
 * @author:zhaojq
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QRequestParam {
    String value() default "";
}
