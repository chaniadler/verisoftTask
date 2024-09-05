public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String eat() {
        return "Dog food";
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return String.format("%s, breed=%s", super.toString(), breed);
    }
}
