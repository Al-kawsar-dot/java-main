public class Car {
    private String company_name,model_name;
    private int year;
    private double mileage;

    public String getCompany_Name(){
        return company_name;
    }
    public void setCompany_Name(String company_name){
        this.company_name=company_name;
    }
    public String getModel_Name(){
        return model_name;
    }
    public void setModel_Name(String model_name){
        this.model_name=model_name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public double getMileAge(){
        return  mileage;
    }
}
