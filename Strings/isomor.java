public class isomor {
    
public boolean isIsomorphic(String s, String t) {
    char[] a= new char[128];
    for(int i=0;i<s.length();i++){
//for each char in s, check if it is already mapped to a char in t
        char ch=s.charAt(i);
        char dh=t.charAt(i);
//char ch and dh are the chars in s and t respectively
        int idx=(int)ch;
//idx is the ascii value of ch which is the index of the array a
        if(a[idx]=='\0')  a[idx]=dh;
//if the index is empty, then map the char dh to it in the array a
        else{
            if(a[idx]!=dh)  return false;
        }
    }
    for(int i=0;i<128;i++){
        a[i]='\0';
//reset back to null arr. to not waste space making another arr.
    }
//repeat the same process for t to check if it is isomorphic to s 
    for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        char dh=s.charAt(i);
        int idx=(int)ch;
        if(a[idx]=='\0')  a[idx]=dh; 
//if the index is empty, then map the char dh to it in the array a
        else{
            if(a[idx]!=dh)  return false;
        }
    }
    
    return true;
}
public static void main(String[] args) {
    isomor solution = new isomor();
    String s="\u0000\u0000";
    String t ="\u0000c";
    
    System.out.println(s + " and " + t + " are isomorphic: " + solution.isIsomorphic(s, t)); 

}
}