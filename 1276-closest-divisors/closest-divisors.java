class Solution {
    public int[] closestDivisors(int num) {
        int ans [] = new int[2]; // jisme apna answer sttore karwayege
        int minDiff = Integer.MAX_VALUE; // To check minimum divisor diffreence

        for(int i = num + 1; i <= num+2; i++){ // two times number bdha kr dekhege jiska diff kam ayega wo hmara answer hoyega
            for(int j =1; j*j <= i; j++){ // jo number aarha usko divide krke uska dic=visor nikalege sbke sath
                if(i % j == 0) { // agar divide horha to --> a , b me store krwa lege
                    int a =j; 
                    int b = i/j;

                    int diff = Math.abs(a -b); // diff dekhege jiska kam hoga usko ans wale array m store krwalege

                    if(diff < minDiff){
                        minDiff = diff;
                        ans[0] =a;
                        ans[1] = b;
                    }
                }
            }
        }
        return ans;
    }
}