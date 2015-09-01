package com.spring.site.config;

import java.nio.file.attribute.AclEntry.Builder;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


	// The configure(AuthenticationManagerBuilder) method sets up the AuthenticationProvider
	// that we should use for authenticating users.
	@Override
	protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder)
			throws Exception {
		authenticationManagerBuilder
				.inMemoryAuthentication()
				.withUser("admin")
				.password("admin")
				.authorities("ADMIN","USER")
			.and()
				.withUser("user")
				.password("user")
				.authorities("USER");
		
		
	}
	
	// The configure(WEbSecurity) method is fairly simple. In this case, all it does is keep Spring
	// Security from evaluating access to resources(JavaScript, style sheets, images, and so on) for security concerns.
	@Override
	public void configure(WebSecurity webSecurity) throws Exception {
		webSecurity.ignoring().antMatchers("/resource/**");
	}
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity
				.authorizeRequests()
					.antMatchers("/signup", "/about", "/policies").permitAll()
					.antMatchers("/secure/**").hasAuthority("USER")
					.antMatchers("/admin/**").hasAuthority("ADMIN")
					.anyRequest().authenticated()
				.and().formLogin()
					.loginPage("/login").failureUrl("/login?error")
					.defaultSuccessUrl("/secure/")
					.usernameParameter("username")
					.passwordParameter("password")
					.permitAll()
				.and().csrf().disable();
	}
}
