package NHA_DAT;

public class Date {
    public int day;
    public int month;
    public int year;
    Date(){
        day = 0;
        month = 0;
        year = 0;
    }
    Date(int d,int m,int y){
        day = d;
        month = m;
        year = y;
    }
    
    public String PrintDate(){
        return (Integer.toString(day) + '/' + Integer.toString(month) + "/" + Integer.toString(year));
    }
}
