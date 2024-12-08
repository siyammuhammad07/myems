
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */
    
// PART TIME EMPLOYEE

public class PTE extends EmployeeInfo {
    
    
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    
    public PTE(int eN, String fN, String lN, int g, int wL, double dR, double hW, double hPW, double wPY) {       
        
        super(eN, fN, lN, g, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
        
    }   
    
    @Override
    public double getHourlyWage(){
        return hourlyWage;
    }
   
    @Override
    public double getWeeksPerYear(){
        return weeksPerYear;
    }
    
    @Override
    public double getHoursPerWeek(){
      return hoursPerWeek; 
    }
    
    
    @Override
    public String getGender(){
        if (gender == 1){
            return "Male";
        }
        if (gender == 2){
            return "Female";
        }
    return "N/A";
    }
    
    @Override
    public double calcNetAnnualIncome() {
        return ((hourlyWage * hoursPerWeek * weeksPerYear) *(1.0 - deductRate));
    }

    
}
