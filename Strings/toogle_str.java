public class toogle_str {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("AYUSHI");
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65 && ascii<=90){   //capital
                ascii += 32;
                ch=(char)ascii;
                sb.setCharAt(i, ch);
            }

            if(ascii>=97 && ascii<=122){
                ascii -= 32;
                ch=(char)ascii;
                sb.setCharAt(i, ch);
            }
            }
            System.out.println(sb);
        }
    }

//issue