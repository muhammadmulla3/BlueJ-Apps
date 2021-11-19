import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Muhammad Mulla.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random generator = new Random();

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "iPhone 1"));
        stock.add(new Product(102, "iPhone 2"));
        stock.add(new Product(103, "iPhone 3"));
        stock.add(new Product(104, "iPhone 4"));
        stock.add(new Product(105, "iPhone 5"));
        stock.add(new Product(106, "iPhone 6"));
        stock.add(new Product(107, "iPhone 7"));
        stock.add(new Product(108, "iPhone 8"));
        stock.add(new Product(109, "iPhone 9"));
        stock.add(new Product(110, "iPhone 10"));
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
     private void buyProducts()
    {
        Product product;
        int quantity = 1;
        
        for(int id = 101; id <= 110; id++)
        {
            product = stock.findProduct(id);
            
            if(product == null)
            {
                System.out.println("Product " + id + " Not found");
            }
            else
            {
               quantity = generator.nextInt(20);
               stock.buyProduct(id, quantity);
            }
        }
    }

    private void sellProducts()
    {
        Product product;
        int quantity = 1;
        
        for(int id = 101; id <= 110; id++)
        {
            product = stock.findProduct(id);
            
            if(product == null)
            {
                System.out.println("Product " + id + " Not found");
            }
            else
            {
               quantity = generator.nextInt(20);
               stock.sellProduct(id, quantity);
            }
        }  
    }
}