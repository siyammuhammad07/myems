
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */

// FULL TIME EMPLOYEE

public class FTE extends EmployeeInfo {
    
    /**
     *
     */
    public double yearlySalary;
    
    /**
     *
     * @param eN
     * @param fN
     * @param lN
     * @param g
     * @param wL
     * @param dR
     * @param yS
     */
    public FTE(int eN, String fN, String lN, int g, int wL, double dR, double yS) {
        super(eN, fN, lN, g, wL, dR);
        yearlySalary = yS;
      
    }
    
    
    @Override
    public double getYearlySalary() {
        return yearlySalary;
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
        return (yearlySalary *(1.0 - deductRate));
    }
    
}