package com.unifun;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.unifun.enums.BodyStyle;
import com.unifun.enums.CompatibleVersion;
import com.unifun.enums.Complect;
import com.unifun.enums.MotorType;
import lombok.extern.java.Log;


import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

@Log
public class JsonPracticeRun {
    public static void main(String[] args) throws IOException {

        Motor motor1 = new Motor("V120",2500, MotorType.FOUR_STROKE_ENGINE,new CompatibleVersion[]{CompatibleVersion.V123,CompatibleVersion.V134,CompatibleVersion.V136M});
        Motor motor2 = new Motor("V110", 1400,MotorType.TWO_STROKE_ENGINE,new CompatibleVersion[]{CompatibleVersion.V124,CompatibleVersion.V134});
        Motor motor3 = new Motor("V2340", 2200,MotorType.FOUR_STROKE_ENGINE,new CompatibleVersion[]{CompatibleVersion.V135});
        Motor motor4 = new Motor("V450", 2600,MotorType.FOUR_STROKE_ENGINE,new CompatibleVersion[]{CompatibleVersion.V123,CompatibleVersion.V140,CompatibleVersion.V134,CompatibleVersion.V136M});

        Car mercedes = new Car("Mercedes",18,motor1,new Complect[]{Complect.ABS,Complect.CONDITIONER}, BodyStyle.COUPE);
        Car mazda = new Car("Mercedes",17,motor2,new Complect[]{Complect.ABS,Complect.CONDITIONER}, BodyStyle.SEDAN);
        Car bmw = new Car("Mercedes",18,motor3 ,new Complect[]{Complect.ABS,Complect.CONDITIONER},BodyStyle.SEDAN);
        Car audi = new Car("Mercedes",19,motor4, new Complect[]{Complect.ABS,Complect.CONDITIONER},BodyStyle.ROADSTER);


        ObjectMapper mapper = new ObjectMapper();



        Car[] carsPark = new Car[]{mercedes,mazda,audi,bmw};
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        writer.writeValue(Paths.get("Car.json").toFile(),carsPark);

        Car[] readCars = mapper.readValue(new File("Car.json"),Car[].class);

        for (Car value :
                readCars) {
            log.info("Json Car : "+ value);
        }
    }

}
