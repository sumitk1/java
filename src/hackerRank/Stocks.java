
public class Stocks {
    public static void main(String[] args) {

        int stocks[] = {10, 7, 5, 8, 11, 4, 9};

        int min = stocks[0];
        int profit = stocks[1] - stocks[0];

        for (int i: stocks) {
            if (min > i) {
                min = i;
            }

            int localProfit = i - min;

            if (localProfit > profit) {
                profit = localProfit;
            }
        }
        System.out.println(profit + " min" + min);

    }
}
