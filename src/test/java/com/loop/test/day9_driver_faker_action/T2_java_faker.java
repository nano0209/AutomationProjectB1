package com.loop.test.day9_driver_faker_action;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class T2_java_faker {

    @Test
    public void java_faker(){
        Faker faker = new Faker();
        System.out.println("faker.name().fullName() =" + faker.name().fullName());
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"202-###-####\") = " + faker.numerify("202-###-####"));

        System.out.println("faker.letterify() = " + faker.letterify("???????"));

        System.out.println("faker.address() = " + faker.address().fullAddress());

        System.out.println("faker.finance() = " + faker.finance().creditCard().replace("-",""));

        System.out.println("faker.chuckNorris() = " + faker.chuckNorris().fact().replace("Chuck Norris", "Feyruz"));

        System.out.println("faker.bothify() = " + faker.bothify("##???#"));

    }
}
