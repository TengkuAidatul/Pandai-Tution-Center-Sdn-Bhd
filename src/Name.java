public class Name {
    //ATTRIBUTES
    private String fname;
    private String mname;
    private String lname;

    //METHODS
    //constructor
    public Name(){}
    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    //to string
    @Override
    public String toString() {
        return "Name: " + fname + ' ' + mname + ' ' + lname ;
    }

    //getter
    public String getFname(){
        return fname;
    }
    public String getMname(){
        return mname;
    }
    public String Lname(){
        return lname;
    }

    //setter
    public void setFname(String fname){
        this.fname=fname;
    }
    public void setMname(String mname){
        this.mname=mname;
    }
    public void setLname(String lname){
        this.lname=lname;
    }

}
