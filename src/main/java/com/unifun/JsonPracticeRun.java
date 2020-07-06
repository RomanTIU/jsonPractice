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

        Motor motor1 = new Motor("V120", MotorType.FOUR_STROKE_ENGINE,2500,new CompatibleVersion[]{CompatibleVersion.V123,CompatibleVersion.V134,CompatibleVersion.V136M});
        Motor motor2 = new Motor("V110", MotorType.TWO_STROKE_ENGINE,1400,new CompatibleVersion[]{CompatibleVersion.V124,CompatibleVersion.V134});
        Motor motor3 = new Motor("V2340", MotorType.FOUR_STROKE_ENGINE,2200,new CompatibleVersion[]{CompatibleVersion.V135});
        Motor motor4 = new Motor("V450", MotorType.FOUR_STROKE_ENGINE,2600,new CompatibleVersion[]{CompatibleVersion.V123,CompatibleVersion.V140,CompatibleVersion.V134,CompatibleVersion.V136M});

        Car mercedes = new Car("Mercedes", BodyStyle.COUPE,new Complect[]{Complect.ABS,Complect.CONDITIONER},17,motor1);
        Car mazda = new Car("Mercedes", BodyStyle.COUPE,new Complect[]{Complect.ABS,Complect.CONDITIONER},17,motor2);
        Car bmw = new Car("Mercedes", BodyStyle.COUPE,new Complect[]{Complect.ABS,Complect.CONDITIONER},17,motor3);
        Car audi = new Car("Mercedes", BodyStyle.COUPE,new Complect[]{Complect.ABS,Complect.CONDITIONER},17,motor4);


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
