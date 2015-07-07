package com.manning.gia.todo.model;
public class ToDoItem implements Comparable<ToDoItem> {
  private Long id;
  private String name;
  private boolean completed;

  public Long getId() {
      return id;
  }

  public void setId(Long id) {
      this.id = id;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public boolean getCompleted() {
      return completed;
  }

  public void setCompleted(boolean completed) {
      this.completed = completed;
  }

  @Override public int compareTo(ToDoItem that) {
    final int BEFORE = -1;
    final int EQUAL = 0;
    final int AFTER = 1;

    if (this == that) return EQUAL;

    if (this.id < that.id) return BEFORE;
    if (this.id > that.id) return AFTER;

    if (!this.completed && that.completed) return BEFORE;
    if (this.completed && !that.completed) return AFTER;

    int comparison = this.name.compareTo(that.name);
    if (comparison != EQUAL) return comparison;

    return EQUAL;
}