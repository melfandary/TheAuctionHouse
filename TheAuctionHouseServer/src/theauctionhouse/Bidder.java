/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theauctionhouse;

/**
 *
 * @author John Osama
 */
class Bidder extends User {
    public int balance;

    public Bidder() {
    }

    public Bidder(int uID, String uname, String upass, String umail, int uage, String gender, String uaddress, int unumber) {
        super(uID, uname, upass, umail, uage, gender, uaddress, unumber);
    }

    public Bidder(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
}
