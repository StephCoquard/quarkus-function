package org.sco;

import io.quarkus.funqy.Funq;

public class GreetingFunction {

    @Funq
    public String funqyHello() {
        return "hello funqy";
    }

    @Funq("HelloWorld")
    public String greet(String name) {
        return "Hello funq " + name;
    }
}
