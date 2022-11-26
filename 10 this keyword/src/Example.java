class Example {
    int x;
    int y;
    
    void printXY(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();

        e1.x = 10;
        e1.y = 20;

        e2.x = 30;
        e2.y = 40;

        e1.printXY();
        System.out.println();
        e2.printXY();
    }
}
