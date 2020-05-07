/*
* This class defines symptoms COVID-19 a person class with have.
* @author Bilen-wrk
* Date: May 7 2020
*/
public class Symptom {
    private String nameSym = "none";
    private  int daySym = 0;
    private String detail = "";

    /* Defult constructor of Symptom*/
    public Symptom(){
    }

    /* Constructs all Symptom's fields*/
    public Symptom(String nameSym, int daySym, String detail){
        this.nameSym = nameSym;
        this.daySym = daySym;
        this.detail = detail;
    }

    /* constructs all symptom's field expt for detail*/
    public Symptom(String nameSym, int daySym){
        this.nameSym = nameSym;
        this.daySym = daySym;
    }

    public String getNameSym() {
        return nameSym;
    }

    public void setNameSym(String nameSym) {
        this.nameSym = nameSym;
    }

    public int getDaySym() {
        return daySym;
    }

    public void setDaySym(int daySym) {
        this.daySym = daySym;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
