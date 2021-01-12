package theauctionhouse;

public class Seller extends User{
    private float balance;
    private  ArrayList<Product> postedProducts ;

    public Seller(float balance, ArrayList postedProducts) {
        this.balance = balance;
        this.postedProducts = postedProducts;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
