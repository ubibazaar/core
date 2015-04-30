package org.ubicollab.ubibazaar.core;

import java.util.Set;

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
public class App {

  String id;

  String name;

  Platform platform;

  User author;

  String description;
  
  Set<Category> category;

  String properties;

}
