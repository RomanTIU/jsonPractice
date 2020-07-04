package com.unifun;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.unifun.enums.BodyStyle;
import com.unifun.enums.Complect;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String brand;
    private BodyStyle bodyStyle;
    private Complect[] complect;
    private int wheelSize;
    private Motor motor;



}
