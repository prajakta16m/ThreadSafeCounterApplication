package com.example.counter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService {

  @Autowired
  private CounterRespository respository;

  @Override
  public Integer getCounter() {

    return respository.getCounter();
  }

  @Override
  public Integer incrementCounter() {

    return respository.incrementCounter();
  }

}
