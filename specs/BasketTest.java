
import static org.junit.Assert.*;
import org.junit.*;
import java.math.BigDecimal;
import basket.*;
import customer.*;
// import store.*;
// import java.util.HashMap;


public class BasketTest {

  Customer customer;
  String item;
  BigDecimal price;
  // String item2;
  // BigDecimal price2;
  Basket basket;
  BigDecimal expected;
  // Store graceBros;

  
   @Before 
     public void before() {
      
       customer = new Customer("Alex", new BigDecimal("50.00"), new Boolean(true));

       basket = new Basket("Bananas", new BigDecimal("0.99"), customer);
       // item2 = new Basket("Bread", new BigDecimal("1.50"), customer);
    


       // graceBros = new Store(new BigDecimal("200.00"));
       // transaction1 = new Transaction(new BigDecimal("50.00"),  PaymentMethod.CHEQUE, customer1);
       // transaction2 = new Transaction(new BigDecimal("60.00"),  PaymentMethod.VISA, customer2);
   }


    @Test 

       public void basketHasItem() {
       assertEquals("Bananas", basket.getItem());
       }

     @Test 

       public void itemHasPrice() {
       BigDecimal expected = new BigDecimal("0.99");
       assertEquals(expected, basket.getPrice());
       }



    // @Test
    //    public void canAddToBasket() {
    //    BigDecimal expected = new BigDecimal("10060.00");
    //    BigDecimal refundMoney = new BigDecimal("60.00");
    //    customer2.refundMoney(refundMoney, PaymentMethod.VISA);
    //    assertEquals(expected, customer2.getFunds().get(PaymentMethod.VISA));
    // }


    // @Test
    //    public void canDeductFromPaymentMethod() {
    //    BigDecimal expected = new BigDecimal("950.00");
    //    BigDecimal spendMoney = new BigDecimal("50.00");
    //    customer1.spendMoney(spendMoney, PaymentMethod.CHEQUE);
    //    assertEquals(expected, customer1.getFunds().get(PaymentMethod.CHEQUE));
    // }










    // @Test
    //   public void hasTransactions() {
    //     graceBros.addTransaction(transaction1);
    //     graceBros.subtractTransaction(transaction2);
    //     assertEquals(2, graceBros.getTransactions().size());
    // }


  
   






} 