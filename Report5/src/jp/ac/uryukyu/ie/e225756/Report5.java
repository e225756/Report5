package jp.ac.uryukyu.ie.e225756;

public class Report5 {
    public static void main(String[] args){
        String str = null;
        
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("nullPointExceptionが存在しています");            
System.out.println(e.getMessage()) ;           
        }
    }
}
        