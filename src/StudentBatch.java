public class StudentBatch {
    //ATTRIBUTE
    //what is a StudentBatch? a StudentBatch is a list of students registered in a StudentBatch
    //"list of students"? -> an array of student
    private Student students[] = new Student[5];
    private int size=0;

    //METHOD
    //constructor
    public StudentBatch(){}

    //To add student into array
    public void add(Student s){
        students[size++] = s;
    }

    //To find student in array
    public boolean find(Name studname){
        for(int i=0; i<size; i++){
            if (students[i].getStudname() == studname)
                return true;
        }
        return false;
    }

}
