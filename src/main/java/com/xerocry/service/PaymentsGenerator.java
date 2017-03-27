package com.xerocry.service;

import com.xerocry.domain.Patients;
import com.xerocry.domain.Payments;
import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.FieldDefinitionBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.github.benas.randombeans.api.Randomizer;
import io.github.benas.randombeans.randomizers.number.DoubleRandomizer;
import io.github.benas.randombeans.randomizers.time.LocalDateRandomizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.function.Supplier;

public class PaymentsGenerator extends BaseGenerator {

    EnhancedRandom random;

    PaymentsGenerator() throws FileNotFoundException{
        generate();
    }

    private boolean generate() throws FileNotFoundException {
        Supplier<Payments.State> stateSupplier = () -> {
            switch ((int) (Math.random() * 2 + 1)) {
                case 1: return Payments.State.NOT_PAID;
                case 2: return Payments.State.PAID;
                default: return Payments.State.NOT_PAID;
            }
        };

        random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
                .randomize(FieldDefinitionBuilder.field()
                        .named("discount").ofType(Double.class).get(), new DoubleRandomizer())
                .randomize(FieldDefinitionBuilder.field()
                        .named("state").ofType(Payments.State.class).get(), stateSupplier)
                .randomize(FieldDefinitionBuilder.field()
                        .named("balance").ofType(String.class).get(), new DoubleRandomizer())
                .exclude(FieldDefinitionBuilder.field()
                        .named("patients").get())
                .stringLengthRange(5, 50)
                .build();

        return true;
    }

}
