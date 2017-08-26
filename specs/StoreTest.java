
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
   Customer customer;

  
   @Before 
      public void before() { 

      totValue = new Store(new BigDecimal("0"));

      customer = new Customer("Alex", new BigDecimal("50.00"), new Boolean(true));

      item1 = new Basket("Bananas", new BigDecimal("0.99"), customer);
      item2 = new Basket("Bread", new BigDecimal("1.50"), customer);
    
    }


    @Test
       public void storeCanMakeSale() {
       // totValue.addBasket(item1);
       BigDecimal expected = new BigDecimal("0.99");
       assertEquals(expected, totValue.getBalance());
      } 


    @Test
       public void storeCanReturn() {
       // totValue.addBasket(item1);
       // totValue.subtractBasket(item2);
       BigDecimal expected = new BigDecimal("-0.51");
       assertEquals(expected, totValue.getBalance());
    }


} 