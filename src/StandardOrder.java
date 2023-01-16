import java.util.ArrayList;

public class StandardOrder extends Order{
    public StandardOrder(String name, ArrayList<Item> listItems, Customer orderedCustomer, String paymentType) {
        super(name, listItems, orderedCustomer, paymentType);
        getTotalPrice();
    }

    @Override
    public double getTotalPrice() {
        double sum = 0;
        for (Item item : this.getListItems() ) {
            sum += item.getPrice();
        }
        return sum;
    }
}
