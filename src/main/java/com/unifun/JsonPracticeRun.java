package com.unifun;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import com.unifun.enums.BodyStyle;
import com.unifun.enums.CompatibleVersion;
import com.unifun.enums.Complect;
import com.unifun.enums.MotorType;
import lombok.extern.java.Log;


import java.io.File;
import java.io.IOException;

@Log
public class JsonPracticeRun {
    public static void main(String[] args) throws IOException {

        Motor motor1 = new Motor("V120", MotorType.FOUR_STROKE_ENGINE,2500,new CompatibleVersion[]{CompatibleVersion.V123,CompatibleVersion.V134,CompatibleVersion.V136M});

        Car mercedes = new Car("Mercedes", BodyStyle.COUPE,new Complect[]{Complect.ABS,Complect.CONDITIONER},17,motor1);


        ObjectMapper mapper = new ObjectMapper();




      mapper.writeValue(new File("Car.json"),mercedes);
      Car mercedes1 = mapper.readValue(new File("Car.json"),Car.class);
        log.info(mercedes1.toString());
    }

}
