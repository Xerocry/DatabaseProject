package com.xerocry.service;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.github.benas.randombeans.api.Randomizer;

import java.io.File;
import java.io.FileNotFoundException;

public class DrugsGenerator extends BaseGenerator {

    EnhancedRandom random;

    DrugsGenerator() throws FileNotFoundException{
        generate();
    }

    private boolean generate() throws FileNotFoundException {
        File drugs = new File("drugs");

        random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .randomize(FieldDefinitionBuilder.field()
                        .named("drugName").ofType(String.class).get(), (Randomizer<String>) () -> {
                            try {
                                return choose(drugs);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                .exclude(FieldDefinitionBuilder.field()
                        .named("typeId").get())
                .exclude(FieldDefinitionBuilder.field()
                        .named("treatments").get())
                .stringLengthRange(5, 50)
                .build();
        return true;
    }

}
