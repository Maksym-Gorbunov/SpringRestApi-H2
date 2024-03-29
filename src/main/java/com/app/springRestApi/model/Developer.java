package com.app.springRestApi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developer {

  @Id
  private int id;
  private String name;
  private String lang;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  @Override
  public String toString() {
    return "Developer{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", lang='" + lang + '\'' +
            '}';
  }
}
