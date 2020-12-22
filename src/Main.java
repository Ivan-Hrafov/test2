public  class Main {

    public static void main(String[] args) {

        Cat barsik; // создали кота из класса Cat
        barsik = new Cat(3000, "Barsik", 1, "Grey");
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
        bigCat.setName("Pushok");
        System.out.println("The name of barsik cat is " + barsik.getName());
        System.out.println("The name of big cat is " + bigCat.getName());
        System.out.println("The name of small cat is " + smallCat.getName());
        barsik.meow();
        barsik.meow();
    }
}