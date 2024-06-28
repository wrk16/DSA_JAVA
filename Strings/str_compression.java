public class str_compression {
    public static void main(String[] args) {
        String s="aaabbbcc";
        char[] a=s.toCharArray();
//ans is the final answer string (temp variable)
        String ans=" ";
//solving this problem using 2 pointers approach
        int i=0, j=0;
        while(j<a.length){
//if the character at j is same as character at i then we will increment j
            if(a[j]==a[i])  j++;
            else{
//if the character at j is not same as character at i then we will add the character at i to ans
                ans +=a[i];
//if the length of the substring is greater than 1 then we will add the length of the substring to ans
                int len=j-i;
//if the length of the substring is greater than 1 then we will add the length of the substring to ans
                if(len>1)  ans +=len;
//we will update i to j
                i=j;
            }
            }
//the above lines are repeacted because the last substring is not added to the ans string and then we will print the ans string
            ans +=a[i];
            int len=j-i;
            if(len>1)  ans +=len;
            System.out.println(ans);
        }
        
        }
    

