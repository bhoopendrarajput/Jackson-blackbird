package com.rajput.jackson;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class HelloWorld {
  private String message = "Hello World";
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime dateTime = LocalDateTime.now();
}