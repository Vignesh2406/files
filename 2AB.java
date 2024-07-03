public class BagelsOrderItem implements OrderItem{

    private double price;
    private int quantity;

    public BagelsOrderItem(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public double getCost() {
        return getPrice()*getQuantity();
    }
}
class BakersDozen extends BagelsOrderItem{
    
    public BakersDozen(double price, int quantity) {
        super(price, quantity);
    }
    @Override
    public double getCost() {
        return getPrice()*(getQuantity()-1);
    }
}
