package JavaProjects.P11_depoYonetimi;

import java.util.HashMap;
import java.util.Map;

public class Urunler extends Uretici {
    private String urunIsmi;
    private Integer urunID;
    private int miktar;
    private String birim;

    Map<Integer, String> urunMap = new HashMap<>();

    public Urunler() {
    }

    int raf;

    public Urunler(String urunIsmi, Integer urunID, int miktar, String birim, int raf) {
        this();
        setUrunIsmi(urunIsmi);
        setUrunID(urunID);
        setMiktar(miktar);
        setBirim(birim);
        setRaf(raf);


    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public Integer getUrunID() {
        return urunID;
    }

    public void setUrunID(Integer urunID) {
        this.urunID = urunID;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }
}
