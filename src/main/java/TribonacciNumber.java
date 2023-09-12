public class TribonacciNumber {

    //Lvl: Easy

    //Runtime: 0ms
    //Beats 100.00% of users with Java

    //Memory: 39.43MB
    //Beats 25.1% of users with Java

    //TODO: The Tribonacci sequence Tn is defined as follows:
    // T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
    // Given n, return the value of Tn.

    public int tribonacci(int n) {

        if(n == 0){
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        int[] M = new int[n+1];
        M[0] = 0;
        M[1] = 1;
        M[2] = 1;
        for (int i = 3; i < n+1; i++){
            M[i] = M[i-1]+M[i-2]+M[i-3];
        }
        return M[n];


    }
}
