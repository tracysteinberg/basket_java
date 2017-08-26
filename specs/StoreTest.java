
import static org.junit.Assert.*;
import org.junit.*;
import store.*;
import java.math.BigDecimal;
import customer.*;
import basket.*;
// import java.util.HashMap;

public class StoreTest {

   Store totValue;
   Basket item1;
   Basket item2;
   Basket item3;
   Basket item4;
   Customer customer;
   Calc2  discount;


  
   @Before 
      public void before() { 

      totValue = new Store(new BigDecimal("0"), new BigDecimal("0"));

      customer = new Customer("Alex", new BigDecimal("50.00"), new Boolean(true));

      item1 = new Basket("Bananas", new BigDecimal("0.99"), customer);
      item2 = new Basket("Bread", new BigDecimal("-1.50"), customer);
      item3 = new Basket("Bananas", new BigDecimal("0.00"), customer);
      item4 = new Basket("Saucepans", new BigDecimal("20.00"), customer);
    
    }


    @Test
       public void storeCanMakeSale() {
       totValue.addBasket(item1);
       BigDecimal expected = new BigDecimal("0.99");
       assertEquals(expected, totValue.getBalance());
      } 


    @Test
       public void storeCanReturn() {
       totValue.addBasket(item1);
       totValue.subtractBasket(item2);
       BigDecimal expected = new BigDecimal("-0.51");
       assertEquals(expected, totValue.getBalance());
    }


    @Test
       public void bogof() {
       totValue.addBasket(item1);
       totValue.addBasket(item3);
       BigDecimal expected = new BigDecimal("0.99");
       assertEquals(expected, totValue.getBalance());
    }


    @Test
       public void percentDiscount() {
       totValue.addBasket(item1);
       totValue.addBasket(item4);
       BigDecimal amount = new BigDecimal("20.99"); 
       BigDecimal discountPercent = new BigDecimal("0.10"); 
       BigDecimal discount2 = amount.multiply(discountPercent); 
       BigDecimal discount = amount.subtract(discount2);
       BigDecimal expected = new BigDecimal("18.89");
       assertEquals(expected, totValue.getBalance());
    }

} 