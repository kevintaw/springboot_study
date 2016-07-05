package com.kevin.springboot_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by kevin on 16-6-30.
 */

@SpringBootApplication
@ServletComponentScan
public class SpringbootstudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootstudyApplication.class, args);
    }

    /**
     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
     */
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(new MyServlet(), "/xs/*");// ServletName默认值为首字母小写，即myServlet
//    }
}
