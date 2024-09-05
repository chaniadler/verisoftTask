public class GeneralVeterinarian implements Veterinarian {
    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
//Examines a pet and provides a General's examination report based on the type of pet.
    @Override
    public String examinePet(Pet pet) {
        if (pet instanceof Dog) {
            return String.format("General examination of %s (Dog): The dog seems healthy and energetic. No specific issues detected.", pet.getName());
        } else if (pet instanceof Cat) {
            return String.format("General examination of %s (Cat): The cat seems active and in good condition. No specific issues detected.", pet.getName());
        }
        return String.format("General examination of %s: General health check complete.", pet.getName());
    }
}
 