package ua.hillelit.homeworks.coffee.order;

public class Order {
    private int number;
    private String nameOfCustomer;

    public Order(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
