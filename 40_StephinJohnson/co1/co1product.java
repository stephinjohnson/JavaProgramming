import java.util.*;

class product {
	Scanner obj=new Scanner (System.in);
	String pcode,pname;
	int price;
		
	void getfn(){
		System.out.print("Enter the pcode :");
		pcode=obj.nextLine();
		System.out.print("Enter the pname :");
		pname=obj.nextLine();
		System.out.print("Enter the price :");
		price=obj.nextInt();
	}
	void put(){
		System.out.print("Code of the product  :"+pcode);
		System.out.print("Name of the product  :"+pname);
		System.out.print("Price of the product :"+price);
	}
}

public class minproduct{
	public static void main(String [] args){
		Scanner obj= new Scanner(System.in);
		product p1=new product();
		product p2=new product();
		product p3=new product();
		
		p1.getfn();
		p2.getfn();
		p3.getfn();
		
		if(p1.price<p2.price){
			if(p1.price<p2.price){
				System.out.println("First product has the smallest price");
				p1.put();
			}
			else{
				System.out.println("Second product has the smallest price");
				p2.put();
			}
		}
		else{
			if(p2.price<p3.price){
				System.out.println("Second product has the smallest price");
				p2.put();
			}
			else{
				System.out.println("Third product has the smallest price");
				p3.put();
			}
		}
	}
	
}