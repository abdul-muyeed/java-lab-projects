package LabAssignment2;

public class isLeaperYear {
    int year;

    public void setYear(int year) {
        this.year = year;
    }
    String leaper;
    public String getLeaper() {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            leaper = year + " is a leap year";
        }else{
            leaper = year + " is not a leap year";
        }
        return leaper;
    }

    

    
}
