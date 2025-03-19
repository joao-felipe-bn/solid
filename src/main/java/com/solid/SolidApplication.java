package com.solid;

import com.solid.lsp.examples.v2.LspV2Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SolidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LspV2Test lspV2Test = new LspV2Test();
		lspV2Test.executar();
	}

}
