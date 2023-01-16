import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

abstract class Order implements CalculateAble{
    private String id;
    private String name;
    private String deliveryAddress;
    private ArrayList<Item> listItems;
    private Customer orderedCustomer;
    private String paymentType;
    private LocalDate orderDate;


    public Order( String name, ArrayList<Item> listItems, Customer orderedCustomer, String paymentType) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.deliveryAddress = orderedCustomer.getDeliveryAddress();
        this.listItems = listItems;
        this.orderedCustomer = orderedCustomer;
        this.paymentType = paymentType;
        this.orderDate = LocalDate.now();
        updateFavoriteItemsListOfCustomer();
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public ArrayList<Item> getListItems() {
        return listItems;
    }

    public Customer getOrderedCustomer() {
        return orderedCustomer;
    }

    private void updateFavoriteItemsListOfCustomer() {
        this.orderedCustomer.setFavoriteItemsList(this.listItems);
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}

