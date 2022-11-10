public class inheritanceassignment3 {


    // EmpHospital-->Classes-->Objects.
    public static void main(String[] args) {
        EmpHospital vito = new EmpHospital("Vito", 123);
        Doctor michael = new Doctor("Michael", 234, "Heart");
        Surgeon vincent = new Surgeon("Vincent", 645, "Brain", true);
        Nurse sonny = new Nurse("Sonny", 789, 6);

        // Hospital Employees
        System.out.println(vito);
        System.out.println(michael);
        System.out.println(vincent);
        System.out.println(sonny);

    
        vito.work();
        michael.work();
        vincent.work();
        sonny.work();

    }}

class EmpHospital {
    protected String name;
    protected int number;

    EmpHospital(String nameEmp, int numEmp) {
        this.name = nameEmp;
        this.number = numEmp;
    }

    public void setName(String nameEmp) {
        this.name = nameEmp;
    }

    public void setNumber(int numEmp) {
        this.number = numEmp;
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

class Nurse extends EmpHospital {
    protected int numOfPatients;

    Nurse(String nameEmp, int numEmp, int numPatients) {
        super(nameEmp, numEmp);
        this.name = nameEmp;
        this.number = numEmp;
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

class Doctor extends EmpHospital {
    protected String speciality;

    Doctor(String nameEmp, int numEmp, String newSpeciality) {
        super(nameEmp, numEmp);
        this.name = nameEmp;
        this.number = numEmp;
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

    Surgeon(String nameEmp, int numEmp, String newSpeciality, boolean newOperating) {
        super(nameEmp, numEmp, newSpeciality);
        this.name = nameEmp;
        this.number = numEmp;
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
