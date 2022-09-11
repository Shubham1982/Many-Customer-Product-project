public class Address {
    
    private String custCity;
    private String custState;
    private int custPincode;
    public Address(String custCity, String custState, int custPincode) {
        this.custCity = custCity;
        this.custState = custState;
        this.custPincode = custPincode;
    }
    public String getCustCity() {
        return custCity;
    }
    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }
    public String getCustState() {
        return custState;
    }
    public void setCustState(String custState) {
        this.custState = custState;
    }
    public int getCustPincode() {
        return custPincode;
    }
    public void setCustPincode(int custPincode) {
        this.custPincode = custPincode;
    }
    
}