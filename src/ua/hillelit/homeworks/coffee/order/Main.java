package ua.hillelit.homeworks.coffee.order;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("order1");
        Order order2 = new Order("order2");
        Order order3 = new Order("order3");

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add(order1);
        coffeeOrderBoard.add(order2);
        coffeeOrderBoard.add(order3);
        coffeeOrderBoard.add(order1);
        coffeeOrderBoard.add(order2);
        coffeeOrderBoard.add(order3);

        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliverLastOrder();
        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliverKeyOrder(4);
        coffeeOrderBoard.draw();

        coffeeOrderBoard.add(order2);
        coffeeOrderBoard.add(order3);
        coffeeOrderBoard.draw();
    }
}
