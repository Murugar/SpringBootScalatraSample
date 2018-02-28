package com.iqmsoft

import com.iqmsoft.web.TheServlet
import org.slf4j.{Logger, LoggerFactory}
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.Bean

object Application {
  def main(args: Array[String]) {
    SpringApplication.run(classOf[Application], args: _*)
  }
}

@SpringBootApplication
class Application {

  protected val logger: Logger = LoggerFactory.getLogger(classOf[Application])

  @Bean
  def customServletRegistrationBean(theServletToStandAboveAllServlets: TheServlet): ServletRegistrationBean = {
    new ServletRegistrationBean(theServletToStandAboveAllServlets, "/api/*")
  }

  @Bean
  def theServletToStandAboveAllServlets: TheServlet = {
    new TheServlet
  }
}
