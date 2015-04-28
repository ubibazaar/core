package org.ubicollab.ubibazaar.core;

import java.util.List;
import java.util.Map;

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
  
  List<Category> category;

  Map<String, String> properties;

}
