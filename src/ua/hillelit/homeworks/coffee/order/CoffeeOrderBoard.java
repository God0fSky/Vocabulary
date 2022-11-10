package ua.hillelit.homeworks.coffee.order;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CoffeeOrderBoard {
    private final Map<Integer, Order> listOrder = new LinkedHashMap<>();
    private Integer lastKeyValue = 0;

    public boolean add(Order order) {
        if (order == null) {
            System.out.println("Заказ не может быть null!");
            return false;
        }
        listOrder.put(++lastKeyValue, order);
        order.setNumber(lastKeyValue);
        return true;
    }

    public Order deliverLastOrder() {
        return listOrder.remove(lastKeyValue);
    }

    public Order deliverKeyOrder(Integer integer) {
        return listOrder.remove(integer);
    }

    public void draw() {
        Set<Integer> intSet = listOrder.keySet();
        System.out.println("Num  |  Name");
        for (Integer integer : intSet) {
            System.out.println(integer + "  |  " + listOrder.get(integer).getNameOfCustomer());
        }
    }



}
