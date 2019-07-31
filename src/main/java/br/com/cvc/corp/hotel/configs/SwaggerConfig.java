package br.com.cvc.corp.hotel.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.cvc.corp.hotel"))
				.paths(PathSelectors.regex("/api.*"))
				.build()
				.apiInfo(metaInfo());

	}

	private ApiInfo metaInfo() {
		return new ApiInfoBuilder()
				.title("Hotel API REST")
				.description("API REST de consulta de hoteis.")
				.version("1.0.0")
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licesen.html")
				.contact(new Contact("Alexandre Martins", null, "amartins.dev@gmail.com"))
				.build();
	}
}
