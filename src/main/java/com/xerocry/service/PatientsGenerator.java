package com.xerocry.service;

import com.xerocry.domain.Patients;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.github.benas.randombeans.api.Randomizer;
import io.github.benas.randombeans.randomizers.time.LocalDateRandomizer;


import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;

import java.util.function.Supplier;

public class PatientsGenerator extends BaseGenerator {

    EnhancedRandom random;

    PatientsGenerator() throws FileNotFoundException{
        generate();
    }

    private boolean generate() throws FileNotFoundException {
        File names = new File("names");
        File cities = new File("cities");

        Supplier<Patients.Gender> genderSupplier = () -> {
            switch ((int) (Math.random() * 2 + 1)) {
                case 1:
                    return Patients.Gender.FEMALE;
                case 2:
                    return Patients.Gender.MALE;
                default:
                    return Patients.Gender.MALE;
            }
        };

        random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .randomize(FieldDefinitionBuilder.field()
                        .named("name").ofType(String.class).get(), (Randomizer<String>) () -> {
                            try {
                                return choose(names);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                .randomize(FieldDefinitionBuilder.field()
                        .named("birthDate").ofType(LocalDate.class).get(), new LocalDateRandomizer())
                .randomize(FieldDefinitionBuilder.field()
                        .named("gender").ofType(Patients.Gender.class).get(), genderSupplier)
                .randomize(FieldDefinitionBuilder.field()
                        .named("city").ofType(String.class).get(), (Randomizer<String>) () -> {
                    try {
                        return choose(cities);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                .exclude(FieldDefinitionBuilder.field()
                    .named("payments").get())
                .exclude(FieldDefinitionBuilder.field()
                    .named("treatments").get())

                .build();

        return true;
    }

}
