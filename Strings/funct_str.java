public class funct_str {
    public static void main(String[] args) {
System.out.println("indexOf() method");

        String s="this is a code";  
        System.out.println(s.indexOf('c'));
//indexOf() method returns the index of first occurrence of specified character.
        System.out.println(s.indexOf('s'));
        System.out.println(s.lastIndexOf('s'));
//lastIndexOf() method returns the index of last occurrence of specified character.

System.out.println("compare to");

//compareTo() method compares the two strings based on the Unicode value of each character in the strings.
//it compares values of string lexicographically(dict order)
        String s1="hello";  
        String s2="hello";  
        String s3="meklo";  
        String s4="hemlo";  
        System.out.println(s1.compareTo(s2));
//0 because both are equal  
        System.out.println(s1.compareTo(s3));
//-5 because "h" is 5 times lower than "m"    h=104 m=109  "h-m=-5"
        System.out.println(s1.compareTo(s4));
//-1 because "e" is 1 times lower than "l"      e=101 l=108  "e-l=-1"

System.out.println("contains() method");

//contains() method searches the sequence of characters in the given string.
        String s5="this is index of example";
        System.out.println(s5.contains("index"));  //true
//if sequence of char value is found in string then it returns true otherwise it returns false.
        System.out.println(s5.contains("ayushi"));      //false


System.out.println("startsWith() and endsWith() method");

//startsWith() method checks if this string starts with given prefix.
        String s6="java string split method by javatpoint";  
        System.out.println(s6.startsWith("java")); //true
        System.out.println(s6.startsWith("python")); //false
//if string starts with given prefix then it returns true otherwise it returns false.
        System.out.println(s6.startsWith("python", 5));  //false
//tooffset is 5, so it will check from 5th index of string if it starts with given prefix. 

        System.out.println(s6.endsWith("javatpoint"));  //true
//endsWith() method checks if this string ends with given suffix.
        System.out.println(s6.endsWith("python"));  //false

System.out.println("toupper and tolower method");

//toUpperCase() method returns the string in uppercase letter.
        String s7="hello string";  
        System.out.println(s7.toUpperCase());

//toLowerCase() method returns the string in lowercase letter.
        String s8="HELLO STRING";
        System.out.println(s8.toLowerCase());

System.out.println("concat() method");

//concat() method combines specified string at the end of this string.
        String s9="hello";  
        s9=s9.concat(" how are you");  
        System.out.println(s9);

System.out.println("substring() method");

//substring(i) means all the characters from index i to end.
//substring(i, j) means all the characters from index i to j-1.
        String s10="hello";  
        System.out.println(s10.substring(0)); //hello
        System.out.println(s10.substring(1)); //ello
        System.out.println(s10.substring(0,2)); //he
        System.out.println(s10.substring(1,3)); //el

        System.out.println("+ operator");
//+ operator is used to add strings. It is also used to add variables and values and characters.
        String s11="hello";
        String s12="how are you";
        System.out.println(s11+s12);
        System.out.println(s11+10); //hello10
        System.out.println(s11+10+20); //hello1020
        System.out.println(10+"?"+s11); //10?hello
        System.out.println(10+20+s11); //30hello

        System.out.println("interning keyword");
        

    }
}
