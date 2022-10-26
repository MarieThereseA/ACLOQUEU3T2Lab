public class Main {
    public static void main(String[] args){
        SelectionMadness madness = new SelectionMadness();

        // test flipcoin -- these will return true or false randomly
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());

        // test largest
        System.out.println(madness.largest(5, 8, 3));
        System.out.println(madness.largest(8, 5, 3));
        System.out.println(madness.largest(3, 5, 8));
        System.out.println(madness.largest(-5, -8, -3));
        System.out.println(madness.largest(11, 11, 10));

        // test rightTriangle
        System.out.println(madness.rightTriangle(3, 4, 5));
        System.out.println(madness.rightTriangle(5, 4, 3));
        System.out.println(madness.rightTriangle(6, 8, 10));
        System.out.println(madness.rightTriangle(8, 10, 6));
        System.out.println(madness.rightTriangle(3, 6, 5));
        System.out.println(madness.rightTriangle(1, 2, 3));

    }
}
