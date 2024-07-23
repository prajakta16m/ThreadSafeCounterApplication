package com.example.counter;

import org.springframework.stereotype.Repository;

@Repository
public class CounterRespository {
  private Integer counter = 0;

  public Integer getCounter() {
    return counter;
  }

  synchronized public Integer incrementCounter() {
    return counter += 1;
  }
}
