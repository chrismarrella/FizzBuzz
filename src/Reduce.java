public class Reduce {
    public static int count_steps(int n) {
        int count = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
            }
            count++;
        }

        return count;
    }


    public static int count_steps() {
        return count_steps(100);
    }
}






