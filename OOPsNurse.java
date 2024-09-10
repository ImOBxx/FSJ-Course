
// Base HealthcareProfessional class
class HealthcareProfessional {
    private String name;

    public HealthcareProfessional(String name) {
        this.name = name;
    }

    public void startShift() {
        System.out.println(name + " is starting their shift.");
    }

    public void endShift() {
        System.out.println(name + " is ending their shift.");
    }

    public String getName() {
        return name;
    }
}

// Nurse interface
interface Nurse {
    void providePatientCare();
    void administerMedication();
}

// Therapist interface
interface Therapist {
    void conductTherapySession();
    void developTreatmentPlan();
}

// NurseTherapist class that inherits from HealthcareProfessional and implements both Nurse and Therapist
class NurseTherapist extends HealthcareProfessional implements Nurse, Therapist {

    public NurseTherapist(String name) {
        super(name);
    }

    @Override
    public void providePatientCare() {
        System.out.println(getName() + " is providing patient care.");
    }

    @Override
    public void administerMedication() {
        System.out.println(getName() + " is administering medication.");
    }

    @Override
    public void conductTherapySession() {
        System.out.println(getName() + " is conducting a therapy session.");
    }

    @Override
    public void developTreatmentPlan() {
        System.out.println(getName() + " is developing a treatment plan.");
    }

    public void displaySkillsAndResponsibilities() {
        System.out.println("Skills and Responsibilities of " + getName() + ":");
        providePatientCare();
        administerMedication();
        conductTherapySession();
        developTreatmentPlan();
    }
}

public class OOPsNurse {
    public static void main(String[] args) {
        NurseTherapist nurseTherapist = new NurseTherapist("Alex");

        // Demonstrating the skills and responsibilities
        nurseTherapist.startShift();
        nurseTherapist.displaySkillsAndResponsibilities();
        nurseTherapist.endShift();
    }
}
