package com.xerocry.service;

import com.xerocry.domain.Patients;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.github.benas.randombeans.api.Randomizer;
import io.github.benas.randombeans.randomizers.number.IntegerRandomizer;
import io.github.benas.randombeans.randomizers.time.DateRandomizer;
import io.github.benas.randombeans.randomizers.time.LocalDateRandomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.function.Supplier;

public class DoctorsGenerator extends BaseGenerator {

    EnhancedRandom random;

    DoctorsGenerator() throws FileNotFoundException{
        generate();
    }

    private boolean generate() throws FileNotFoundException {
        File skills = new File("skills");

        random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .randomize(FieldDefinitionBuilder.field()
                        .named("skills").ofType(String.class).get(), (Randomizer<String>) () -> {
                            try {
                                return choose(skills);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                .randomize(FieldDefinitionBuilder.field()
                        .named("hireDate").ofType(LocalDate.class).get(), new LocalDateRandomizer())
                .randomize(FieldDefinitionBuilder.field()
                        .named("experience").ofType(Integer.class).get(), new IntegerRandomizer())
                .exclude(FieldDefinitionBuilder.field()
                        .named("departId").get())
                .stringLengthRange(5, 50)
                .build();

        return true;
    }

}
