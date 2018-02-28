package com.iqmsoft.web

import javax.servlet.{ServletContextEvent, ServletContextListener}

import org.slf4j.{Logger, LoggerFactory}
import org.springframework.stereotype.Component

@Component
class TheServletContextListener extends ServletContextListener {

  protected val logger: Logger = LoggerFactory.getLogger(classOf[TheServletContextListener])

  override def contextInitialized(sce: ServletContextEvent): Unit = {
    logger.info("*** Context initialized")
  }

  override def contextDestroyed(sce: ServletContextEvent): Unit = {
    logger.info("*** Context destroyed")
  }

}
