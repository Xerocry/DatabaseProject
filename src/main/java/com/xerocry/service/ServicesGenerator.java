package com.xerocry.service;

import com.xerocry.domain.Patients;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.github.benas.randombeans.api.Randomizer;
import io.github.benas.randombeans.randomizers.number.IntegerRandomizer;
import io.github.benas.randombeans.randomizers.time.LocalDateRandomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.function.Supplier;

public class ServicesGenerator extends BaseGenerator {

    EnhancedRandom random;

    ServicesGenerator() throws FileNotFoundException{
        generate();
    }

    private boolean generate() throws FileNotFoundException {
        File services = new File("services");

        random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .randomize(FieldDefinitionBuilder.field()
                        .named("serviceName").ofType(String.class).get(), (Randomizer<String>) () -> {
                            try {
                                return choose(services);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                .randomize(FieldDefinitionBuilder.field()
                        .named("birthDate").ofType(LocalDate.class).get(), new LocalDateRandomizer())
                .randomize(FieldDefinitionBuilder.field()
                        .named("price").ofType(Integer.class).get(), new IntegerRandomizer())
                .exclude(FieldDefinitionBuilder.field()
                        .named("treatments").get())
                .stringLengthRange(5, 50)
                .build();

        return true;
    }

}
