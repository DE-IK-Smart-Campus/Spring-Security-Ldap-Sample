package hu.unideb.sample.ldap.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LdapSampleRestController {

  @PreAuthorize("isAuthenticated()")
  @GetMapping(path = "/")
  public ResponseEntity<String> getEndpoint() {
    return ResponseEntity.ok("You are authenticated.");
  }
}
