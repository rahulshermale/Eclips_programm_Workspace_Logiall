
public class Question_04 {

    public static void main(String[] args) {
        int decimalNumber = 42; // The decimal number to convert
        
        String binary = convertToBinary(decimalNumber);
        
        System.out.println(  binary);
    }
    
    public static String convertToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            binary.insert(0, decimalNumber % 2);
            decimalNumber /= 2;
        }
        
        return binary.toString();
    }
}



