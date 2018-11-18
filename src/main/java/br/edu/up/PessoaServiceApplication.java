package br.edu.up;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableRabbit
@EnableEurekaClient
public class PessoaServiceApplication {

	@Value("${fila.nome}")
    private String nomeDaFila;

	public static void main(String[] args) {
		SpringApplication.run(PessoaServiceApplication.class, args);
	}
	
	@Bean
    public Queue fila() {
        return new Queue(nomeDaFila, true);
    }
}
