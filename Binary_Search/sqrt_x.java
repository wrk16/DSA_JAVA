public class sqrt_x {
        public int mySqrt(int x) {
            // int lo = 0, hi = x;
            // while(lo <= hi) {
            //     int mid = (hi + lo) / 2;
            //     if(mid * mid == x) return mid;
            //     else if((long)mid * mid < (long)x) lo = mid + 1;
            //     else hi = mid - 1;
            // }
            // return hi;
//another approach without typecasting long
            if(x == 0 || x==1) return x;
            int lo = 0, hi = x;
            while(lo <= hi) {
                int mid = (hi + lo) / 2;
                if(mid  == x/mid) return mid;   //mid*mid==x
                else if(mid < x/mid) lo = mid + 1;
                else hi = mid - 1;
            }
            return hi;
        }
        public static void main(String[] args) {
            int x = 2147483647;
            sqrt_x obj = new sqrt_x();
            System.out.println(obj.mySqrt(x));
        }
    }

