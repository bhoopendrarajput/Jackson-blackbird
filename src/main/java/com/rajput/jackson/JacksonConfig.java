package com.rajput.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.blackbird.BlackbirdModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class JacksonConfig {
  //3.	Alternatively, if you want to enable it via classpath without code, create a file named:
  @Bean
  public ObjectMapper objectMapper() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.registerModule(new Jdk8Module());//Optional, OptionalInt
    mapper.registerModule(new JavaTimeModule());
    mapper.registerModule(new BlackbirdModule());
    log.info("Created ObjectMapper with Jdk8Module, JavaTimeModule & BlackbirdModule");
    return mapper;
  }
}