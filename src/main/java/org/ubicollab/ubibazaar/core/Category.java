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
public class Category {
  
  String id;
  
  String name;
  
  Category superCategory;
  
  Set<Category> subCategories;

}
