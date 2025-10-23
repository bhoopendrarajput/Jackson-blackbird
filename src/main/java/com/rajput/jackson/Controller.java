package com.rajput.jackson;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
  @GetMapping("my-json")
  public ResponseEntity<HelloWorld> getJson() {
    return ResponseEntity.ok(new HelloWorld());
  }
}