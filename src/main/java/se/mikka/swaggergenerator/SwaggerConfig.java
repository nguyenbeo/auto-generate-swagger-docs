package se.mikka.swaggergenerator;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket testApiDocklet() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("se.mikka.swaggergenerator"))
        .paths(PathSelectors.regex("/v1/tests/.*"))
        .build()
        .useDefaultResponseMessages(false)
        .globalResponseMessage(RequestMethod.GET,
            Lists.newArrayList(new ResponseMessageBuilder().code(405).message("Method not allowed").build()))
        .apiInfo(new ApiInfoBuilder()
            .title("MiKKa Test API")
            .description("The API to test the swagger generator from Spring Boot")
            .contact(new Contact("MiKKa", "http://mikka.se", "whoever@gmail.com"))
            .license("proprietary")
            .version("1.0.0")
            .build())
        .host("api.mikka.se");
  }
}
