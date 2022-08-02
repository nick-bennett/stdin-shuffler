package com.nickbenn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Shuffler {

  public static void main(String[] args) throws IOException {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      List<String> lines = reader
          .lines()
          .collect(Collectors.toList());
      Collections.shuffle(lines, new SecureRandom());
      lines.forEach(System.out::println);
    }
  }

}
