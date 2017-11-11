package com.greenfox.barbi.restcontroller.model;

import java.util.List;

public class LogHistory {

  List<Log> entries;
  Integer entry_count;

  public LogHistory(List<Log> entries, Integer entry_count) {
    this.entries = entries;
    this.entry_count = entry_count;
  }

  public LogHistory() {
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public Integer getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(Integer entry_count) {
    this.entry_count = entry_count;
  }
}
