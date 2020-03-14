package com.example.jdk14;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Address {
    String number;
    String street;
    String city;
    String state;
    ZipCode zip;
}
