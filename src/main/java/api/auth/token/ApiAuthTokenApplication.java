package api.auth.token;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages = "api.auth.token.model")//Mapear e criar todas as tabelas dentro desse pacote
@ComponentScan(basePackages = {"api.*"})//Varrer td projeto lendi as injeções de dependencias
@EnableJpaRepositories(basePackages = "api.auth.token.repository")//Mapear os repositorys do projeto
@EnableTransactionManagement //Evitar erros de transações
@EnableWebMvc //Ativar Recursos MVC
@RestController //Ativar RestController
@EnableAutoConfiguration //Deixar td configurado
public class ApiAuthTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAuthTokenApplication.class, args);
	}

}
