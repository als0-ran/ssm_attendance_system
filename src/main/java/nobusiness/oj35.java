package nobusiness;

public class oj35 {
    public static boolean isPrimeNormal(int num) {

        if (num==0){
            return false;
        }
        for(int i=2; i<num; i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }

        static boolean judge(long number){
        String s= String.valueOf(number);
        char[] ss =s.toCharArray();
        int i=0;
        boolean falg = true;
        for (i=0;i<ss.length;i++)
        {
            int k= Integer.valueOf(ss[i]);
            k=k-Integer.valueOf('0');
            if (i%2==0){
                if (k%2!=0) {
                    falg=false;
                    break;
                }
               
            }
            else {
                if (!isPrimeNormal(k)) {
                    falg = false;
                    break;
                }
            }
        }
        
        return falg;
    }
    static long solution(int number){
        int  sun=0;
        double x = Math.pow(10,number);
        long t = (long) x;
        while (t>=0){
            if (judge(t)){
               sun++;
                System.out.println(t);
            }
            t--;
        }
        System.out.println(sun);
        return 0;
    }
    public static void main(String[] args) {
       solution(4);
    }
}
