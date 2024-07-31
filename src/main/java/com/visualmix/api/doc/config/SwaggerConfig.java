package com.visualmix.api.doc.config;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.visualmix.api.doc.controller"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .pathMapping("/")
                .useDefaultResponseMessages(false)
                .ignoredParameterTypes(Object.class)
                .apiInfo(apiInfo())
                .enable(true);
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Título da API",
                "Descrição da API",
                "Versão",
                "Termos de Serviço",
                new Contact("Nome", "URL", "email"),
                "Licença",
                "URL da Licença",
                Collections.emptyList());
    }
}
