package LabAssignment2;


public class TaxCalculator {
    int status;

    public void setStatus(int status) {
        this.status = status;
    }

    int income;

    public void setIncome(int income) {
        this.income = income;
    }

    public double tax;

    public double getTax() {

        if(status==0){
        if(income<=8000){
            tax= income * 0.10;
        }else if(income<=32000){
            tax = 800 + (income-8000)*0.15;
        }else{
            tax = 4400 + (income-32000)*0.25;
        }
    }else{
        if(income<=16000){
            tax= income * 0.10;
        }else if(income<=64000){
            tax = 1600 + (income-16000)*0.15;
        }else{
            tax = 8800 + (income-64000)*0.25;
        }
    }
        return tax;
    }
    
}
