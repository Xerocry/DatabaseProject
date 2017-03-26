package com.xerocry.service;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.github.benas.randombeans.api.Randomizer;

import java.io.File;
import java.io.FileNotFoundException;

public class DepartmentsGenerator extends BaseGenerator {

    EnhancedRandom random;

    DepartmentsGenerator() throws FileNotFoundException{
        generate();
    }

    private boolean generate() throws FileNotFoundException {
        File departs = new File("departs");

        random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .randomize(FieldDefinitionBuilder.field()
                        .named("departName").ofType(String.class).get(), (Randomizer<String>) () -> {
                            try {
                                return choose(departs);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
//                .stringLengthRange(5, 50)
                .exclude(FieldDefinitionBuilder.field()
                        .named("doctors").get())
                .build();
        return true;
    }
}
