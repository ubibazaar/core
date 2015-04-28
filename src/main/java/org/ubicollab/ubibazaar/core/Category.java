package org.ubicollab.ubibazaar.core;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

  Set<Category> subCategories;

  public void addSubCategory(Category category) {
    if (subCategories == null) {
      synchronized (this) {
        if (subCategories == null) {
          subCategories = Sets.newHashSet();
        }
      }
    }

    subCategories.add(category);
  }

}
