public class CatHouse {
    private Cat cat1;
    private Cat cat2;
    private String owner;

    public CatHouse(Cat cat1, Cat cat2, String owner) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.owner = owner;
    }

    // MODIFY this so that the OLDEST Cat always introduces
    // themselves first!  If they have the same age, have them
    // introduce themselves alphabetically; if they have the same name AND
    // same age, then have cat1 go first
    public void rollCall() {
        if (cat1.getAge() > cat2.getAge()) {
            cat1.introduce();
        }else if (cat2.getAge() > cat1.getAge()) {
            cat2.introduce();
        } else {
            if (cat1.getName().substring(0,1).compareTo(cat2.getName().substring(0,1)) < 0){
                cat2.introduce();
            }else{
                cat1.introduce();
            }
        }
    }

    // IMPLEMENT this method!
    // this method causes each cat to speak by printing
    // each Cat's returned "speak()" string to the console
    public void catNoise() {
        System.out.println(cat1.speak() + "\n" + cat2.speak());
    }

    // MODIFY this so that it returns a string with each Cat's AGE next to its name
    // e.g. Cat 1's Name: Petunia, Age: 3
    public String houseInfo() {
        String str = "Welcome to " + owner + "'s Cat House!\n";
        str += "Cat 1's Name: " + cat1.getName() + ", Age: " + cat1.getAge() + "\n";
        str += "Cat 2's Name: " + cat2.getName() + ", Age: " + cat2.getAge();
        return str;
    }
}