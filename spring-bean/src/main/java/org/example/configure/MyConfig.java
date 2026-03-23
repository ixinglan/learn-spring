package org.example.configure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class MyConfig {

    @Bean
    public BeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }

    @Bean
    public ApplicationRunner myApplicationRunner() {
        return new MyApplicationRunner();
    }

    @Bean
    public CommandLineRunner myCommandLineRunner() {
        return new MyCommandLineRunner();
    }

    // 自定义BeanPostProcessor
    private static class MyBeanPostProcessor implements BeanPostProcessor {
        // 实现BeanPostProcessor的方法

        @Override
        public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            log.info("================================MyBeanPostProcessor postProcessBeforeInitialization, bean:{}, beanName:{}", bean, beanName);
            return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
        }

        @Override
        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
            log.info("================================MyBeanPostProcessor postProcessAfterInitialization, bean:{}, beanName:{}", bean, beanName);
            return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
        }
    }

    // 自定义ApplicationRunner
    private static class MyApplicationRunner implements ApplicationRunner {
        // 实现ApplicationRunner的方法
        @Override
        public void run(ApplicationArguments args) throws Exception {
            log.info("================================MyApplicationRunner run, args:{}", args);
        }
    }

    // 自定义CommandLineRunner
    private static class MyCommandLineRunner implements CommandLineRunner {
        // 实现CommandLineRunner的方法
        @Override
        public void run(String... args) throws Exception {
            log.info("================================MyCommandLineRunner run, args:{}", args);
        }
    }


    //-----------------------------------------------------------------------------------
    @Bean
    public BeanFactoryPostProcessor myBeanFactoryPostProcessor() {
        return new MyBeanFactoryPostProcessor();
    }

    @Bean
    public BeanDefinitionRegistryPostProcessor myBeanDefinitionRegistryPostProcessor() {
        return new MyBeanDefinitionRegistryPostProcessor();
    }

    // 自定义BeanFactoryPostProcessor
    private static class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
        @Override
        public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
            log.info("================================MyBeanFactoryPostProcessor postProcessBeanFactory");
        }
    }

    // 自定义BeanDefinitionRegistryPostProcessor
    private static class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
        @Override
        public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
            log.info("================================MyBeanDefinitionRegistryPostProcessor postProcessBeanDefinitionRegistry");
        }

        @Override
        public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
            log.info("================================MyBeanDefinitionRegistryPostProcessor postProcessBeanFactory");
        }
    }
}