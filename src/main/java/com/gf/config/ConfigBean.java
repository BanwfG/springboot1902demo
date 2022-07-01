package com.gf.config;

import com.gf.util.PrintUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    @Bean
    public PrintUtil getJDBCUtil(){
        return new PrintUtil();
    }
//    @Bean
//    public PrintUtil setJDBCUtil(){
//       return new PrintUtil();
//    }
}
