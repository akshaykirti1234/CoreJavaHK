// int a = 10; // we must create variable inside class or method
// Example e1 = new Example(); // We must ceate object inside class or method
class Test06{

    int a = 10;
    Example e1 = new Example();
    public static void main(String[] args) {
         int a= 20;
         Example e1 = new Example();

         System.out.println("main method var : "+a);
         System.out.println("Instance  var : "+ new Test06().a);
         //  System.out.println("meth1 method var : "+new Test06().meth1().a); // we can't call meth1() var because it get memory in Java Stack area
         new Test06().meth1();
    }
    void meth1(){
        int a = 30;
        Example e1 = new Example();
        System.out.println("meth1() var : "+a);
    }
}