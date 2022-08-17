import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;
 /*
 * 1. create an intro
 * 2. Create the insertArray method
 * 2a. you could catagorize the resturants into diffrent styles depending
 * on the ffod that they serve there
 * 3. Get the correct locations and mile/ times (temple as start location)
 * 4. Create a method that will got through the Array of retuants and ranodomly pick one out
 * 5. Ask if the user like this resturant y/n
 * 6. if not repat the program untill the user answers y
 */
 /*
 * An Idea for the future is using the location alg from the Twitter Project
 * and calculate the distiance from temple to the place.
 * You can store the address in a variable
 */
public class ResturantPickerApp {
    public static void main(String[] args) {
        Scanner uI = new Scanner(System.in);
        int uINum = 0;
        String yesNopoop = "";
        double userLong = 0;
        double userLat = 0;
        double apartmentLat = 39.976348426972;
        double apartmentLon = -75.15997772209016;
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> location = new ArrayList<>();
        ArrayList<String> rating = new ArrayList<>();
        ArrayList<String> longitude = new ArrayList<>();
        ArrayList<String> latitude = new ArrayList<>();
        System.out.println("Please enter yes to continue the program or No to exit");
            System.out.println("Hello and wellcome to the Where a Date App! \nPress Enter to continue!");
            uI.nextLine();
            System.out.println("Please enter your latitude");
            userLat = uI.nextDouble();
            uI.nextLine();
            System.out.println("Please enter your longitude");
            userLong = uI.nextDouble();
            uI.nextLine();
            System.out.println("Are you living at 1415?(yes or no)");
            yesNopoop = uI.nextLine();
            if(yesNopoop.equals("yes")){
                userLat = apartmentLat;
                userLong = apartmentLon;
            }
            menu();
            uINum = uI.nextInt();
            uI.nextLine();
            /*
             * These Diffrent if statements go throught the diffrent txt files
             * and call a random resturnart from the txt file.
             */
            if (uINum == 1) {
                String filename = "C:\\Users\\29jva\\OneDrive\\Desktop\\Summer Code\\Java\\JoshCode\\ResturantApp\\ReturantPickerApp\\src\\Asian.txt";
                insertArray(name, location, rating, latitude, longitude,filename);
                /*
                 * when calling files make sure that you call the exaact location
                 */
                String yesNo = "";
                System.out.println("Would you like a resturant? (yes or no)");
                yesNo = uI.nextLine();
                while(yesNo.equals("yes")) {
                    int indexName = name.size();
                    int randomNum = (int) (Math.random() * indexName);
                    double resturantLat = Double.parseDouble(latitude.get(randomNum));
                    double resturantLong = Double.parseDouble(longitude.get(randomNum));
                    printStatement(name,location,rating,randomNum);
                    System.out.println("Distance from you (miles): " + distance(userLat,resturantLat, userLong, resturantLong));
                    System.out.println("Another resturant? (yes or no)");
                    yesNo = uI.nextLine();
                }
            } else if (uINum == 2) {
                String filename = "C:\\Users\\29jva\\OneDrive\\Desktop\\Summer Code\\Java\\JoshCode\\ResturantApp\\ReturantPickerApp\\src\\Itallian.txt";
                insertArray(name, location, rating, latitude, longitude,filename);
                /*
                 * when calling files make sure that you call the exaact location
                 */
                String yesNo  = "";
                System.out.println("Would you like a resturant? (yes or no)");
                yesNo = uI.nextLine();
                while(yesNo.equals("yes")) {
                    int indexName = name.size();
                    int randomNum = (int) (Math.random() * indexName);
                    double resturantLat = Double.parseDouble(latitude.get(randomNum));
                    double resturantLong = Double.parseDouble(longitude.get(randomNum));
                    printStatement(name,location,rating,randomNum);
                    System.out.println("Distance from you: " + distance(userLat,resturantLat, userLong, resturantLong));
                    System.out.println("Another resturant? (yes or no)");
                    yesNo = uI.nextLine();
                }
            } else if (uINum == 3) {
                String filename = "C:\\Users\\29jva\\OneDrive\\Desktop\\Summer Code\\Java\\JoshCode\\ResturantApp\\ReturantPickerApp\\src\\Indian.txt";
                insertArray(name, location, rating, latitude, longitude,filename);
                /*
                 * when calling files make sure that you call the exaact location
                 */
                String yesNo = "";
                System.out.println("Would you like a resturant? (yes or no)");
                yesNo = uI.nextLine();
                while(yesNo.equals("yes")) {
                    int indexName = name.size();
                    int randomNum = (int) (Math.random() * indexName);
                    double resturantLat = Double.parseDouble(latitude.get(randomNum));
                    double resturantLong = Double.parseDouble(longitude.get(randomNum));
                    printStatement(name,location,rating,randomNum);
                    System.out.println("Distance from you: " + distance(userLat,resturantLat, userLong, resturantLong));
                    System.out.println("Another resturant? (yes or no)");
                    yesNo = uI.nextLine();
                }
            } else if (uINum == 4) {
                String filename = "C:\\Users\\29jva\\OneDrive\\Desktop\\Summer Code\\Java\\JoshCode\\ResturantApp\\ReturantPickerApp\\src\\Misc.txt";
                insertArray(name, location, rating, latitude, longitude,filename);
                /*
                 * when calling files make sure that you call the exaact location
                 */
                String yesNo = "";
                System.out.println("Would you like a resturant? (yes or no)");
                yesNo = uI.nextLine();
                while(yesNo.equals("yes")) {
                    int indexName = name.size();
                    int randomNum = (int) (Math.random() * indexName);
                    double resturantLat = Double.parseDouble(latitude.get(randomNum));
                    double resturantLong = Double.parseDouble(longitude.get(randomNum));
                    printStatement(name,location,rating,randomNum);
                    System.out.println("Distance from you: " + distance(userLat,resturantLat, userLong, resturantLong));
                    System.out.println("Another resturant? (yes or no)");
                    yesNo = uI.nextLine();
                }
            } else if(uINum == 5){
                String filename = "C:\\Users\\29jva\\OneDrive\\Desktop\\Summer Code\\Java\\JoshCode\\ResturantApp\\ReturantPickerApp\\src\\Cheap.txt";
                insertArray(name, location, rating, latitude, longitude,filename);
                /*
                 * when calling files make sure that you call the exaact location
                 */
                String yesNo = "";
                System.out.println("Would you like a resturant? (yes or no)");
                yesNo = uI.nextLine();
                while(yesNo.equals("yes")) {
                    int indexName = name.size();
                    int randomNum = (int) (Math.random() * indexName);
                    double resturantLat = Double.parseDouble(latitude.get(randomNum));
                    double resturantLong = Double.parseDouble(longitude.get(randomNum));
                    printStatement(name,location,rating,randomNum);
                    System.out.println("Distance from you: " + distance(userLat,resturantLat, userLong, resturantLong));
                    System.out.println("Another resturant? (yes or no)");
                    yesNo = uI.nextLine();
                }
            } else if(uINum == 6){
                String filename = "C:\\Users\\29jva\\OneDrive\\Desktop\\Summer Code\\Java\\JoshCode\\ResturantApp\\ReturantPickerApp\\src\\Bars.txt";
                insertArray(name, location, rating, latitude, longitude,filename);
                /*
                 * when calling files make sure that you call the exaact location
                 */
                String yesNo = "";
                System.out.println("Would you like a resturant? (yes or no)");
                yesNo = uI.nextLine();
                while(yesNo.equals("yes")) {
                    int indexName = name.size();
                    int randomNum = (int) (Math.random() * indexName);
                    double resturantLat = Double.parseDouble(latitude.get(randomNum));
                    double resturantLong = Double.parseDouble(longitude.get(randomNum));
                    printStatement(name,location,rating,randomNum);
                    System.out.println("Distance from you: " + distance(userLat,resturantLat, userLong, resturantLong));
                    System.out.println("Another resturant? (yes or no)");
                    yesNo = uI.nextLine();
                }
            }
    }
    public static void insertArray(ArrayList<String> name, ArrayList<String> location, ArrayList<String> rating, ArrayList<String> LatitudeArray, ArrayList <String> LongitudeArray, String filename) {
        try {
            /*
             * Think of scanner of blank notepads
             */
            FileReader fr = new FileReader(filename);
            Scanner sC = new Scanner(fr);
            /*
             * Makes blank notepad of Asian.txt file
             */
            while(sC.hasNext()){
                /*
                 *Instead of using buffred reader it is easier to use scanners
                 * to insert into an ArrayList
                 */
                String txt = sC.nextLine();
                /*
                 * txt catches the entire first line include the ";"
                 */
                Scanner sCT = new Scanner(txt);
                /*
                 * sCT is a new blank notepad the holds txt String
                 */
                sCT.useDelimiter(";"); // This is the same as .split()
                String nameRes ="";
                String loc = "";
                String rate = "";
                String longitude = "";
                String latitude = "";
                nameRes = sCT.next();
                name.add(nameRes);
                loc = sCT.next();
                location.add(loc);
                rate = sCT.next();
                rating.add(rate);
                latitude = sCT.next();
                LatitudeArray.add(latitude);
                longitude = sCT.next();
                LongitudeArray.add(longitude);
            }
             sC.close();
        } catch(FileNotFoundException badFile){
            System.out.println("Trouble finding file");
        }  catch (ArrayIndexOutOfBoundsException toofar){
            System.out.println("index out of bonunds");
        }
    }
    public static void menu() {
        System.out.println("Please type the number in the text line to select an opion:");
        System.out.println("What type of food would you like to eat today?");
        System.out.println("Press 1 for Asian");
        System.out.println("Press 2 for Itallian");
        System.out.println("Press 3 for Indian");
        System.out.println("press 4 for Desert");
        System.out.println("Press 5 for Budget Eats");
        System.out.println("Press 6 for Bars");
        System.out.println("If eating is not on your mind please press 7 for date spots");
    }
    public static void printStatement(ArrayList <String> name, ArrayList<String> location, ArrayList<String> rating, int randomNum){
        System.out.println("Returant Name: " + name.get(randomNum) + "\n"
                + "Location: " + location.get(randomNum) + "\n" +
                "Rating: " + rating.get(randomNum));
    }
    public static double distance(double lat1, double lat2, double lon1, double lon2){
        /*
         * In order to complete this method we will be using the Haversine formula
         * This formula takes a set 2 longetudes and latitudes in order to calculate the
         * distance between two points of a sphere
         */
        double dlat = 0.0;
        double dlon = 0.0;
        double a = 0.0;
        double c = 0.0;
        double d = 0.0;
        int radius = 6387; // This is in KM
        double miles = 0.0;
        dlat = Math.toRadians(lat2 - lat1);
        dlon = Math.toRadians(lon2 - lon1);
        /*
         * This is the start of the Haversine formula
         */
        a = Math.sin(dlat/2) * Math.sin(dlat/2) + Math.cos(Math.toRadians(lat1)) *
                Math.cos(Math.toRadians(lat2)) * Math.sin(dlon/2) * Math.sin(dlon/2);
        c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        d = radius * c;
        miles = (d * 0.621371);

        return miles;

    }
}
/*
 * Things that went wrong:
 * 1. It took some time to learn about Scanner's
 * At first you tried doing file reader but did not work
 *
 */