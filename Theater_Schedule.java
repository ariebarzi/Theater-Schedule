
package Theater_Schedule;

import java.util.Scanner;

public class Theater_Schedule {

    public static void main(String[] args) {
        
        Movie encanto = new Movie("Encanto",102);
        Movie dune = new Movie("Dune",155);
        Movie bel = new Movie("Belfast",98);
        Movie look = new Movie("Don’t look up",138);
        Movie car = new Movie("Drive my car",179);
        Movie box = new Movie("Boxballet",15);
        Movie goodbye = new Movie("The long goodbye",13);
        
        Movie[] monMovies = {encanto, look, dune, box};
        Movie[] tueMovies = {encanto, box, goodbye, car};
        Movie[] wedMovies = {box, box , encanto, encanto, box};
        Movie[] thuMovies = {look, car, goodbye};
        Movie[] friMovies = {bel, car, goodbye, dune};
        Movie[] satMovies = {encanto, box, dune, look, car};
        Movie[] sunMovies = {encanto, dune, look, dune, look};
        
        Clock startTimeMon = new Clock(14,0);
        Clock startTimeTue = new Clock(10,0);
        Clock startTimeWed = new Clock(11,0);
        Clock startTimeThu = new Clock(11,0);
        Clock startTimeFri = new Clock(11,0);
        Clock startTimeSat = new Clock(9,30);
        Clock startTimeSun = new Clock(10,30);
        
        Day monday = new Day("Mon", monMovies, 15, startTimeMon);
        Day tuesday = new Day("Tue", tueMovies, 15, startTimeTue);
        Day wednesday = new Day("Wed", wedMovies, 10, startTimeWed);
        Day thursday = new Day("Thu", thuMovies, 15, startTimeThu);
        Day friday = new Day("Fri", friMovies, 20, startTimeFri);
        Day saturday = new Day("Sat", satMovies, 20, startTimeSat);
        Day sunday = new Day("Sun", sunMovies, 20, startTimeSun);
        
        //monday.showMovies(true, true);
        //tuesday.showMovies(true, false);
        Day[] week = {monday, tuesday, wednesday, thursday, friday, saturday, sunday};
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter H for hours/minutes format:");
        String userInput=kb.nextLine();
        System.out.println();
        String userIgnore = userInput.toLowerCase();
        
        
        
        for (int d=0; d<7; d++){
            if(userIgnore.equalsIgnoreCase("h")){
            week[d].showMovies(true, true);
        } else{
                week[d].showMovies(false, false);
            }
            System.out.println();
        }
        
        
        
    }
    
}
