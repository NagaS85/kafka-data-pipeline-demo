package com.kafka.data.pipeline.demo.config;

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
    ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title("Swagger Car Inventory Service")
                .description("Car Inventory Service")
                .license("MIT")
                .licenseUrl("https://opensource.org/licenses/MIT")
                .version("1.0.0")
                .contact(new Contact("Test","abc.com", "hi@gamil.com"))
                .build();
    }

    @Bean
    public Docket customImplementation() {

        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kafka.example.topic"))
                .paths(PathSelectors.any())
                .build()
                .enable(true)
                .apiInfo(apiInfo());
    }
}
