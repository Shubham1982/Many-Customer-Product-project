// import java.util.Scanner;

public class ShopMain {
    public static void main(String[] args) {
       
        ShopInfo shopobj = new ShopInfo();
        Customer custarr[]= shopobj.create();
        Bill billobj[] = shopobj.calculateBill(custarr);
        shopobj.display(custarr,billobj,custarr.length);
       
       
    }
    
}
