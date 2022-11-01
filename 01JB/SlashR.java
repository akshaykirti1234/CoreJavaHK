class SlashR
{
    public static void main(String[] args) {
        System.out.println("abcdefgh");
        System.out.println("abcdef\rgh");
        System.out.println("abcdefg\rh");
        System.out.println("abcdefgh\r");
        System.out.println("\rabcdefgh");
        System.out.println("ab\rcdefgh");
    }
}

/* \r is called carrige return. It moves all charecters exits to it's right to the beginning of the line and replaces the existing charecters equal to the number of charecters exits to it's right. */