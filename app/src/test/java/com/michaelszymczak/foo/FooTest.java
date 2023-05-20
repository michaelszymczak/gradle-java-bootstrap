package com.michaelszymczak.foo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FooTest {
    @Test
    void name() {
        assertThat(new Foo().bar()).isEqualTo("bar");
    }
}