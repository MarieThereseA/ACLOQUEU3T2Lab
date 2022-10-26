public class SelectionMadness
{
    // No instance variables //

    // no-parameter constructor with "empty" body since no instance variables
    public SelectionMadness() { }

    /* Simulates randomly flipping a fair coin and returning true for heads and
       false for tails; hint: this method should use the Math.random() method to
       generate a random number.  This method returns true (heads) 50% of the
       time and false (tails) 50% of the time, on average.
     */
    public boolean flipCoin() {
        int num = (int)(Math.random() * 2) + 1;
        boolean tOrF = false;
        if (num == 1){
            tOrF = true;
        }else {
            tOrF = false;
        }
        return  tOrF;
    }

    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
        int large = 0;
        if (num1 > num2) {
            if (num1 > num3) {
                large = num1;
            } else {
                large = num3;
            }
        }else if (num2 > num3){
            large = num2;
        }else {
            large = num3;
        }
        return large;
    }


    /* Returns true if the three provided lengths create a right triangle, in
       other words, a2 + b2 = c2, where c is the longest side; returns false
       Otherwise (hint: use the largest() method that you wrote above!).
       Be careful -- this is a bit more challenging than it seems!  Consider if
       side1 = 3, side2 = 4, and side3 = 5 vs. if side1 = 5, side2 = 4, and
       side3 = 3 -- will your code work regardless of which side is the longest
       of the three?
     */
    public boolean rightTriangle(int side1, int side2, int side3) {
        int hypo = largest(side1, side2, side3);
        int adj = 0;
        int opp = 0;

        if (side1 == hypo){
            adj = side2;
            opp = side3;
        }else if (side2 == hypo){
            adj = side1;
            opp = side3;
        }else {
            adj = side1;
            opp = side2;
        }

        int a = (int)Math.pow(adj, 2);
        int b = (int)Math.pow(opp, 2);
        int c = (int)Math.pow(hypo, 2);
        boolean tri = false;

        if (a + b == c){
            tri = true;
        }else if (a + b != c){
            tri = false;
        }
        return  tri;
    }

}

