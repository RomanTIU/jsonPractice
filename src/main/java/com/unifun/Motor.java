package com.unifun;

import com.unifun.enums.CompatibleVersion;
import com.unifun.enums.MotorType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Motor {
    private String version;
    private MotorType motorType;
    private int power;
    private CompatibleVersion[] compatibleVersion;

}
