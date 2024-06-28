import java.util.Scanner;
public class freq_charinStr {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter a string in lower case: ");
    String s=in.next();
    int freq[]=new int[26];
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int idx=(int)ch - 97;
        freq[idx]++;
    }

    int maxFreq= -1;
    for(int i=0;i<freq.length;i++){
        maxFreq=Math.max(maxFreq,freq[i]);
}

    for(int i=0;i<freq.length;i++){
        if(freq[i] == maxFreq)  {
        char ch=(char)(i+97);
        System.out.println(ch+" ");
        }
    }
    in.close();
    }
    
}