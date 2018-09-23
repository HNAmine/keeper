package com.hn.keeper;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hn.keeper.starter.EnableKeepingModule;

@SpringBootApplication
@EnableKeepingModule
public class KeeperApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KeeperApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
