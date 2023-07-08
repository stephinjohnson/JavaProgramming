import java.util.Scanner;

class Publisher{
    int p_id;
    String p_name;
    Publisher(int p_id,String p_name){
        this.p_id=p_id;
        this.p_name=p_name;

    }
}

class Book extends Publisher{
    int b_id;
    String b_name;
    Book(int p_id, String p_name, int b_id, String b_name){
        super(p_id, p_name);
        this.b_id=b_id;
        this.b_name=b_name;
    }
}

class Literature extends Book{
    String cat;
    Literature(int p_id, String p_name, int b_id, String b_name){
        super(p_id, p_name, b_id, b_name);
        this.cat="Literature";
    }

    void Display4(){
        System.out.println("publisher id is "+this.p_id);
        System.out.println("publisher name is "+ this.p_name);
        System.out.println("book id is" +this.b_id);
        System.out.println("book name is "+ this.b_name);
        System.out.println("category name is "+this.cat);
    }
}

class Fiction extends Book{
    String cat;
    Fiction(int p_id, String p_name, int b_id, String b_name){
        super(p_id, p_name, b_id, b_name);
        this.cat="Fiction";
    }

    void Display4(){
        System.out.println("publisher id is "+this.p_id);
        System.out.println("publisher name is "+ this.p_name);
        System.out.println("book id is" +this.b_id);
        System.out.println("book name is "+ this.b_name);
        System.out.println("category name is "+this.cat);
    }

}


public class CO34 {

    public static void main(String[] args){
        int p_id, b_id;
        String p_name, b_name;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the p_id");
        p_id=s.nextInt();
        System.out.println("enter the p_name");
        p_name=s.next();
        System.out.println("enter the b_id");
        b_id=s.nextInt();
        System.out.println("enter the b_name");
        b_name=s.next();

        Literature lit=new Literature(p_id, p_name, b_id, b_name);
        Fiction fic=new Fiction(p_id, p_name, b_id, b_name);

        lit.Display4();
        fic.Display4();

    }

    
}
