public class TuitionCenter {

//ATTRIBUTES
private TutorList tutor;
private StudentBatch students;
private String name;
private Address address;

//METHOD
//constructor
public TuitionCenter() {
}

public TuitionCenter(TutorList tutor, StudentBatch students, String name, Address address) {
    this.tutor = tutor;
    this.students = students;
    this.name = name;
    this.address = address;
}

//getter
public TutorList getTutor() {
    return tutor;
}

public StudentBatch getStudents() {
    return students;
}

public String getName() {
    return name;
}

public Address getAddress() {
    return address;
}

//setter
public void setTutor(TutorList tutor) {
    this.tutor = tutor;
}

public void setName(String name) {
    this.name = name;
}

public void setStudents(StudentBatch students) {
    this.students = students;
}

public void setAddress(Address address) {
    this.address = address;
}


}
