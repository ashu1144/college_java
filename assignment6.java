
interface k1{
public void callme();   
}

class l1 implements k1{
public void callme(){
    System.out.println("cse");
}
}
public class assignment6 {

    public static void main(String[] args) {
        l1 ob=new l1();
        ob.callme();
        
    }
    
}
