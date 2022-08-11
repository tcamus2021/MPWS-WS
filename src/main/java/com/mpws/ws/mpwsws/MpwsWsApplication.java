package com.mpws.ws.mpwsws;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MpwsWsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MpwsWsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
	}

}