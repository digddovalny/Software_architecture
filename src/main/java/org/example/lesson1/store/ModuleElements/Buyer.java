package org.example.lesson1.store.ModuleElements;

import java.util.Date;

public class Buyer {


    // region Инициализатор и конструкторы
    {
        id = ++counter;
    }
    // endregion

    // region Свойства
    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    // endregion

    //region Поля
    private static int counter = 0;
    private int id;
    private String gender;
    private String name;
    private String lastName;
    private String patronymic;
    private Date birthDay;
    // endregion
}
