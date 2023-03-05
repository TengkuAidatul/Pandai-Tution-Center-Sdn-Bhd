public class Student {
    //ATTRIBUTES
    private Name studname;
    private String ic;
    private Address address;
    private int year;
    private Address schoolName;
    private float marks[] = new float[5];

    //METHOD
    //constructor
    public Student() {}
    public Student(Name studname, String ic, Address address, int year, Address schoolName, float[] marks) {
        this.studname = studname;
        this.ic = ic;
        this.address = address;
        this.year = year;
        this.schoolName = schoolName;
        this.marks = marks;
    }

    //getter
    public Name getStudname() {
        return studname;
    }

    //setter
    public void setStudname(Name studname) {
        this.studname = studname;
    }
    public void setMark(float mark, int i){
        marks[i] = mark;
    }

    float calcAvg(){
        float sum=0;
        for (int i=0; i<5; i++){
            sum+=marks[i];
        }
        return sum/5;
    }

    float calcMin(){
        float min=101;
        for (int i=0; i<5; i++){
            if (marks[i]<min)
                min = marks[i];
        }
        return min;
    }
}
