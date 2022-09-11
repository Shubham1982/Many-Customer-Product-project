// import java.util.Date;

// import java.util.Date;

public class Bill {
    private int BillId;

    private double cgst;
    private double sgst;
    private double total;
    private double finaltotal;
    public Bill(int billId, double cgst, double sgst, double total, double finaltotal) {
        BillId = billId;
        
        this.cgst = cgst;
        this.sgst = sgst;
        this.total = total;
        this.finaltotal = finaltotal;
    }
    public int getBillId() {
        return BillId;
    }
    public void setBillId(int billId) {
        BillId = billId;
    }

    public double getCgst() {
        return cgst;
    }
    public void setCgst(double cgst) {
        this.cgst = cgst;
    }
    public double getSgst() {
        return sgst;
    }
    public void setSgst(double sgst) {
        this.sgst = sgst;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getFinaltotal() {
        return finaltotal;
    }
    public void setFinaltotal(double finaltotal) {
        this.finaltotal = finaltotal;
    }
    
}