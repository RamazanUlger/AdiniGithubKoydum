package hastaneProjesi;

import java.util.Scanner;

public class PatientRunner extends Datenbank {


    String patientSituation;
    String titel;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatientRunner patient=new PatientRunner();
        Situatuion befinden=new Situatuion();
        System.out.println("Bestimmen Sie bitte Ihre Krankheit : ");
        patient.patientSituation = scanner.nextLine();
        patient.patientSituation = patient.patientSituation.substring(0, 1).toUpperCase()
                                   + patient.patientSituation.substring(1).toLowerCase();

        patient.titel=artzTitel(patient.patientSituation);
        System.out.println(befinden.findArtz(patient.patientSituation));
        System.out.println(patient.titel);

    }

    public static String artzTitel(String patientSituationen) {
        Datenbank alleDaten = new Datenbank();



        for (int i = 0; i < alleDaten.patientBefund.length; i++) {
            if (patientSituationen.contains(alleDaten.patientBefund[i])) {
                return alleDaten.titel[i];
            }
        }


        return "Datei ist nicht zusammenpassend";
    }
}
