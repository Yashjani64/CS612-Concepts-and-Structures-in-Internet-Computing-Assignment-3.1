public class inheritanceassignment {
    // -----------------------------------------------------------------
    // Creates several objects from classes derived from
    // HospitalEmployee.
    // -----------------------------------------------------------------
    public static void main(String[] args) {
        HospitalEmployee vito = new HospitalEmployee("Vito", 123);
        Doctor michael = new Doctor("Michael", 234, "Heart");
        Surgeon vincent = new Surgeon("Vincent", 645, "Brain", true);
        Nurse sonny = new Nurse("Sonny", 789, 6);

        // print the employees
        System.out.println(vito);
        System.out.println(michael);
        System.out.println(vincent);
        System.out.println(sonny);

        // invoke the specific methods of the objects
        vito.work();
        michael.work();
        vincent.work();
        sonny.work();

    }}

class HospitalEmployee {
    protected String name;
    protected int number;

    HospitalEmployee(String newName, int newNumber) {
        this.name = newName;
        this.number = newNumber;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return this.name + " " + this.number;
    }

    public void work() {
        System.out.println(name + " works for hospital");
    }
}

class Nurse extends HospitalEmployee {
    protected int numOfPatients;

    Nurse(String newName, int newNumber, int numPatients) {
        super(newName, newNumber);
        this.name = newName;
        this.number = newNumber;
        this.numOfPatients = numPatients;
    }

    public String toString() {
        return this.name + " " + this.number + " " + this.numOfPatients;
    }

    @Override
    public void work() {
        System.out.println(name + " works for hospital. " + name + " has " + numOfPatients + " patients.");
    }
}

class Doctor extends HospitalEmployee {
    protected String speciality;

    Doctor(String newName, int newNumber, String newSpeciality) {
        super(newName, newNumber);
        this.name = newName;
        this.number = newNumber;
        this.speciality = newSpeciality;
    }

    public String toString() {
        return this.name + " " + this.number + " " + this.speciality;
    }

    @Override
    public void work() {
        System.out.println(name + " works for hospital. " + name + " is a/an " + speciality + " doctor.");
    }
}

class Surgeon extends Doctor {
    protected boolean operating;

    Surgeon(String newName, int newNumber, String newSpeciality, boolean newOperating) {
        super(newName, newNumber, newSpeciality);
        this.name = newName;
        this.number = newNumber;
        this.speciality = newSpeciality;
        this.operating = newOperating;
    }

    public String toString() {
        return this.name + " " + this.number + " " + this.speciality + " " + this.operating;
    }

    @Override
    public void work() {
        System.out.println(name + " works for hospital. " + name + " is now operating. ");
    }
}
