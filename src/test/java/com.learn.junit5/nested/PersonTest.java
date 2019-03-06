package com.learn.junit5.nested;

import com.learn.junit5.facade.Person;
import com.learn.junit5.facade.SocialSecurityNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Person")
public class PersonTest {
    private Person person;
    @BeforeEach
    public void setup() {
        person = new Person("Mohammad", "Shalabi", "123", true, "usa", "123-45-6789");
    }

    @Test
    public void validPersonFirstName() {
        String firstName = person.getFirstName();
        Assertions.assertTrue(firstName!=null || firstName.isEmpty());
    }

    @Nested
    @DisplayName("Social Security Number")
    class SocialSecurityNumberValidationTest {
        SocialSecurityNumber socialSecurityNumber;

        @BeforeEach
        public void setup() {
            socialSecurityNumber = SocialSecurityNumber.create(person.getCountry());
        }

        @Test
        public void validateTest() {
            Assertions.assertTrue(socialSecurityNumber.validate(person.getSocialSecurityNumber()));
        }

    }

}
