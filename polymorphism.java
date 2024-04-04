public class MathOperations{

    public int add(int m, int n) {
        return m + n;
    }
    
    public double add(double m, double n, double o){
        return m + n + o;
    }
    
    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args){
        MathOperations operations = new MathOperations();
        int sI = operations.add(10, 20);
        System.out.println("Sum of two integers: " + sI);
        double sD = operations.add(18.9, 23.42, 13.43);
        System.out.println("Sum of three doubles: " + sD);
        String concatenatedString = operations.add("Hello, ", "How are you?");
        System.out.println("Concatenation of two strings: " + concatenatedString);
    }
}
