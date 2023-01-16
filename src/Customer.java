import java.util.ArrayList;
import java.util.UUID;

abstract class Customer implements GiveGiftAble {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private int customerDiscount;
    private ArrayList<Item> favoriteItemsList;
    private int customerGift;

    public Customer(String firstName, String lastName, String email, String deliveryAddress) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerDiscount = (int) (Math.random() * 70); // in percentages
        this.favoriteItemsList = new ArrayList<>();
        this.customerGift = (int) (Math.random() * 5);
    }

    @Override
    public void takeGift() {
        this.customerGift += 1;
    }

    @Override
    public void openGift() {
        if (this.customerGift > 0) {
            this.customerGift -= 1;
            System.out.println("Congratulations! you got a new gift! Enjoy! \n You have " + this.customerGift + " gifts left");
        } else {
            System.out.println("You have no gifts");
        }
    }

    public String getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getCustomerDiscount() {
        return customerDiscount;
    }

    public int getCustomerGift(){
        return customerGift;
    }

    public ArrayList<Item> getFavoriteItemsList() {
        return favoriteItemsList;
    }

    public void setFavoriteItemsList(ArrayList<Item> favoriteItemsList) {
        for (Item item : favoriteItemsList) {
            if (!this.favoriteItemsList.contains(item)) {
                this.favoriteItemsList.add(item);
            }
        }
    }

    public void addFavoriteItem(Item item) {
        if (!this.favoriteItemsList.contains(item)) {
            this.favoriteItemsList.add(item);
        }
    }

    public void removeFavoriteItem(Item item) {
        this.favoriteItemsList.remove(item);
    }
}
