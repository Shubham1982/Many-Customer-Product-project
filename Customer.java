public class Customer {
    private int custId;
    private String custName;
    private String custMob;
    private Product prod[];
    private Address add[];
    public Customer(int custId, String custName, String custMob, Product prod[], Address add[]) {
        this.custId = custId;
        this.custName = custName;
        this.custMob = custMob;
        this.prod = prod;
        this.add = add;
    }
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustMob() {
        return custMob;
    }
    public void setCustMob(String custMob) {
        this.custMob = custMob;
    }
    public Product[] getProd() {
        return prod;
    }
    public void setProd(Product prod[]) {
        this.prod = prod;
    }
    public Address[] getAdd() {
        return add;
    }
    public void setAdd(Address add[]) {
        this.add = add;
    }
    
    
}
