package com.michaelszymczak.foo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created 01/07/18.
 */
public class FooTest {
  @Test
  public void shouldGreet() throws Exception {
    assertEquals("Hello Real Foo.", new Foo().getGreeting());

  }
}