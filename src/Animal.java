public class Animal {

    private boolean vegetarian;
    private String eats;

    public void sound() {
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    static class Cat extends Animal {
        public void sound() {
            System.out.println("Meow");

        }
    }
}
