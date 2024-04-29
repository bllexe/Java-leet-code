package easy;

public class Sqrt {

    public static void main(String[] args) {

        long result= mySqrt(2147395599);
        System.out.println(result);

    }

    private static int mySqrt(int x) {

        if (x == 0 || x == 1)
            return x;
        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                return mid;
            else
                start = mid + 1;
        }
        return Math.round(end);
    }
}
