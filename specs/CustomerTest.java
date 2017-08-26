import static org.junit.Assert.*;
import org.junit.*;
import customer.*;
// import transaction.*;
// import store.*;
import java.math.BigDecimal;
import java.util.HashMap;

public class CustomerTest {

  Customer customer;
  BigDecimal funds;
  Boolean loyaltyCard;
  BigDecimal expected;

  
   @Before 
     public void before() {
    
     customer = new Customer("Alex", new BigDecimal("50.00"), new Boolean(true));


    }
      
   @Test
      public void hasName() {
      assertEquals("Alex", customer.getName());
    }


   @Test
      public void hasFunds() {
      BigDecimal expected = new BigDecimal("50.00");
      assertEquals(expected, customer.getFunds());
      
    }


   @Test
      public void hasLoyaltyCard() {
      assertEquals(true, customer.getLoyaltyCard());
      
    }







    // @Test
    //    public void canDeductFromPaymentMethod() {
    //    BigDecimal expected = new BigDecimal("950.00");
    //    BigDecimal spendMoney = new BigDecimal("50.00");
    //    customer1.spendMoney(spendMoney, PaymentMethod.CHEQUE);
    //    assertEquals(expected, customer1.getFunds().get(PaymentMethod.CHEQUE));
    // }


    // @Test
    //    public void canAddToPaymentMethod() {
    //    BigDecimal expected = new BigDecimal("10060.00");
    //    BigDecimal refundMoney = new BigDecimal("60.00");
    //    customer2.refundMoney(refundMoney, PaymentMethod.VISA);
    //    assertEquals(expected, customer2.getFunds().get(PaymentMethod.VISA));
    // }



} 