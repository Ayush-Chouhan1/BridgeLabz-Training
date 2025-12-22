class NullPointerExceptionDemo {

    //method to generate NullPointerException
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    // method to handle Exception
    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println(" Text is null");
        }
    }

    public static void main(String[] args) {
        // generateException(); 
        handleException();
    }
}
