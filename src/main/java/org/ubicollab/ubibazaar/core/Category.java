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

  Category parent;

  Set<Category> children;

  public void addChild(Category category) {
    if (children == null) {
      synchronized (this) {
        if (children == null) {
          children = Sets.newHashSet();
        }
      }
    }

    children.add(category);
  }

}
