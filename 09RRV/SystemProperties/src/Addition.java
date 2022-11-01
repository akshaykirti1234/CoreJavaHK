public class Addition {
    public static void main(String[] args) {
        
        //we can set value in cmd prompt eg:- java -Dfno=10 -Dsno=20 Addition
        String fno = System.getProperty("fno");
        String sno = System.getProperty("sno");

        int a = Integer.parseInt(fno);
        int b = Integer.parseInt(sno);

        int c = a+b;

        System.out.println("Addition :"+ c);

        //We can set value by using setProperty() method
    	 System.setProperty("x","50");
    	 System.setProperty("y","60");
		
        String x = System.getProperty("x");
        String y = System.getProperty("y");

        int p = Integer.parseInt(x);
        int q = Integer.parseInt(y);

        System.out.println("Addition :"+ (p+q));
       

    }
}
