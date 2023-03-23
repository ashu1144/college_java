// write a program to define final class and final variable final method
class f1{
    final int a=10;
     void dsp(){  
        System.out.println("bwu");
     }
}


class f2 extends f1{
    void dsp(){
        System.out.println("cse");
    }
}
public class assignment5{    
        public static void main(String[] args) {
        f1 ob=new f1();
            ob.dsp();
        }
}


