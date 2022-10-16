import java.util.ArrayList; 
public class MalcolmTuang_Lab1 {
    
//field configuration
static String name = "Malcolm"; //configures the string name to be static
static String nationality = "Singaporean"; //configures the string nationality to be static
static String dob = "15 Feb 2001"; //configures the string name to be static
ArrayList<String> hobbies; //configure ArrayList for hobbies
ArrayList<String> wishes; //ArrayList for wishes

public static void main(String[] args) {
        System.out.println("About me");
        System.out.println("Name: " + name); //prints name
        System.out.println("Nationality: " + nationality); // prints nationality
        System.out.println("Date of Birth: " + dob); //prints date of birth

        System.out.println("I have 2 hobbies: ");
        ArrayList<String> hobbies =  new ArrayList<String>(); //creates new ArrayList for hobbies
        //add a list of hobbies
        hobbies.add ("1. Playing games\n Favourite games: FF14, Monster Hunter, Arknights, maimai\n 2.Studying animation\n Animation was a passion of mine before giving up on it and coming to IT for the sake of it. I still study various techniques even though I no longer animate."); //adds contents into the arraylist
        System.out.println (hobbies); //then prints it out

        System.out.println ("The following are my wishes: ");
        ArrayList<String> wishes =  new ArrayList<String>(); //creates new ArrayList for wishes
        wishes.add ("1. I want to get good at programming\n 2. I aim to score well for this big data degree.\n 3. I aim to be the best Dark Knight in FF14\n 4.Hit 14k rating and get SSS on 13s/13+s in maimai by June 2023"); //adds contents into the arraylist
        System.out.println(wishes); //then prints it out

    }
    
}
