public class str_with_max_val {
    public static void main(String[] args) {
        String s[]={"499","3455","544","66666","100000"};
        String maxS=s[0];
        for(int i=0;i<s.length;i++){
            maxS=max(maxS,s[i]);
//maxS is a function that returns the string with the maximum value
        }
        System.out.println(maxS);
    }

    public static String max(String a, String b){
        String s=purify(a), t=purify(b);
//purify is a function that removes leading zeros from a string
        if(s.length()>t.length()) return a;
//if the length of a is greater than the length of b, then a is greater 
        if(s.length()<t.length()) return b;

        for(int i=0;i<s.length();i++){
//if the lengths of a and b are equal, then we compare the strings character by character
            if(s.charAt(i)!=t.charAt(i)){
//if the characters are different, then the string with the greater character is greater 
                if(s.charAt(i)>t.charAt(i)) return a;
//if the character of a is greater than the character of b, then a is greater
                else return b;
            }
    }
//this below line is executed if the strings are equal 
    if(a.length()>b.length()) return a;
    return b;
    }

    public static String purify(String s){
        for(int i=0;i<s.length();i++){
//this below condition will remove the leading zeros from the string by returning the substring from the first non-zero character   
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return "0";
    }


}
