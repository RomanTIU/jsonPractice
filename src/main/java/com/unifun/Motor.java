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
    private int power;
    private MotorType motorType;
    private CompatibleVersion[] compatibleVersion;

}
