package com.example.counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterContoller {

  private CounterServiceImpl counterServiceImpl;

  public CounterContoller(
      CounterServiceImpl counterServiceImpl) {
    this.counterServiceImpl = counterServiceImpl;
  }

  @GetMapping("/counter")
  public Integer getCounterValue() {
    return counterServiceImpl.getCounter();
  }

  @GetMapping("/increment")
  public Integer incrementCounterValue() {
    return counterServiceImpl.incrementCounter();
  }

}
