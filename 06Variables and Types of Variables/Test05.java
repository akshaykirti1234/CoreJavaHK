class Test05 {
    public static void main(String[] args) {
        System.out.println(10); //Displaying values directly. takes less time 
        int i1 = 10;
        System.out.println(i1);

        Example e1 = new Example();
        System.out.println(e1.x); //accessing memebers from the object by using ref variable,takes some time 
        System.out.println(new Example().x );//reading values from object without using takes less time compared to above approch

        Example e2 = new Example();//here we must use ref var because we want all values from the object
        System.out.println(e2.x);
        System.out.println(e2.y);
        System.out.println(new Example().x);
        System.out.println(new Example().y);
    }    
}