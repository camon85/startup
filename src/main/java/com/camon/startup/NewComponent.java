package com.camon.startup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NewComponent implements InitializingBean, DisposableBean {

  public NewComponent() {
    log.warn(">>> NewComponent.constructor");
  }

  @Override
  public void afterPropertiesSet() {
    log.warn(">>> NewComponent.afterPropertiesSet");
  }

  @Override
  public void destroy() {
    log.warn(">>> NewComponent.destroy");
  }

}
