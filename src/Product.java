/**
 * Created by nilajapatankar on 10/12/14.
 */
public class Product {
    public String InstanceName;
    private static Product product;

    private Product() {
    }

    public static Product NewInstance() {
        if(product == null)
        {
            product = new Product();
        }
        return product;
    }

    public void SetInstanceName(String instanceName) {
        InstanceName = instanceName;
    }
}
