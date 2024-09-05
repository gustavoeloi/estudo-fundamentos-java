package entities;

import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    LocalDateTime moment;
    OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order() {}

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;

        for(OrderItem item: items) {
            sum += item.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("ORDER SUMMARY: \n");
       sb.append("Order moment: ");
       sb.append(moment.format(fmt));
       sb.append("\nOrder Status: ");
       sb.append(status);
       sb.append("\nCliente: ").append(client);
       sb.append("\nOrder Items: ");
       for(OrderItem item: items) {
           sb.append(item).append("\n");
       }
       sb.append("Total price: $").append(total());

       return sb.toString();
    }
}
