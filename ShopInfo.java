// import java.sql.Date;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ShopInfo {

    public Customer[] create(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many customer do you want : ");
        int custNum = sc.nextInt();
        Customer custarr[] = new Customer[custNum];
        for(int j = 0; j<custarr.length; j++){

        //product
        System.out.print("\nHow many Products do you want Customer "+(j+1)+":");
        int n = sc.nextInt();
        Product prodarr[] = new Product[n];
        for(int i =0; i<prodarr.length; i++){

            System.out.println("Product Id :");
            int prodId = sc.nextInt();
            System.out.println("Product Name :");
            String prodName = sc.next();
            System.out.println("Product Price :");
            double prodPrice = sc.nextDouble();
            System.out.println("Product Qty :");
            int prodQty = sc.nextInt();
            prodarr[i] = new Product(prodId, prodName, prodPrice, prodQty);
        }
        //Address
        Address addarr[] = new Address[custarr.length];
        System.out.println("Enter City");
        String custCity = sc.next();
        System.out.println("Enter State");
        String custState = sc.next();
        System.out.println("Enter Pincode");
        int custPincode = sc.nextInt();
        //customer
        System.out.println("Enter Customer Id : ");
        int custId =sc.nextInt();
        System.out.println("Enter Customer Name : ");
        String custName =sc.next();
        System.out.println("Enter Customer Mobile : ");
        String custMob =sc.next();
        
        addarr[j] = new Address(custCity, custState, custPincode);
        custarr[j] = new Customer(custId, custName, custMob, prodarr, addarr);
        
    }
        return custarr;
    }
    public Bill[] calculateBill(Customer custarr[]){
        Bill billobj[];
        
        billobj = new Bill[custarr.length];
        for(int j =0; j<custarr.length; j++){
            double cgst = 0;
            double sgst = 0;
            double total = 0;
            double finaltotal = 0;
            Product prodarr[] = custarr[j].getProd();
            for(int i = 0; i<prodarr.length;i++){
                total += (prodarr[i].getProdPrice()*prodarr[i].getQty());
            }
            cgst = total * 0.06;
            sgst = total * 0.06;
            finaltotal = total + cgst+ sgst;
            billobj[j] = new Bill((j+1), cgst, sgst,total, finaltotal);
        }
        return billobj;
    }

    public void display(Customer custarr[], Bill billobj[], int len){
        int x =len;
        
        for(int j =0; j<x; j++){
        //customer
        
            // Customer custar1[] = custarr;
            System.out.println("\t\t----------------Customer "+(j+1)+ " Details----------------");
            System.out.println("\t\tCustomer Id \t\t:\t"+custarr[j].getCustId());
            System.out.println("\t\tCustomer Name \t\t:\t"+custarr[j].getCustName());
            System.out.println("\t\tCustomer MobileNo\t:\t"+custarr[j].getCustMob());
        //address
            Address addarr[] = custarr[j].getAdd();
            System.out.println("\t\t-------------------Address-------------------");
            System.out.println("\t\tCity \t\t\t:\t"+addarr[j].getCustCity());
            System.out.println("\t\tState \t\t\t:\t"+addarr[j].getCustState());
            System.out.println("\t\tPincode \t\t:\t"+addarr[j].getCustPincode());

            Product prodarr[]=custarr[j].getProd();
            for(int i =0; i<prodarr.length; i++){
            System.out.println("\t\t----------------product Deatails----------------");
            System.out.println("\t\tProduct ID\t\t:\t"+prodarr[i].getProdId());
            System.out.println("\t\tProduct Name\t\t:\t"+prodarr[i].getProdName());
            System.out.println("\t\tProduct Price\t\t:\t"+prodarr[i].getProdPrice());
            System.out.println("\t\tProduct Qty\t\t:\t"+prodarr[i].getQty());
        
            System.out.println("\t\t------------------------------------------------");
            System.out.println("\t\tBill Number\t\t:\t"+billobj[j].getBillId());
            System.out.println("\t\tTotal\t\t\t:\t"+billobj[j].getTotal());
            System.out.println("\t\tCGST\t\t\t:\t"+billobj[j].getCgst());
            System.out.println("\t\tSGST\t\t\t:\t"+billobj[j].getSgst());
            System.out.println("\t\tFinal Bill\t\t:\t"+billobj[j].getFinaltotal());
            }
            System.out.println("\t\t    =========Thank you Visit Again=========");
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
    
    
}
