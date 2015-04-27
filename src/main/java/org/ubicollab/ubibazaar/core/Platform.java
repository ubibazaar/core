package org.ubicollab.ubibazaar.core;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect
public class Platform {

  String id;
  
  String name;
  
  public static void main(String[] args) {
    for (int i = 0; i < 50; i++) {
      System.out.println(UUID.randomUUID().toString().replace("-", ""));
    }
  }

}
