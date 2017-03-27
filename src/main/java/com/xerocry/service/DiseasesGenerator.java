package com.xerocry.service;

import com.xerocry.domain.Patients;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.github.benas.randombeans.api.Randomizer;
import io.github.benas.randombeans.randomizers.text.StringRandomizer;
import io.github.benas.randombeans.randomizers.time.LocalDateRandomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.function.Supplier;

public class DiseasesGenerator extends BaseGenerator {

    EnhancedRandom random;

    DiseasesGenerator() throws FileNotFoundException{
        generate();
    }

    private boolean generate() throws FileNotFoundException {
        File diseases = new File("diseases");

        /*Supplier<Patients.Gender> genderSupplier = () -> {
            switch ((int) (Math.random() * 2 + 1)) {
                case 1: return Patients.Gender.FEMALE;
                case 2: return Patients.Gender.MALE;
                default: return Patients.Gender.MALE;
            }
        };*/

        random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .randomize(FieldDefinitionBuilder.field()
                        .named("disName").ofType(String.class).get(), (Randomizer<String>) () -> {
                            try {
                                return choose(diseases);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                .randomize(FieldDefinitionBuilder.field()
                        .named("symptoms").ofType(String.class).get(), new StringRandomizer(50))
                .exclude(FieldDefinitionBuilder.field()
                        .named("disType").get())
                .build();
        return true;
    }

}
