import java.util.ArrayList;
/*
 *This program will define a person class which has,
 * name, email address, phone number, address, symptoms and
 * contacted person.
 * @ author Bilen-wrk
 * Date: May 7 2020
 */
public class Person {
    //private fields of Person
    private String name = "unknown";
    private String emailAdd = "unknown";
    private String phonenNum = "unknown";
    private String city = "unknown";
    private String state = "unknown";
    private ArrayList<Symptom> symptoms = new ArrayList<Symptom>();
    private ArrayList<ContactedPerson>  contactedPerson = new ArrayList<ContactedPerson>();

    /* Defult constructor of Person*/
    public Person(){
    }

    /* Construtor will have all info of a person*/
    public Person(String name, String emailAdd, String phonenNum, String city, String state,ArrayList<Symptom> symptoms, ArrayList<ContactedPerson>  contactedPerson){
        this.name = name ;
        this.emailAdd = emailAdd;
        this.phonenNum = phonenNum;
        this.city = city;
        this.state = state;
        this.symptoms = symptoms;
        this.contactedPerson = contactedPerson;
    }
    public Person(String name, String emailAdd, String phonenNum, String city, String state){
        this.name = name ;
        this.emailAdd = emailAdd;
        this.phonenNum = phonenNum;
        this.city = city;
        this.state = state;

    }


    /*constructor to be used for symptom and person */
    public Person(String name, String emailAdd, String phonenNum, String  city, String state, ArrayList<ContactedPerson> contactedPerson){
        this.name = name;
        this.emailAdd = emailAdd;
        this.phonenNum = phonenNum;
        this.city = city;
        this.state = state;
        this.contactedPerson = contactedPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public String getPhonenNum() {
        return phonenNum;
    }

    public void setPhonenNum(String phonenNum) {
        this.phonenNum = phonenNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ArrayList<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    public ArrayList<ContactedPerson> getContactedPerson() {
        return contactedPerson;
    }

    public void setContactedPerson(ArrayList<ContactedPerson> contactedPerson) {
        this.contactedPerson = contactedPerson;
    }


    /*
    * This method will add symptoms to the person class.
    * @return void
    * @param symptom of the person class
    */
    public void addSym(Symptom symptom){
        if (this.symptoms.size() <= 0){
            this.symptoms = new ArrayList<>();
        }
        this.symptoms.add(symptom);
    }

    /*
    * This method will add contacted persons in person's class
    * @return void
    * @param contactedPerson
    */
    public void addConPer (ContactedPerson contactedPerson){
        if (this.contactedPerson.size() <= 0){
            this.contactedPerson = new ArrayList<>();
        }
        this.contactedPerson.add(contactedPerson);
    }
    /*
     * override of toString method inorder to print out contant of the class
     * @return String of all info
     * @param void
     */
    public String toString (){
        String str = "Name: " + this.getName() + "\nPhone: " + this.getPhonenNum() + "\nEmail: "+ this.getEmailAdd()
                + "\nCity: " + this.getCity() + "  State: " + this.getState() + "\n\n**\t Symptoms:";
        for (Symptom s : symptoms){
            str += "\n had " + s.getNameSym() +" for " + s.getDaySym() + " days";
        }
        str += "\n\n** \t Contacts:";
        for(ContactedPerson c : contactedPerson){
            str += "\nName: " + c.getName() + "\nPhone: " + c.getPhonenNum() + "\nEmail: "+ c.getEmailAdd()
                    + "\nCity: " + c.getCity() + "  State: " + c.getState() + "\nContacted Location:" +c.getConState() +", " +c.getContCity()+
                    "\nContacted Date: " + c.getContDate();
        }
        return str;
    }

}
