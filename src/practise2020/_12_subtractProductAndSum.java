package practise2020;

public class _12_subtractProductAndSum {
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int multi = 1;
        while(n>0){
            int each = n%10;
            sum+=each;
            multi*=each;
            n = n/10;
        }
        return multi-sum;
    }
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
