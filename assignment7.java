interface s{
public void callme();
}
interface p{
    public void callmetoo();
}
class k implements s,p{
    public void callme(){
        System.out.println("cse");
    } 

public void callmetoo(){
    System.out.println("cse1");

}
}
public class assignment7 {
    public static void main(String[] args) {
        k b =new k();
        b.callme();
        b.callmetoo();
    }
    
}
