public class Cat extends Pet {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age, "Cat");
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String eat() {
        return "Cat food";
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("%s, color=%s", super.toString(), color);
    }
}
