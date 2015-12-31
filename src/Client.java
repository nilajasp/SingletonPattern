/**
 * Created by nilajapatankar on 10/12/14.
 */
public class Client {
    public static void main(String[] args) {
        Product product = Product.NewInstance();
        product.SetInstanceName("Initial name");
        System.out.println("Initial instance name: " + product.InstanceName);

        Product anotherProduct = Product.NewInstance();
        System.out.println("New instance name: " + anotherProduct.InstanceName);
    }
}
