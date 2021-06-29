package bank.loandetailsMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableSwagger2
//@EnableWebMvc
public class loandetailsApplication {
	public static void main(String[] args) {
		System.out.println(1);
		SpringApplication.run(loandetailsApplication.class, args);
	}
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//	
//	
//	@Bean
//	public Docket
//	swaggerConfiguration() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("bank"))
//			    .build();
//	}
}
