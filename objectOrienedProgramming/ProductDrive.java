package objectOrienedProgramming;

public class ProductDrive {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();

        // first product
        p1.name = "Laptop";
        p1.size = "four-inch";
        p1.Price = 5444;
        p1.color = "red";
        p1.brand = "MSI";
        // Second product
        p2.name = "Washing Machine";
        p2.size = "Nine-inch";
        p2.Price = 90000;
        p2.color = "White";
        p2.brand = "Acer";
        // third Product
        p3.name = "Television";
        p3.size = "Ten-inch";
        p3.Price = 20000;
        p3.color = "Black";
        p3.brand = "apple";
        // fourth product

        p4.name = "Radio";
        p4.size = "six-inch";
        p4.Price = 2000;
        p4.color = "grey";
        p4.brand = "Dell";

        System.out.println(p1.name);
        System.out.println(p1.size);
        System.out.println(p1.Price);
        System.out.println(p1.color);
        System.out.println(p1.brand);

        System.out.println(p2.name);
        System.out.println(p2.size);
        System.out.println(p2.Price);
        System.out.println(p2.color);
        System.out.println(p1.brand);

        System.out.println(p3.name);
        System.out.println(p3.size);
        System.out.println(p1.brand);
        System.out.println(p3.Price);
        System.out.println(p3.color);

        System.out.println(p4.name);
        System.out.println(p4.size);
        System.out.println(p4.Price);
        System.out.println(p4.color);
        System.out.println(p1.brand);
    }

}
