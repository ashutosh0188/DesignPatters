package builder.ex2;

public class TestProductBuilder {
    public static void main(String[] args) {
        Product product = new Product.ProductBuilder("RAM", 20).build();
        System.out.println(product);

        Product product1 = new Product
                .ProductBuilder("RAM", 20)
                .withDesign("HDR")
                .withType("Alpha")
                .withVendor("XMobo")
                .withPrice(220)
                .build();
        System.out.println(product1);
    }
}
