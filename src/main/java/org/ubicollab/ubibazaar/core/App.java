package org.ubicollab.ubibazaar.core;

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

  Long id;

  String name;

  Platform platform;

  User author;

  String description;

  Map<String, String> properties;

}
