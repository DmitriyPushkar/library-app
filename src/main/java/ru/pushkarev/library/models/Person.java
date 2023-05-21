package ru.pushkarev.library.models;

public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private int birthDate;

    public Person() {
    }

    public Person(String name, String surname, String patronymic, int birthDate) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
    }
}
