import java.util.ArrayList;

public class VipOrder extends Order  {
    public VipOrder(String name, ArrayList<Item> listItems, Customer orderedCustomer, String paymentType) throws Exception {
        super(name, listItems, orderedCustomer, paymentType);
        getTotalPrice();
    }

    @Override
    public double getTotalPrice() throws Exception {
        if (this.getOrderedCustomer() instanceof VipCustomer) {
            double sum = 0;
            for (Item item : this.getListItems()) {
                sum += item.getPrice();
            }
            return sum * (100 - this.getOrderedCustomer().getCustomerDiscount())/100;
        } else {
            throw new Exception("you are not a vip customer");
        }
    }
}
