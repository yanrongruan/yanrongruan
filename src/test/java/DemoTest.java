
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void case1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void case2(){
        Assert.assertEquals("hello","hello");;
    }
}
