public class preinpost {
    public static void main(String[] args) {
        pip(3);
    }
    //zigzag pattern
    public static void pip(int n) {
        if(n==0)    return;
        System.out.println("Pre: "+n); //pre
        pip(n-1);
        System.out.println("In: "+n); //in
        pip(n-1);
        System.out.println("Post: "+n); //post
        // ans : 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
    }
}
/*
pip(3) -> 3     pip(2)     3     pip(2)     3
pip(3) -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
pip(2) -> 2     pip(1)     2     pip(1)     2
pip(2) -> 2 1 1 1 2 1 1 1 2
pip(1) -> 1     pip(0)     1     pip(0)     1
pip(1) -> 1 1 1
pip(0) -> return
 */
