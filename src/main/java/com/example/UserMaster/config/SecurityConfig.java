package com.example.UserMaster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig  {

	
	   @Bean
	    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	     
	        http.authorizeHttpRequests()
	                .requestMatchers("/login").permitAll()
	                .requestMatchers(
				    "/registration**",
	                "/js/**",
	                "/css/**",
	                "/img/**").permitAll()
	                .anyRequest().authenticated()
	        		.and()
	        		.formLogin()
	        		.loginPage("/login")
	        		.permitAll()
	        		.and()
	        		.logout()
	        		.invalidateHttpSession(true)
	        		.clearAuthentication(true)
	        		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	        		.logoutSuccessUrl("/login?logout")
	        		.permitAll();
	 
	        http.headers().frameOptions().sameOrigin();
	 
	        return http.build();
	    }
}
