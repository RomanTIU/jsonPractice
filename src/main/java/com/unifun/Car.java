package com.unifun;


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
    private int wheelSize;
    private Motor motor;
    private Complect[] complect;
    private BodyStyle bodyStyle;



}
