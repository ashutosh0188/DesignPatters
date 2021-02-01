package builder.ex2;

public class Product {
    private String name;
    private Long quantity;
    private String type;
    private String design;
    private double price;
    private String vendor;

    private Product(ProductBuilder pb) {
        this.name = pb.name;
        this.quantity = pb.quantity;
        this.type = pb.type;
        this.design = pb.design;
        this.price = pb.price;
        this.vendor = pb.vendor;
    }

    public String getName() {
        return name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public String getDesign() {
        return design;
    }

    public double getPrice() {
        return price;
    }

    public String getVendor() {
        return vendor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                ", design='" + design + '\'' +
                ", price=" + price +
                ", vendor='" + vendor + '\'' +
                '}';
    }

    public static class ProductBuilder {
        private String name;
        private Long quantity;
        private String type;
        private String design;
        private double price;
        private String vendor;

        public ProductBuilder(String name, long quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public ProductBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public ProductBuilder withDesign(String design) {
            this.design = design;
            return this;
        }

        public ProductBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder withVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
