package org.example.lesson1.store.ModuleElements;

public class Product {

    {
        id = ++counter;
    }

    // region Поля
    private static int counter = 0;
    private int id;
    private String Name;
    private double price;
    private String category;
    // endregion


    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
