class Test01{
    public static void main(String[] args) {
        // 10 //Wrong operation , it is not permiting any operation
        // 10; //Wrong operation , this stmt is not permiting any operation
        // a=10; //wrong operaion , variable a is not declared , means it is not created

        int a; // Creating new variable without value
        // One memory is createdm with name a
        a = 10; //Initializing a variable
        int b = 20; //Creating another variable with name b
        a = 50; //Storing 50 in existing memory of variable a
        b = 60; //Storing 60 in existing memeory of varibale 

        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
}