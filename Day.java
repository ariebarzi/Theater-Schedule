
package Theater_Schedule;

public class Day {
    
    private String name;
    private  int intermission;
    
    private  Movie[] movies;
    private  Clock startTime;
    
    public Day(String name, Movie[] movies, int intermission, Clock startTime){
        this.name=name;
        this.intermission=intermission;
        this.movies=movies;
        this.startTime=startTime;
    }
    
    public void showMovies(boolean showIntermission, boolean showHours){
        System.out.print(this.name + ":" + " ");
        for(int i =0; i<movies.length; i++){
            System.out.print(startTime.getCurrentTime()+ "-" + movies[i].getTitle(showHours)+" ");
            startTime.advanceTime(movies[i].getLength());
            startTime.advanceTime(intermission);
            if(i<movies.length-1 && showIntermission){
                 System.out.print("*"+intermission + " min* ");
            }
        }
       System.out.println();
    }
    
    
    
}
