import java.util.ArrayList;
import java.util.List;

public class PetClinic {

    public static void main(String[] args) {
        // Create pets
        Pet dog = new Dog("Rex", 5, "Labrador");
        Pet cat = new Cat("Whiskers", 3, "Tabby");

        // Create veterinarians
        Veterinarian generalVet = new GeneralVeterinarian("Dr. Smith");
        Veterinarian specialistVet = new SpecialistVeterinarian("Dr. Jones", "Dermatology");

        // Examine pets
        List<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(cat);

        for (Pet pet : pets) {
            System.out.println(pet.toString());
            System.out.println(generalVet.getName() + ": " + generalVet.examinePet(pet));
            System.out.println(specialistVet.getName() + ": " + specialistVet.examinePet(pet));
            System.out.println();
        }
    }
}
 