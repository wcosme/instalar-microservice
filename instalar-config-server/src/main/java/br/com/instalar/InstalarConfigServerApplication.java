package br.com.instalar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class InstalarConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstalarConfigServerApplication.class, args);
	}

}
