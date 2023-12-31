package com.shanto.springboot_gradle_rest_sw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.shanto.springboot_gradle_rest_sw.controller"))
                .paths(PathSelectors.any()).build();
    }

//    @Bean
//    public Docket docket() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//        docket.apiInfo(apiInfo()).select()
//                .apis(RequestHandlerSelectors.basePackage("com.shanto.springboot_gradle_rest_sw.controller"))
//                .paths(PathSelectors.any()).build();
//        return docket;
//    }
//
//    private ApiInfo apiInfo() {
//        ApiInfo resTfulApi = new ApiInfoBuilder().title("springboot_gradle_rest_sw").description("Browse and interact with RESTful API dynamically")
//                .build();
//        return resTfulApi;
//    }

}