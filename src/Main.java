/**
 * Created by Tee on 3/7/17.
 */

//Importing Java Extension packages
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String string1, string2, string3, string4, output;




        string1 = new String("hello");
        string2 = new String("good bye");
        string3 = new String("Friday");
        string4 = new String("firiday");

        output = "String1: = "+ string1 +"\nString2: = " + string2 +
        "\nString3: = " + string3 + "\n String4: = "+ string4 + "\n\n" ;

        //test for equality
        if(string1.equals("hello") )
            output = output + "String1: equals \"hello\"\n";

        else
            output = output + "String1: does not equal \"hello\"\n";

        //test for equality with ==
        if( string1 == "hello")
            output = output + "String1: equals \"hello\"\n";
        else
            output = output + "String1: does not equal \"hello\"\n";

        //test for equality (ignore case)
        if(string3.equalsIgnoreCase(string4) )
            output = output + "String3 equals s4\n";

        else
            output = output + "String 3: does not equal String4\n";
//THIS SHOULD ALSO BE IN toString()
        output = output +
                "\nstring1.compareTo(string2 ) is: " + string1.compareTo(string2) +
                "\nstring2.compareTo(string1 ) is: " + string2.compareTo(string1) +
                "\nstring1.compareTo(string1 ) is: " + string1.compareTo(string1) +
                "\nstring3.compareTo(string4 ) is: " + string3.compareTo(string4) +
                "\nstring4.compareTo(string3 ) is: " + string4.compareTo(string3) +
                "\n\n";






        JOptionPane.showMessageDialog(null, output,
               "Showing String using compareTo", JOptionPane.INFORMATION_MESSAGE );//Using 4 message args

        System.exit(0);//System Exit Needed for all window pain options




    }


}//End of Main class
