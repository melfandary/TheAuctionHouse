/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theauctionhouse;

import java.util.ArrayList;

/**
 *
 * @author ur daddy
 */
public class Moderator extends User {
    private static Moderator instance;
    ArrayList<String> pendingProducts = new ArrayList<String>();
    
    private Moderator()
    {
        
    }
    
    public static Moderator getInstance()
    {
        if ( instance == null )
        {
            instance = new Moderator();
        }
        return instance;
    }
    
    public void AcceptAuctionReq(Product p){
        
    }
}
