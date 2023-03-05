public class Tutor {
    //ATTRIBUTES
    private Name tutorName;
    private String ic;
    private Address address;
    private String qualification;
    private int numYearExp;
    private String dateJoin;
    private int numOfYearInCenter;

    //OPERATION/METHODS
    //constructor
    public Tutor(){}
    
    public Tutor(Name tutorName, String ic, Address address, String qualification, int numYearExp, String dateJoin, int numOfYearInCenter) {
        this.tutorName = tutorName;
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.numYearExp = numYearExp;
        this.dateJoin = dateJoin;
        this.numOfYearInCenter = numOfYearInCenter;
    }

    //setter
    public void setTutorName(Name tutorName) {
        this.tutorName = tutorName;
    }

    //getter
    public Name getTutorName() {
        return tutorName;
    }

    //to string
    @Override
    public String toString() {
        return "Tutor \n" + tutorName + ", \nIC Number: " + ic + ", \nAddress: " + address + ", \nQualification: "
                + qualification + ", \nNumber of year experience: " + numYearExp + ", \nDate joined: " + dateJoin + ", \nNumber of years in the centre: "
                + numOfYearInCenter ;
    }

    
    
    
}
