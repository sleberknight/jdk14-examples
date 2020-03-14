package com.example.jdk14;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ZipCode {
    String code;
    String plus4;
}
