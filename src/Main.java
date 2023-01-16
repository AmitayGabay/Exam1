import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        Item i1 = new Item("pelephone", 1500);
        System.out.println(i1 + " " + i1.getId() + " " + i1.getName() + " " +  i1.getPrice());
        Item i2 = new Item("table", 7500);
        System.out.println(i2 + " " + i2.getId() + " " + i2.getName() + " " +  i2.getPrice());
        Item i3 = new Item("cup", 20);
        System.out.println(i3 + " " + i3.getId() + " " + i3.getName() + " " +  i3.getPrice());
        Item i4 = new Item("computer", 4000);
        System.out.println(i4 + " " + i4.getId() + " " + i4.getName() + " " +  i4.getPrice());
        Item i5 = new Item("fan", 870);
        System.out.println(i5 + " " + i5.getId() + " " + i5.getName() + " " +  i5.getPrice());
        ArrayList<Item> arrayList = new ArrayList<>(Arrays.asList(i1, i2, i3, i4, i5));
        System.out.println(arrayList);
        ArrayList<Item> arrayList2 = new ArrayList<>(Arrays.asList(i1, i3, i5));

        RegularCustomer rc = new RegularCustomer("Amitay", "Gabay", "amitaygabay1@gmail.com",
                "Erez 19, Avne-hefetz");
        System.out.println(rc.getId() + " " + rc.getFirstName() + " " + rc.getLastName() + " " + rc.getEmail() + " " +
                rc.getDeliveryAddress() + " " + rc.getFavoriteItemsList() + " " + rc.getCustomerDiscount() + " " +
                rc.getCustomerGift());

        VipCustomer vc = new VipCustomer("Miki", "Gabay", "michaelgabay770@gmail.com",
                "Ben eliezer 45, Netanya");
        System.out.println(vc.getId() + " " + vc.getFirstName() + " " + vc.getLastName() + " " + vc.getEmail() + " " +
                vc.getDeliveryAddress() + " " + vc.getFavoriteItemsList() + " " + vc.getCustomerDiscount() + " " +
                vc.getCustomerGift());

        StandardOrder so = new StandardOrder("one",arrayList,rc,"CREDIT CARD");
        System.out.println(so.getId() + " " + so.getName() + " " + so.getDeliveryAddress() + " " + so.getListItems() + " " +
                so.getOrderedCustomer() + " " + so.getPaymentType() + " " + so.getOrderDate() + " " + so.getTotalPrice());

        VipOrder vo = new VipOrder("two", arrayList2, vc, "CASH");
        System.out.println(vo.getId() + " " + vo.getName() + " " + vo.getDeliveryAddress() + " " + vo.getListItems() + " " +
                vo.getOrderedCustomer() + " " + vo.getPaymentType() + " " + vo.getOrderDate() + " " + vo.getTotalPrice());

        System.out.println(rc.getFavoriteItemsList());
        System.out.println(vc.getFavoriteItemsList());
        vc.addFavoriteItem(i4);
        vc.addFavoriteItem(i3);
        vc.removeFavoriteItem(i2);
        vc.removeFavoriteItem(i1);
        System.out.println(vc.getFavoriteItemsList());
        rc.takeGift();
        System.out.println(rc.getCustomerGift());
        rc.openGift();
    }
}