public class test {
    public static void main(String[] args){
        int t=3;
        int re=new test().aaa(t);
        System.out.println(re);
    }
    private int aaa(int n){
        int g=1,f=1;
        if (n<=2)
            return 1;
        while (2<n--){
            f=f+g;
            g=f-g;
        }
        return f;
    }
}
