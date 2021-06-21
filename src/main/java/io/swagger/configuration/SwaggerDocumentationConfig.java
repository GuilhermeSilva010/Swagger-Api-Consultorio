package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-16T19:50:12.757Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("API de consultório")
            .description("API para controlar médicos e suas especialidades dentro do consultório.")
            .license("Licença GPLv3")
            .licenseUrl("https://www.gnu.org/licenses/gpl-3.0.html")
            .termsOfServiceUrl("https/mockapi.io")
            .version("0.0.1")
            .contact(new Contact("","", "contato@example.com"))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("API de consultório")
                .description("API para controlar médicos e suas especialidades dentro do consultório.")
                .termsOfService("https/mockapi.io")
                .version("0.0.1")
                .license(new License()
                    .name("Licença GPLv3")
                    .url("https://www.gnu.org/licenses/gpl-3.0.html"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("contato@example.com")));
    }

}
