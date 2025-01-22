package org.example.patternbasics.creational.builder;

import lombok.ToString;

/**
 * User class implementing Builder pattern
 * This pattern is useful when dealing with objects that require many parameters
 */
@ToString
public class User {
    // Final fields ensure immutability after object construction
    private final String firstName;
    private final String secondName;
    private final int age;

    /**
     * Private constructor that takes a builder
     * Only the Builder can create User instances
     */
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
    }

    /**
     * Returns builder instance
     */
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    // Getter methods for accessing private fields
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    /**
     * Static nested Builder class
     * Provides a step-by-step way to construct a User object
     */
    public static class UserBuilder {
        private String firstName;
        private String secondName;
        private int age;

        /**
         * Setter methods return the builder itself
         * This enables method chaining for fluent interface
         */
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        /**
         * Final build method that constructs and returns the User object
         */
        public User build() {
            return new User(this);
        }
    }
}
