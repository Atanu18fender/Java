package OOPS;
interface printable{
    public void click();
};
class A implements printable{
   static void methodOfA(){
       System.out.println("Special Method of A");
   }

    @Override
    public void click() {
        System.out.println("Left click occurs");
    }
}
 class B implements printable{
    static void methodOfB(){
        System.out.println("Special Method of B");
    }

     @Override
     public void click() {
         System.out.println("Right click occurs");
     }
 }

 class callMethod{
    static void functionCall(printable var){
        if(var instanceof A){
            A.methodOfA();
        }
        if(var instanceof B){
            B.methodOfB();
        }
    }
 }

public class TestDownCast {
    public static void main(String[] args){
     printable p = new B();
     p.click();
     callMethod.functionCall(p);
    }
}
