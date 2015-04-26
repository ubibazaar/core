package org.ubicollab.ubibazaar.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.google.common.collect.Multimap;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect
public class Installation {
  
  Long id;

  Device device;

  App app;
  
  Multimap<String, String> properties;

}
