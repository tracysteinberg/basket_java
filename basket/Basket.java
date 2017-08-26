package basket;

import java.math.BigDecimal;
import java.util.*;
import customer.*;

public class Basket {

  private Customer customer;
  private String     item;
  private BigDecimal price;
  // private String     item2;
  // private BigDecimal price2;




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

  // public String getItem2() {
  //    return this.item2;
  // }

  // public BigDecimal getPrice2() {
  //   return this.price2;
  // }

  
} 

  
  