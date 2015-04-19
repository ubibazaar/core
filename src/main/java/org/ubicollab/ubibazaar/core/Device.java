package org.ubicollab.ubibazaar.core;

public class Device {

  String name;

  Platform platform;

  User owner;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }
  
}
