package strcollege;

public class str_college { 
    public static void main(String[] args) {

        String s1 = "ashu";
        String s3 = "ashu";
        String s2 = new String("ashu");

        System.out.println(s1==s3);

        System.out.println(s2.compareTo(s1));

       System.out.println(s1.equals(s2)); 
    
        
}}