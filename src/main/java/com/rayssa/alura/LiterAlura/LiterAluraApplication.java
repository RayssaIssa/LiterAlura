package com.rayssa.alura.LiterAlura;

import com.rayssa.alura.LiterAlura.Repository.AutorRepository;
import com.rayssa.alura.LiterAlura.Repository.LivroRepository;
import com.rayssa.alura.LiterAlura.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner{
	@Autowired
	private LivroRepository repository;

	@Autowired
	private AutorRepository authorsRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository, authorsRepository);
		principal.exibeMenu();
	}
}
