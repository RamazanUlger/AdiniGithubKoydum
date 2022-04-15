package hastaneProjesi;

import java.util.Scanner;

public class Artz {
    private String artzName;
    private String artzNachname;
    private String artzTitel;
    public Artz(){

    }
    public Artz(String artzName,String artzNachname,String artzTitel){
        setArtzName(artzName);
        setArtzNachname(artzNachname);
        setArtzTitel(artzTitel);
    }

    public String getArtzName() {
        return artzName;
    }

    public void setArtzName(String artzName) {
        this.artzName = artzName;
    }

    public String getArtzNachname() {
        return artzNachname;
    }

    public void setArtzNachname(String artzNachname) {
        this.artzNachname = artzNachname;
    }

    public String getArtzTitel() {
        return artzTitel;
    }

    public void setArtzTitel(String artzTitel) {
        this.artzTitel = artzTitel;
    }
}
