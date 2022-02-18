import java.util.Scanner;

//Functional Interface
interface Concatenated{
    void concatenatedString(String[] str);
}
public class Lambda3 {
    public static void main(String[] args) {
        String str;
        Scanner ic = new Scanner(System.in);
        try{
        System.out.println("Enter String:");
        str = ic.nextLine();
        String[] strArray = str.split("\\s+");

        //Lambda Expression
        Concatenated obj = (String[] inpStrr)-> {
            String newStr = "";
            //foreach loop 
            for (String i : inpStrr) {
                newStr += i;
            }
            System.out.println("Concatenated String is " + newStr.toUpperCase());
        };

        obj.concatenatedString(strArray);
        }
        finally{
            ic.close();
        }
        
    }
}
