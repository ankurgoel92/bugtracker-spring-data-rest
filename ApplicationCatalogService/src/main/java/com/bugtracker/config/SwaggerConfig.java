package com.bugtracker.config;

import static com.google.common.collect.Lists.newArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import({springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class})
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.GET,
                        newArrayList(new ResponseMessageBuilder()
                                .code(500)
                                .message("\"The server is down. Please make sure that the UserManagement microservice is running. ")
                                .responseModel(new ModelRef("Error"))
                                .build()))
                .apiInfo(metaData());
    }
    
    private ApiInfo metaData() {
        return new ApiInfoBuilder()
        		.title("Spring Boot REST API")
        		.description("Spring Boot REST API for Application Catalog Microservice")
        		.license("Apache License Version 2.0")
        		.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
        		.version("1.0")
        		.termsOfServiceUrl("Terms of service")
        		.contact(new Contact("Ankur Goel", "" , "ankurgoel.juit@gmail.com"))
        		.build();
    }

}
