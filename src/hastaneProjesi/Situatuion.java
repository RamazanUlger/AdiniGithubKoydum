package hastaneProjesi;

public class Situatuion extends Datenbank{
    Datenbank alleDaten=new Datenbank();
    PatientRunner neuPatient=new PatientRunner();
    private String aktuelleSituationen;
    private boolean zugörigkeit;
    Situatuion (){}
    Situatuion (String aktuelleSituationen,boolean zugörigkeit){
        setAktuelleSituationen(aktuelleSituationen);
        setZugörigkeit(zugörigkeit);
    }
    public boolean findArtz(String aktuelleSituationen){
        boolean bl=false;
        for (int i = 0; i <alleDaten.patientBefund.length ; i++) {
            if (alleDaten.titel[i].equalsIgnoreCase("Migrene")||alleDaten.titel[i].contains("Herzinfarkt")) {
              bl= true;
            }else bl= false;
        }
    return bl;}

    public String getAktuelleSituationen() {
        return aktuelleSituationen;
    }

    public void setAktuelleSituationen(String aktuelleBenfindenen) {
        this.aktuelleSituationen= aktuelleBenfindenen;
    }

    public boolean isZugörigkeit() {
        return zugörigkeit;
    }

    public void setZugörigkeit(boolean zugörigkeit) {
        this.zugörigkeit = zugörigkeit;
    }
}
