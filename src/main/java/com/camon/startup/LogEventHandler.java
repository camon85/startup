package com.camon.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LogEventHandler {

  @EventListener
  @Async
  @Order(Ordered.HIGHEST_PRECEDENCE)
  public void logging(LogEvent event) {
    log.info("logging: {}", event.getMessage());
  }

  @EventListener
  @Async
  @Order(Ordered.HIGHEST_PRECEDENCE + 1)
  public void sendEmail(LogEvent event) {
    log.info("sendEmail: {}", event.getMessage());
  }
}
