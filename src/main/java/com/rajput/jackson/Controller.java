package com.rajput.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class Controller {
  private final ObjectMapper mapper;

  @GetMapping("json")
  public ResponseEntity<HelloWorld> getJson() {
    return ResponseEntity.ok(new HelloWorld());
  }

  @GetMapping("my-json")
  public ResponseEntity<String> getMyJson() {
    try {
      return ResponseEntity.ok(mapper.writeValueAsString(new HelloWorld()));
    } catch (Exception e) {
      e.printStackTrace();
      return ResponseEntity.ok(new HelloWorld().toString());
    }
  }
}
