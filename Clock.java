
package Theater_Schedule;


public class Clock {
    
    private int hours;
    private int minutes;

    public Clock(int hours_in, int mins_in) {
        hours = hours_in;
        minutes = mins_in;
    }

    /*public Clock() {
        this(0, 0);
        System.out.println("Warning: No time value specified; setting clock to midnight!");
    }

    public void setHours(int h) {
        hours = h;
    }

    public void setMins(int m) {
        minutes = m;
    }

    public int getHours() {
        return hours;
    }

    public int getMins() {
        return minutes;
    }*/

    public String getCurrentTime() {
        String output = "";

        String h = Integer.toString(hours);
        if (hours < 10) {
            h = "0" + h;
        }
        String m = Integer.toString(minutes);
        if (minutes < 10) {
            m = "0" + m;
        }

        output = h + ":" + m;

        return output;
    }
    
    public void advanceTime(int minutes_in){
       int extraMins=minutes+minutes_in;
       while(extraMins>59){
          extraMins = extraMins-60;
          hours=hours+1;
       }
       while(hours>23){
           hours=hours-24;
       }
       minutes=extraMins;
    }
    
}
