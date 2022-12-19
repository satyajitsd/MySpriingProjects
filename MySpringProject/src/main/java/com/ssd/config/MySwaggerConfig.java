package com.ssd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class MySwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.useDefaultResponseMessages(false).select()
				.apis(RequestHandlerSelectors
						.withClassAnnotation(RestController.class))
				.paths(paths()).build();
	}

	public Predicate<String> paths() {
		return Predicates.or(PathSelectors.regex("/.*"),
				Predicates.not(PathSelectors.regex("/error.*")));
	}

}
