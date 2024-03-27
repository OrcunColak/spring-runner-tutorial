package com.colak.springrunnertutorial.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@Slf4j
public class RunnerConfig {

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> log.info("CommandLineRunner args : {}", Arrays.asList(args));
    }

    @Bean
    ApplicationRunner applicationRunner() {
        return args -> args.getOptionNames()
                .forEach(name ->
                        log.info(name + ": " + args.getOptionValues(name)));
    }
}
