package com.camon.startup;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class HelloController {

  private final ApplicationEventPublisher eventPublisher;

  @GetMapping
  public String hello() {
    LogEvent event = new LogEvent();
    String message = LocalDateTime.now().toString();
    event.setMessage(message);
    eventPublisher.publishEvent(event);
    return message + ": hello";
  }

}
