package com.game.kraken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.game.kraken.entities")
public class KrakenApplication {

    public static void main(String[] args) {
        SpringApplication.run(KrakenApplication.class, args);
    }
}