package basket;

import java.math.BigDecimal;
import java.util.*;
import customer.*;
import store.*;

public class Basket {

  private Customer customer;
  private String     item;
  private BigDecimal price;
  private BigDecimal discount;
  




  public Basket(String item, BigDecimal price, Customer cust) {

    this.item = item;
    this.price = price;
    this.customer = cust;
   

    // this.item2 = item2;
    // this.price2 = price2;
  }


  public Customer getCustomer() {
    return this.customer;
  }

  public String getItem() {
     return this.item;
  }

  public BigDecimal getPrice() {
    return this.price;
  }




  
} 

  
  