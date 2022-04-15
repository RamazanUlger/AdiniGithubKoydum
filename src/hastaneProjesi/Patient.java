package hastaneProjesi;

public class Patient {
    private String name;
    private String nachName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Situatuion getPatientSituation() {
        return patientSituation;
    }

    public void setPatientSituation(Situatuion patientSituation) {
        this.patientSituation = patientSituation;
    }

    private int patientID;
    private Situatuion patientSituation;
}
