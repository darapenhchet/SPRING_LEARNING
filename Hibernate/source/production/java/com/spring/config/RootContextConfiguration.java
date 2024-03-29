package com.spring.config;

import java.nio.charset.StandardCharsets;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.dialect.MySQL5InnoDBDialect;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateExceptionTranslator;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
@ComponentScan(basePackages = "com.spring.site", excludeFilters = @ComponentScan.Filter({
		Controller.class, ControllerAdvice.class }))
@EnableTransactionManagement
public class RootContextConfiguration {

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setCacheSeconds(-1);
		messageSource.setDefaultEncoding(StandardCharsets.UTF_8.name());
		messageSource.setBasenames("/WEB-INF/i18n/titles",
				"/WEB-INF/i18n/errors", "/WEB-INF/i18n/messages",
				"/WEB-INF/i18n/validation");
		return messageSource;
	}

	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor() {
		MethodValidationPostProcessor processor = new MethodValidationPostProcessor();
		processor.setValidator(this.localValidatorFactoryBean());
		return processor;
	}

	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.findAndRegisterModules();
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		mapper.configure(
				DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false);
		return mapper;
	}

	@Bean
	public Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan(new String[] { "com.spring.site" });
		return marshaller;
	}

	@Bean
	public LocalValidatorFactoryBean localValidatorFactoryBean() {
		LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
		validator.setValidationMessageSource(this.messageSource());
		return validator;
	}

	@Bean
	public PersistenceExceptionTranslator persistenceExceptionTranslator() {
		return new HibernateExceptionTranslator();
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager manager = new HibernateTransactionManager();
		manager.setSessionFactory(this.sessionFactory());
		return manager;
	}

	@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(
				this.dataSource());
		builder.scanPackages("com.spring.site.entity");
		//builder.setProperty("hibernate.default_schema", "dbo");
		builder.setProperty("hibernate.dialect", MySQL5InnoDBDialect.class.getCanonicalName());
		return builder.buildSessionFactory();
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/ifinances");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return dataSource;
	}
	
/*	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
		LocalEntityManagerFactoryBean factory = new LocalEntityManagerFactoryBean();
		factory.setPersistenceUnitName("SpringJpa");
		factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		factory.setDataSource(this.springJpaDataSource());
		return factory;
	}*/
}
