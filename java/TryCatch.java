public class TryCatch {
    public static void main(String args[])
    {
        try{
            int n=10;
            int d=0;
            int r=n/d;
            System.out.println("result="+r);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero");

        }
        finally{
            System.out.println("THis will execute");
        }
    }    
}
