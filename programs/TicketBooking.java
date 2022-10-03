package programs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

interface Cinema{
    final String towner="Deepak";
    String tname="PVR cinemas",taddress="Street 21, Magneto mall, Bhilai";
}
//Interface for cinema.

class Seat{ 
    String seatnumber;
    boolean isbooked;
    Seat(String seatnumber){
        this.seatnumber=seatnumber;
    }
}
//seat class



class Movie{
    String moviename,movieduration;
    double ticketPrice;
    void setMovie(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  movie Name: ");
        moviename = sc.nextLine();
        System.out.print("Enter  movie Duration: ");
        movieduration = sc.next();
    }
    void incrementcounter(int c){
        c++;
    }
}



class Hall  implements Cinema{
    final int noOfHalls=3;
    int noOfShows;
    int hallNumber;
    Movie m= new Movie();
    public Seat seats[][]={{new Seat("A1"),new Seat("A2"),new Seat("A3"),new Seat("A4"),new Seat("A5"),new Seat("A6"),new Seat("A7"),new Seat("A8"),new Seat("A9"),new Seat("A10")},
                           {new Seat("B1"),new Seat("B2"),new Seat("B3"),new Seat("B4"),new Seat("B5"),new Seat("B6"),new Seat("B7"),new Seat("B8"),new Seat("B9"),new Seat("B10")},
                           {new Seat("C1"),new Seat("C2"),new Seat("C3"),new Seat("C4"),new Seat("C5"),new Seat("C6"),new Seat("C7"),new Seat("C8"),new Seat("C9"),new Seat("C10")},
                           {new Seat("D1"),new Seat("D2"),new Seat("D3"),new Seat("D4"),new Seat("D5"),new Seat("D6"),new Seat("D7"),new Seat("D8"),new Seat("D9"),new Seat("D10")},
                           {new Seat("E1"),new Seat("E2"),new Seat("E3"),new Seat("E4"),new Seat("E5"),new Seat("E6"),new Seat("E7"),new Seat("E8"),new Seat("E9"),new Seat("E10")},
                           {new Seat("F1"),new Seat("F2"),new Seat("F3"),new Seat("F4"),new Seat("F5"),new Seat("F6"),new Seat("F7"),new Seat("F8"),new Seat("F9"),new Seat("F10")},
}; // Has-a relationship with the Seat class;
    void setMovie(Movie m){
        this.m = m;
    }
    public void showseat() {
        System.out.println("Hall Number: "+hallNumber);
        System.out.println("Movie Streaming: "+m.moviename);
        System.out.println("\t\t________________________________");
    System.out.println("\t\t********Screen this side********");
    System.out.println();
    for(int i=0;i<6;i++){
        for(int j=0;j<10;j++){
            char c=' ';
            if(seats[i][j].isbooked){
                c = 'x';
            }
            System.out.print("["+seats[i][j].seatnumber+c+"] ");
            if(j==4){
                System.out.print("\t");
            }
        }
        System.out.println();
    }
    System.out.println("**Note: 'x' marked seats are already booked!.Will be not available.**");
        
    }
}

class Ticket extends Hall{
    static int ticketNumber=0;
    List<String> seatbooked = new ArrayList<String>();
    Hall hall;
    Ticket(Hall h) {
        this.hall=h;
    }
    static void Parser(Collection<?> c){
        Iterator<?> iter = c.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
    }
    void bookticket(){
        boolean confirm=false;
        Scanner sc = new Scanner(System.in);
        String c="y";
        int i=0;
        hall.showseat();
        System.out.println("Maximum 5 seats allowed to book at a time");
        System.out.println("Enter seat number to be booked");
        while(c.equals("y")||c.equals("Y")){
            seatbooked.add(sc.next());
            if(i>5)break;
            i++;
            System.out.println("Want to add more tickets? Enter y for yes n for no");
            c=sc.next();
        }
        System.out.println("Seats to be booked: -");
        Parser(seatbooked);
        System.out.println("Confirm? y for yes n for no");
        c=sc.next();
        if(c.equals("y")||c.equals("Y")){
            confirm=true;
        }
        if(confirm){
            for(int l=0;l<6;l++){
                for(int j=0;j<10;j++){
                    for(String s:seatbooked){
                        if(hall.seats[l][j].seatnumber.equalsIgnoreCase(s)&& hall.seats[l][j].isbooked!=true){
                            hall.seats[l][j].isbooked=true;
                            // System.out.println(hall.seats[l][j].seatnumber);
                        }
                    }
                }
            }
            this.incrementcounter();
        }
    }

    void generateTicket(){
        System.out.println("*****************Ticket******************");
        System.out.println("* "+Cinema.tname);
        System.out.println("* Ticket No.: "+ticketNumber);
        System.out.println("* Movie: "+hall.m.moviename);
        System.out.println("* Duration: "+hall.m.movieduration);
        System.out.println("* Hall Number: "+hall.hallNumber);
        System.out.print("* Seats: ");
        for(String s:seatbooked){
            System.out.print(s+" ");
        }
        System.out.println("* Address: -"+Cinema.taddress);
        System.out.println("*****************************************");
    }
    void incrementcounter(){
        ticketNumber++;
    }
}


public class TicketBooking {
    static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
    static void setup(Hall hall[],Movie m[]){
        System.out.println("Admin Movie setting: ");
        for(int i=0;i<3;i++){
            m[i] = new Movie();
            hall[i] = new Hall();
            hall[i].hallNumber=i+1;
            m[i].setMovie();
            hall[i].setMovie(m[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Hall hall[] = new Hall[3];
        Movie m[] = new Movie[3];
        setup(hall, m);
        //Hall setup done.
        clearScreen();
        System.out.println("Movie available: -");
        for(Hall h:hall){
            System.out.print("[Hall"+h.hallNumber+": ");
            System.out.print("Movie streaming: "+h.m.moviename+" ]\n");
        }
        System.out.println("Enter your choice: ");
        choice = sc.nextInt()-1;
        // sc.close();
        if(choice>2 || choice<0){
            System.out.println("Wrong choice");
        }else{ 
        Ticket t = new Ticket(hall[choice]);
        t.bookticket();
        t.hall.showseat();
        t.generateTicket();
    }
    sc.close();
    }
}