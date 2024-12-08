

public class EmployeeInfo {

    
    // ATTRIBUTES
    public int empNum;
    public String firstName;
    public String lastName;
    public int gender; // encode e.g. 0 for M, 1 for F, etc.
    public int workLoc; // encode e.g. 0 for Mississauga, etc.
    public double deductRate; // e.g. 0.21 for 21%
    
    
    // CONSTRUCTORS
    
    public EmployeeInfo(int eN, String fN, String lN, int g, int wL, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	gender = g;
    	workLoc = wL;
    	deductRate = dR;
    }
    
    
    // METHODS
    
    public int getEmpNum() {
    	return empNum;
    }
    
    public String getStrEmpNum(){
        return Integer.toString(empNum);
    
    }

    
    public String getGender(){
        if (gender == 1){
            return "Male";
        }
        if (gender == 2){
            return "Female";
        }
    return "N/A";
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public double getYearlySalary(){
        return 0.1;
    }
    
    public double getDeductRate() { 
        return deductRate*100;
       
    }
    
    public double getHourlyWage(){
        return 0.1;
    }
    
    public double getWeeksPerYear(){
        return 0.1;
    }
    
    public double getHoursPerWeek(){
      return 0.1; 
    }
    public double calcNetAnnualIncome() {
        return (-1.0);
    }

    public String getWorkLoc(){
        if (workLoc ==1){
            return "Toronto";
        }
        
        if (workLoc == 2){
            return "Mississauga";
        }

        if (workLoc == 3){
            return "Ottawa";
        }
        return "N/A";
    }

    

    
}

