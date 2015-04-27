package org.ubicollab.ubibazaar.core;

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
public class ManagerType {
  
  String id;
  
  String name;
  
  Platform platform;
  
  InstallationMethod installationMethod;

  Cardinality devicePairingCardinality;

}
