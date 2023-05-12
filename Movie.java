package Theater_Schedule;

public class Movie {

    private String name;
    private int length;
   
    public Movie(String name, int length){
        this.name=name;
        this.length=length;
    }
    
    public int getLength() {
        return length;
    }
    
    private String getTitleMins(){
        String output =name+" ("+length+" min)";
        return output;
    }
    
    private String getTitleHrsMin() {
        int hours = length / 60;
        int minutes = length % 60;
        String output = name + " (" + hours +"h " + minutes +"m)";
        
        return output;
    }
    
    public String getTitle(boolean hourFlag) {
        String output="";
        if(hourFlag) {
            output = getTitleHrsMin();
        } else {
            output = getTitleMins();
        }
        
        return output;
    }
    
    
    
}
