package com.jaehyeok.basic.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
// @Configurable : 생성자나 메서드가 호출 시에 Spring bean 등록을 자동화(제어 역전)하는 어노테이션
@Configurable
// @EnableWebSecurity : Web Security 설정을 지원하도록 하는 어노테이션
@EnableWebSecurity
public class WebSecurityConfig {
  
  // @Bean : 
  // - Spring bean으로 등록하는 어노테이션
  // - @Component를 사용하지 못할 때  @Bean을 사용
  // - @Autowired의 목적이 아닐 때 사용
  @Bean
  protected SecurityFilterChain configure(HttpSecurity security) throws Exception {
    
    // security : 
    // - basic authentication 미사용 지정
    security
    // class::method :
    // - 메소드 참조, 특정 클래스의 메서드를 참조할 때 사용
    // - 일반적으로 매개변수로 메서드를 전달할 때 사용됨
    // - java에서 함수 개념은 없음 무조건 메서드!
    .httpBasic(HttpBasicConfigurer::disable);
    return security.build();
  }
}
