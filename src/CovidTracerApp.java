import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
* This program will impplements covid-19 tracer.
* @author Bilen-wrk
* Date: May 7 2020*/
public class CovidTracerApp {
    public static void main(String[] args) {
        Scanner kyb = new Scanner(System.in);
        Person perOj;
        Symptom syOj;
        ContactedPerson contPObj;
        //Used to save person's information
        String name, phoneNumber, email,city, state, symYesNo, contYesNo;
        boolean quit = false ;
        int symNum = 0;
        //Used to save contactedPersons infromation
        String nameCon, phoneNumberCon, emailCon,cityCon, stateCon, contCity, contstate, contDate, moreContPpl;

        ArrayList<String> coronSym = new ArrayList<String>( Arrays.asList("Fever", "Cough", "Shortness of breath or difficulty breathing","Tiredness"
                ,"Aches", "Chills","Sore throat", " Loss of smell" , "Loss of taste", " Headache", "Diarrhea", "Severe vomiting") );

        System.out.println("\t Welcome, this is contact tracing program\n" +
                "Enter a newly infected person's information");
        System.out.println("What is a patient's name?");
        name = kyb.nextLine();
        System.out.println("What is a patient's phone number? ");
        phoneNumber = kyb.nextLine();
        System.out.println("What is a patient's email?");
        email = kyb.nextLine();
        System.out.println("What city does a patient live in?");
        city = kyb.nextLine();
        System.out.println("What state does a patient live in?");
        state = kyb.nextLine();
        //this will add the person's initial info not including list of symptoms and contactedPerson
        perOj = new Person(name,email,phoneNumber,city,state);

        //This will optains users symptoms and adds it into the person class's symptoms arraylist
        for(String coSy : coronSym) {
            System.out.println("Does " + name + " have any symptom for " + coSy + "? ");
            symYesNo = kyb.nextLine();
            if (symYesNo.equalsIgnoreCase("yes")) {
                System.out.println("How long has " + name + " had this symptom for?");
                symNum = kyb.nextInt();
                kyb.nextLine();
                //Now symptom class has all information
                syOj = new Symptom(coSy, symNum);
                perOj.addSym(syOj);
            }
        }
        //sets up full info for the person class not including contatnctedPerson
            //Now save any one who came into contact with the person
            System.out.println("\nHas Elsa met or run into anyone? (y/n)");
            contYesNo = kyb.nextLine();
            while ((contYesNo.equalsIgnoreCase("YES")) && ( quit == false)){
                System.out.println("What is his/her name?");
                nameCon = kyb.nextLine();
                System.out.println("What is his/her phone number?");
                phoneNumberCon = kyb.nextLine();
                System.out.println("What is his/her email?");
                emailCon = kyb.nextLine();
                System.out.println("What city does he/her live in?");
                cityCon = kyb.nextLine();
                System.out.println("What state does he/her live in?");
                stateCon = kyb.nextLine();
                System.out.println("What city did " + perOj.getName() + " see him/her?");
                contCity = kyb.nextLine();
                System.out.println("What state did " + perOj.getName() + " see him/her?");
                contstate= kyb.nextLine();
                System.out.println("When did " + perOj.getName() + " see him/her?");
                contDate= kyb.nextLine();

                System.out.println("Has " + perOj.getName() + " met or run into anyone else?");
                moreContPpl = kyb.nextLine();
                contPObj = new ContactedPerson(nameCon,emailCon,phoneNumberCon, cityCon, stateCon, contCity, contstate, contDate  );
                perOj.addConPer(contPObj);
                if(moreContPpl.equalsIgnoreCase("No")){
                   quit = true;
                }
            }




            //print out the contants
        System.out.println("\n\t***** Contact Tracing Report *****");
        System.out.println(perOj.toString());


        }

}
