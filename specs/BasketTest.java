
import static org.junit.Assert.*;
import org.junit.*;
import java.math.BigDecimal;
import basket.*;
import customer.*;
import store.*;



public class BasketTest {

  Customer customer;
  String item;
  BigDecimal price;
  Basket item1;
  Basket item2;
  BigDecimal expected;
  Basket basket;
  Store  totValue;

  
   @Before 
     public void before() {
      
       customer = new Customer("Alex", new BigDecimal("50.00"), new Boolean(true));

       item1 = new Basket("Bananas", new BigDecimal("0.99"), customer);
       item2 = new Basket("Bread", new BigDecimal("1.50"), customer);


       totValue = new Store(new BigDecimal("0"));
       
   }


    // @Test 

    //    public void basketHasItem() {
    //    assertEquals("Bananas", basket.getItem());
    //    }

    //  @Test 

    //    public void itemHasPrice() {
    //    BigDecimal expected = new BigDecimal("0.99");
    //    assertEquals(expected, basket.getPrice());
    //    }


      @Test
        public void basketCanAddItems() {
        totValue.addBasket(item1);
        totValue.addBasket(item2);
        assertEquals(2, totValue.getBaskets().size());
       }

       @Test
        public void basketCanRemoveItems() {
        totValue.subtractBasket(item2);
        assertEquals(1, totValue.getBaskets().size());
       }


       @Test
        public void basketCanBeEmptied() {
        assertEquals(0, totValue.getBaskets().size());
       }




    // @Test
    //   public void hasTransactions() {
    //     graceBros.addTransaction(transaction1);
    //     graceBros.subtractTransaction(transaction2);
    //     assertEquals(2, graceBros.getTransactions().size());
    // }


  
   






} 