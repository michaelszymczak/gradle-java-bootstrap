package com.michaelszymczak.foo;

/**
 * Created 01/07/18.
 */
public class Foo {
  public String getGreeting() {
    return "Hello Real Foo.";
  }

  public static void main(String[] args) {
    System.out.println(new Foo().getGreeting());
  }
}
