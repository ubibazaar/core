package org.ubicollab.ubibazaar.core;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.google.common.collect.Sets;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect
public class Category {

  String id;

  String name;

  Category superCategory;

  Set<Category> subCategories = Sets.newHashSet();

  public void setSubCategories(@NonNull Set<Category> subCategories) {
    this.subCategories = subCategories;
  }

  public void addSubCategory(Category category) {
    subCategories.add(category);
  }

}
