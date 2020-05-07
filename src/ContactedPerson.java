import java.util.ArrayList;
/*
 * This class will implements contactedPerson class that will inherits all a Person class has,
 * and it will have location and data of contact in addition.
 * @author Bilen-wrk
 * Data: May 7 2020.
 */
public class ContactedPerson extends Person{
    /*Class fields*/
    private String contCity = "unknown";
    private String conState = "unknown";
    private String contDate = "unknown";

    /*Default constructor*/
    public ContactedPerson(){
        super();
    }

    /*constructs all contactedPerson and person fields*/
    public ContactedPerson(String name, String emailAdd, String phonenNum, String city, String state, String contCity, String conState, String contDate){
        super(name, emailAdd, phonenNum, city, state);
        this.contCity = contCity;
        this.conState = conState;
        this.contDate = contDate;
    }

    public String getContCity() {
        return contCity;
    }

    public void setContCity(String contCity) {
        this.contCity = contCity;
    }

    public String getConState() {
        return conState;
    }

    public void setConState(String conState) {
        this.conState = conState;
    }

    public String getContDate() {
        return contDate;
    }

    public void setContDate(String contDate) {
        this.contDate = contDate;
    }


}
