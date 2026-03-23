package org.example.configure;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

@Slf4j
public class MyBean implements ApplicationContextAware, BeanFactoryAware, BeanNameAware, ResourceLoaderAware, InitializingBean {

    private ApplicationContext applicationContext;
    private String beanName;
    private ResourceLoader resourceLoader;

    // 实现ApplicationContextAware接口的方法
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        log.info("================================ApplicationContextAware setApplicationContext, applicationContext:{}", applicationContext.getApplicationName());
        this.applicationContext = applicationContext;
    }

    // 实现BeanFactoryAware接口的方法
    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        log.info("================================BeanFactoryAware setBeanFactory");

    }

    // 实现BeanNameAware接口的方法
    @Override
    public void setBeanName(String name) {
        log.info("================================BeanNameAware setBeanName, name:{}", name);
        this.beanName = name;
    }

    // 实现ResourceLoaderAware接口的方法
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        log.info("================================ResourceLoaderAware setResourceLoader");
        this.resourceLoader = resourceLoader;
    }

    // 实现InitializingBean接口的方法
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("================================InitializingBean afterPropertiesSet");
    }

}