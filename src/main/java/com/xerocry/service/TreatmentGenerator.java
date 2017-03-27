package com.xerocry.service;

import com.xerocry.domain.Patients;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.github.benas.randombeans.api.Randomizer;
import io.github.benas.randombeans.randomizers.text.StringRandomizer;
import io.github.benas.randombeans.randomizers.time.LocalDateRandomizer;
import org.assertj.core.internal.cglib.core.Local;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class TreatmentGenerator extends BaseGenerator {

    EnhancedRandom random;

    TreatmentGenerator() throws FileNotFoundException{
        generate();
    }

    private boolean generate() throws FileNotFoundException {
        long minDay = LocalDate.of(1970, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2035, 12, 30).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        LocalDate startDate = LocalDate.ofEpochDay(randomDay);

        random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .randomize(FieldDefinitionBuilder.field()
                        .named("treatment").ofType(String.class).get(), new StringRandomizer())
                .dateRange(startDate,  LocalDate.of(2035, 12, 31))
                .exclude(FieldDefinitionBuilder.field()
                        .named("drugs").get())
                .exclude(FieldDefinitionBuilder.field()
                        .named("services").get())
                .exclude(FieldDefinitionBuilder.field()
                        .named("patientId").get())
                .exclude(FieldDefinitionBuilder.field()
                        .named("doctorId").get())
                .exclude(FieldDefinitionBuilder.field()
                        .named("diseaseId").get())
                .stringLengthRange(5, 50)
                .build();
        return true;
    }

}
