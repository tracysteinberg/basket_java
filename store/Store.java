package store;

import java.math.BigDecimal;
import java.util.*;
import java.util.ArrayList;
import basket.*;
import customer.*;
import store.*;


public class Store  {

  
  private ArrayList<Basket> baskets;
  private BigDecimal initialBalance;

  public Store(BigDecimal initialBalance) {
    this.initialBalance = initialBalance;
    this.baskets = new ArrayList<Basket>();
  }

  

  public ArrayList<Basket> getBaskets(){
    return this.baskets;
  }

//   sales

  public void addBasket(Basket t) {
  
    baskets.add(t);
    t.getCustomer();  t.getItem(); t.getPrice();
    // t.getCustomer().spendMoney(t.getAmount(), t.getPaymentMethod());

  }



//   refunds

  public void subtractBasket(Basket t) {
    baskets.add(t);
    t.getCustomer();  t.getItem(); t.getPrice();
    // t.getCustomer().refundMoney(t.getAmount(), t.getPaymentMethod());

   }



//  sum = balance 

  public BigDecimal getBalance() {
    
    BigDecimal sum = BigDecimal.ZERO;

    for (int i = 0; i < this.baskets.size(); i++) {
    sum = sum.add(this.baskets.get(i).getPrice());

    }
     
    return sum.add(this.initialBalance);

  }
 

  
}