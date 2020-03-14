package com.example.jdk14;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Person {
    String name;
    Address homeAddress;
}
