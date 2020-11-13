package com.camon.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@Slf4j
@SpringBootApplication
public class StartupApplication {

  public static void main(String[] args) {
    SpringApplication.run(StartupApplication.class, args);
  }

  @Bean
  public ApplicationRunner startApplicationRunner() {
    return (args) -> log.info(">>> ApplicationRunner");
  }

  @Bean
  public CommandLineRunner startCommandLineRunner() {
    return (args) -> log.info(">>> CommandLineRunner");
  }

  @EventListener(ApplicationReadyEvent.class)
  public void readyEvent() {
    log.info(">>> ApplicationReadyEvent");
  }

}
