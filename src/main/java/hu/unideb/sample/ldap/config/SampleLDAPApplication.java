package hu.unideb.sample.ldap.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "hu.unideb.sample.ldap")
@SpringBootApplication
public class SampleLDAPApplication {

  public static void main(final String[] args) throws Exception {
    SpringApplication.run(SampleLDAPApplication.class, args);
  }
}
