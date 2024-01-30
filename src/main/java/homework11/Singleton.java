package homework11;

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

class Product {
    private String name;
    private int price;
    private String category;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.category = builder.category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    static class Builder {
        private String name;
        private int price;
        private String category;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}

   class DesignPatternExample {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Singleton örnekleri aynı mı? " + (singleton1 == singleton2));

        Product product1 = new Product.Builder("TV")
         .setPrice(1000)
         .setCategory("Electronics")
         .build();

        System.out.println("Product adi: " + product1.getName());
        System.out.println("Product fiyati: $" + product1.getPrice());
        System.out.println("Product categori: " + product1.getCategory());
    }
}
