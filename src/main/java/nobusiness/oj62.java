package nobusiness;

public class oj62 {
    public int Times(int t){
        String srings = String.valueOf(t);
        char[] s= srings.toCharArray();
        int times=0;
        for (int i=0;i<s.length;i++)
        {
            char c =s[i];
            if (c =='2'){
                times++;
            }
        }
        return times;
    }
    public int alltimes(int t){
        int sum=0;
        for(int i=1;i<=t;i++){
            sum+=Times(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new oj62().Times(2222));
        System.out.println(new oj62().alltimes(13));
    }
}
