public class TutorList {
    //ATTRIBUTE
    //what is a TutorList? a TutorList is a list of tutors registered in a TutorList
    //"list of tutors"? -> an array of tutor
    private Tutor tutors[] = new Tutor[5];
    private int size=0;

    //METHOD
    public TutorList(){}

    //To add student into array
    public void add(Tutor s){
        tutors[size++] = s;
    }
}
