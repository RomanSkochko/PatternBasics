package org.example.PatternBasics.builder;

public class Example {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("John")
                .secondName("Snow")
                .age(25)
                .build();

        System.out.println(user);

        GenericUser genericUser = GenericBuilder.of(GenericUser::new)
                .with(GenericUser::setFirstName, "GenericJohn")
                .with(GenericUser::setSecondName, "GenericJohn")
                .with(GenericUser::setAge, 25)
                .build();

        System.out.println(genericUser);
    }
}
