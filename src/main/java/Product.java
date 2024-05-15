import java.util.Arrays;
import java.util.List;

public class Product {
    private int id;
    private String title;
    private int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public static List<Product> getList(){
        return Arrays.asList(new Product[]{
                new Product(1, "banana", 150),
                new Product(1, "banana", 150),
                new Product(2, "strawberry", 450),
                new Product(2, "strawberry", 450),
                new Product(2, "strawberry", 450),
                new Product(1, "banana", 150),
                new Product(3, "milkshake", 320),
                new Product(3, "milkshake", 320),
                new Product(3, "milkshake", 320),
                new Product(1, "banana", 150),
                new Product(1, "banana", 150)
        });
    }

    @Override
    public String toString() {
        return "\n\nProduct id: "+id+"\n title: " + title +"\n price: " + price;
    }
}
