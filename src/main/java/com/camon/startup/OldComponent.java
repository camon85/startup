package com.camon.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class OldComponent {

  public OldComponent() {
    log.warn(">>> OldComponent.constructor");
  }

  @PostConstruct
  void init() {
    log.warn(">>> OldComponent.PostConstruct");
  }

  @PreDestroy
  void destroy() {
    log.warn(">>> OldComponent.PreDestroy");
  }

}
