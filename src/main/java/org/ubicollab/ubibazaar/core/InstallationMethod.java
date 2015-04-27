package org.ubicollab.ubibazaar.core;

import java.util.List;

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
public class InstallationMethod {
  
  String id;
  
  String name;
  
  List<String> properties;

}