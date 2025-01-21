package org.example.PatternBasics.builder;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/**
 * A generic builder class for creating and configuring objects in a flexible and reusable way
 *
 * @param <T> The type of the object being built
 */
public class GenericBuilder<T> {
    /**
     * A supplier responsible for creating an instance of the object
     * This is used lazily to build the object when needed
     */
    private final Supplier<T> supplier;

    /**
     * Private constructor to initialize the builder with a supplier
     */
    private GenericBuilder(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    /**
     * Static factory method to create a new GenericBuilder instance.
     */
    public static <T> GenericBuilder<T> of(Supplier<T> supplier) {
        return new GenericBuilder<>(supplier);
    }

    /**
     * Adds a configuration step to the builder.
     * This method creates a new builder instance that applies a specific configuration
     * to the object being built
     */
    public <P> GenericBuilder<T> with(BiConsumer<T, P> consumer, P value) {
        return new GenericBuilder<>(() -> {
            // Create a new instance of T using the current supplier
            T object = supplier.get();
            // Apply the configuration using the BiConsumer
            consumer.accept(object, value);
            // Return the configured object
            return object;
        });
    }

    /**
     * Builds the final object by calling the supplier's get method
     */
    public T build() {
        return supplier.get();
    }
}
