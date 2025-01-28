package mentor12.Hospital;

public class Hospital {
    Doctor[] doctors;
    Patient[] patients;
    int doctorCount;
    int PatientCount;

    public Hospital() {
        this.doctors = new Doctor[10];
        this.patients = new Patient[20];
        this.doctorCount = 0;
        this.PatientCount = 0;
    }


}
