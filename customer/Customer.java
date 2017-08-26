package customer;

import java.math.BigDecimal;
import java.util.*;
import basket.*;
import store.*;


public class Customer  {


  private String name;
  private BigDecimal funds;
  private Boolean loyaltyCard;
  

  public Customer(String name, BigDecimal funds, Boolean loyaltyCard) {
    this.name = name;
    this.funds = funds;
    this.loyaltyCard = loyaltyCard;
    
  }


  public String getName(){
    return this.name;
  }

  public BigDecimal getFunds() {
    return this.funds;
  }

  public Boolean getLoyaltyCard() {
    return this.loyaltyCard;
  }

  // public void spendMoney(BigDecimal amount, PaymentMethod method) {
  //   BigDecimal currentBalance = this.myWallet.get(method);
  //   BigDecimal newBalance = currentBalance.subtract(amount);
  //   this.myWallet.put(method, newBalance);
      
  // }

  // public void refundMoney(BigDecimal amount, PaymentMethod method) {
  //   BigDecimal currentBalance = this.myWallet.get(method);
  //   BigDecimal newBalance = currentBalance.add(amount);
  //   this.myWallet.put(method, newBalance);
      
  // }



  
}