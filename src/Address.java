public class Address {

    //ATTRIBUTES
    private int unitNo;
    private String street;
    private int postcode;
    private  String district;
    private String state;

    //OPERATIONS
    //constructor
    public Address(){}
    public Address(int unitNo, String street, int postcode, String district, String state){
        this.unitNo = unitNo;
        this.street = street;
        this.postcode = postcode;
        this.district = district;
        this.state = state;
    }

    //to string
    @Override
    public String toString() {
        return "Address: "+ unitNo+" " + street+", " + postcode+ " " + district+", " + state ;
    }

    //getter
    public int getunitNo(){
        return unitNo;
    }
    public String getStreet(){
        return street;
    }
    public int getPostcode(){
        return postcode;
    }
    public String getDistrict(){
        return district;
    }
    public String getState(){
        return state;
    }

    //setter
    public void setunitNo(int unitNo){
        this.unitNo=unitNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setState(String state) {
        this.state = state;
    }
}
