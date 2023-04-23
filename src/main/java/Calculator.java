public class Calculator {
    int sum(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("n must be bigger than zero");
        } else {
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
