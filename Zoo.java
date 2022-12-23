public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.family = "Omnivorous";
        dog.foodConsumed = "Grains and Meat";
        dog.quantityConsumed = (float) 1400.0;
        Animal tiger = new Animal();
        tiger.family = "Carnivorous";
        tiger.foodConsumed = "Meat";
        tiger.quantityConsumed = (float) 4000.0;

        dog.eating();
        tiger.eating();

    }
}
