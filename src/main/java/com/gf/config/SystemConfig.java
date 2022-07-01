package com.gf.config;

//import com.gf.controller.UserController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

//第三种方式生成Bean
//先在一个类上面加注解

//@Configuration
//public class SystemConfig {
//    //当前类中@Bean注解修饰的方法返回值会自动注入到Spring的容器中，成为Spring容器中的一个Bean，具有依赖注入和控制反转，以及注入到其他Bean中的特性
//    @Bean
//    public UserController getController(){
//        return new UserController();
//    }
//    public class IndexController{
//        private UserController userController;
//        @RequestMapping("/IndexController")
//        public String index(){
//            userController.hello();
//            return "hello World2";
//        }
//    }
//}
