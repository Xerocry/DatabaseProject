package com.xerocry.service;

import com.xerocry.domain.Patients;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.github.benas.randombeans.api.Randomizer;
import io.github.benas.randombeans.randomizers.number.IntegerRandomizer;
import io.github.benas.randombeans.randomizers.number.LongRandomizer;
import io.github.benas.randombeans.randomizers.range.LongRangeRandomizer;
import io.github.benas.randombeans.randomizers.time.LocalDateRandomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.function.Supplier;

public class GrantsGenerator extends BaseGenerator {

    EnhancedRandom random;

    GrantsGenerator() throws FileNotFoundException{
        generate();
    }

    private boolean generate() throws FileNotFoundException {
        random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .randomize(FieldDefinitionBuilder.field()
                        .named("date").ofType(LocalDate.class).get(), new LocalDateRandomizer())
                .randomize(FieldDefinitionBuilder.field()
                        .named("sum").ofType(Long.class).get(), new LongRangeRandomizer(Long.parseLong("0"), Long.MAX_VALUE/2))
                .exclude(FieldDefinitionBuilder.field()
                        .named("service").get())
                .exclude(FieldDefinitionBuilder.field()
                        .named("drug").get())
                .exclude(FieldDefinitionBuilder.field()
                        .named("doctor").get())
                .exclude(FieldDefinitionBuilder.field()
                        .named("patient").get())
                .stringLengthRange(5, 50)
                .build();

        return true;
    }

}
