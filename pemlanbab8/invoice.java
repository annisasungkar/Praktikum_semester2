package pemlanbab8;

public class invoice implements payable{
    private String productName;
    private int quantity;
    private int pricePerItem;

    public invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantitiy() {
        return quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }
}
