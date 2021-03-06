package com.spring.site.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


	//@Inject DataSource dataSource;
	// The configure(AuthenticationManagerBuilder) method sets up the AuthenticationProvider
	// that we should use for authenticating users.
	@Autowired
	protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder)
			throws Exception {
		authenticationManagerBuilder
			.inMemoryAuthentication()
				.withUser("admin")
				.password("admin")
				.roles("ADMIN","USER");
		

		/*authenticationManagerBuilder
				.jdbcAuthentication()
				//.dataSource(this.dataSource)
				.usersByUsernameQuery("SELECT Username, Password, Enabled "
						+ " FROM User WHERE Username = ?")
				.authoritiesByUsernameQuery("SELECT Username, Permission "
						+ " FROM UserPermission WHERE Username = ?")
				.passwordEncoder(new BCryptPasswordEncoder());*/
		
	}
	
	// The configure(WEbSecurity) method is fairly simple. In this case, all it does is keep Spring
	// Security from evaluating access to resources(JavaScript, style sheets, images, and so on) for security concerns.
	@Override
	public void configure(WebSecurity webSecurity) throws Exception {
		webSecurity.ignoring().antMatchers("/resource/**");
	}
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity
//			.authorizeRequests()
//			.antMatchers("/users/**").hasAuthority("ADMIN")
//				.anyRequest().fullyAuthenticated()
//				.antMatchers("/admin/**").hasAuthority("ADMIN")
//				//.antMatchers("/home").hasAnyRole("ADMIN")
//				//.antMatchers("/home").hasAnyRole("USER")
//				.and()
//			.formLogin()
//				.loginPage("/login")
//				.loginProcessingUrl("/login")
//				.defaultSuccessUrl("/admin/home")
//				.permitAll()
//				.and()
//			.logout()
//				.permitAll()
//				.and()
//			.csrf().disable();
			
		httpSecurity
				.authorizeRequests()
					.antMatchers("/signup", "/about", "/policies").permitAll()
					.antMatchers("/secure/**").hasAuthority("USER")
					.antMatchers("/admin/**").hasAnyRole("ADMIN")
					.anyRequest().authenticated()
				.and().formLogin()
					.loginPage("/login").failureUrl("/login?error")
					.defaultSuccessUrl("/admin/home")
					.usernameParameter("username")
					.passwordParameter("password")
					.permitAll()
				.and()
					.logout()
					.logoutUrl("/logout")
					.logoutSuccessUrl("/login?loggedOut")
					.invalidateHttpSession(true).deleteCookies("JSESSIONID")
					.permitAll()
				.and()					
					.sessionManagement()
					.sessionAuthenticationErrorUrl("/signup")
					.invalidSessionUrl("/signup")
					.sessionFixation()
					.changeSessionId()
					.maximumSessions(1)
					.maxSessionsPreventsLogin(true)
					.expiredUrl("/login?maxSessions")
					.sessionRegistry(sessionRegistryImpl())
				.and().and().csrf().disable()
					.rememberMe().key("SpringSecurityAppName");
//				.and().headers().cacheControl()
//					  .contentTypeOptions()
//					  .frameOptions()
//					  .httpStrictTransportSecurity()
//					  .xssProtection();
					
	}
	
	@Bean
    protected SessionRegistry sessionRegistryImpl()
    {
        return new SessionRegistryImpl();
    }
	
}