import org.junit.*;
public class AppTest {
       public AppTest(){
       }
       @Test
       public void test(){
	  System.out.println("Testing in progress...");         
	  Assert.assertArrayEquals(new Object[]{1,2,3},new 
Object[]{1,2,4});
       }
}
