public class SpecialistVeterinarian implements Veterinarian {
    private String name;
    private String specialty;

    public SpecialistVeterinarian(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public String getName() {
        return name;
    }
//Examines a pet and provides a specialist's examination report based on the type of pet.
    @Override
    public String examinePet(Pet pet) {
        if (pet instanceof Dog) {
            return String.format("Specialist examination of %s (Dog, specialty: %s): The dog has a healthy coat, but attention needed on diet.", pet.getName(), specialty);
        } else if (pet instanceof Cat) {
            return String.format("Specialist examination of %s (Cat, specialty: %s): The cat  is in good shape, but monitor for potential allergies.", pet.getName(), specialty);
        }
        return String.format("Specialist examination of %s: Specialist care complete.", pet.getName());
    }
}
