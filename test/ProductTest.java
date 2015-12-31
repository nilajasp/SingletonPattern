import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nilajapatankar on 10/12/14.
 */
public class ProductTest {
    @Test
    public void TestOnlyOneAndSameInstanceOfProductExists()
    {
        //Given
        Product product = Product.NewInstance();
        product.SetInstanceName("name");

        //When
        Product anotherProduct = Product.NewInstance();

        //Then
        Assert.assertEquals(product.InstanceName,anotherProduct.InstanceName);
    }
}
