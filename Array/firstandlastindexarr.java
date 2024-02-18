import java.util.Scanner;

public class firstandlastindexarr {

    public static int firstIdx(int[] a, int x) {
        int n = a.length;
        int i = 0;
        int j = n - 1;
        int fi = -1;
        while (i <= j) {
            int mid = (i + j) / 2;

            if (a[mid] == x) {
                fi = mid;
                j = mid - 1;
            } else if (a[mid] < x) {
                i = mid + 1;
            } else {
                // a[mid] > x
                j = mid - 1;
            }
        }
        return fi;
    }

    public static int lastIdx(int[] a, int x) {
        int n = a.length;
        int i = 0;
        int j = n - 1;
        int li = -1;
        while (i <= j) {
            int mid = (i + j) / 2;

            if (a[mid] == x) {
                li = mid;
                i= mid + 1;
            } else if (a[mid] < x) {
                i = mid + 1;
            } else {
                // a[mid] > x
                j = mid - 1;
            }
        }
        return li;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int fi = firstIdx(a, x);
        int li = lastIdx(a, x);
        System.out.println(fi);
        System.out.println(li);
    }
}
