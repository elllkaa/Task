public class Main {


    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        reverse(arr, arr.length);
    }

    static void reverse(int[] a, int n)
    {
        int i;
        int b;
        int t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }

        System.out.println("Reversed array is: \n");
        for (b = 0; b < n; b++) {
            System.out.println(a[b]);
        }
    }


}