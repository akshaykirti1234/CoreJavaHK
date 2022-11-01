public class Test04_RVArrayObject {
    public static void main(String[] args) {
        //array variable object creation
        int[] ia = {4,5,6,7,8,9};
        //reading array variable and array object values
        System.out.println("ia :"+ia);
        System.out.println("ia[0] :"+ia[0]);
        System.out.println("ia[1] :"+ia[1]);
        System.out.println("ia[2] :"+ia[2]);
        System.out.println("ia[3] :"+ia[3]);
        System.out.println("ia[4] :"+ia[4]);
        System.out.println("ia[5] :"+ia[5]);
        System.out.println();
        // We must develop dynamic nature code.Means we must not change source code accoring to values
        for(int index=0; index < ia.length; index++){
            System.out.println("ia["+index+"] :"+ia[index]);
        }
        System.out.println();
        for(int index=ia.length-1; index >=0 ; index--){
            System.out.println("ia["+index+"] :"+ia[index]);
        }

        System.out.println(java.util.Arrays.toString(ia));
    }
}
