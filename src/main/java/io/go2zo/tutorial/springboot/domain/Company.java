package io.go2zo.tutorial.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
    private String name;
    private String catchPhrase;
    private String bs;
}
