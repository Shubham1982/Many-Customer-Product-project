public class Product {

    private int ProdId;
    private String ProdName;
    private double ProdPrice;
    private int Qty;
 
    
    
    public Product(int prodId, String prodName, double prodPrice, int qty) {
        ProdId = prodId;
        ProdName = prodName;
        ProdPrice = prodPrice;
        Qty = qty;
        // this.cal = cal;
    }
    public int getProdId() {
        return ProdId;
    }
    public void setProdId(int prodId) {
        ProdId = prodId;
    }
    public String getProdName() {
        return ProdName;
    }
    public void setProdName(String prodName) {
        ProdName = prodName;
    }
    public double getProdPrice() {
        return ProdPrice;
    }
    public void setProdPrice(double prodPrice) {
        ProdPrice = prodPrice;
    }
    public int getQty() {
        return Qty;
    }
    public void setQty(int qty) {
        Qty = qty;
    }

    
}
  