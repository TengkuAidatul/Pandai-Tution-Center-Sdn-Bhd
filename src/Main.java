public class Main {
    public static void main(String[] args) {

        System.out.println("HELLO, WELCOME TO PANDAI SDN BHD");

        Student Aisyah = new Student();
        Name thename = new Name("Siti","Nur","Aisyah");
        Aisyah.setStudname(thename);

        Student Anis = new Student();
        thename = new Name("Anis","Binti","Hadzlan");
        Anis.setStudname(thename);

        thename = new Name("Sharifah", "Binti", "Hashim");
        Address teacherAddress = new Address(69,"Jalan Kenanga",20000,"Battlewood","London");
        Tutor Shaf = new Tutor(thename, "031002099982", teacherAddress, "SPM", 2, "2 Februari 2020", 2);

        TuitionCenter Damansara = new TuitionCenter();
        Address centreAddress = new Address(69,"Jalan Kenanga",20000,"Battlewood","London");
        Damansara.setAddress(centreAddress);
        Damansara.setName("Pandai Damansara");
        System.out.println("Centre:"+Damansara.getName());
        System.out.println(centreAddress.toString());

        StudentBatch student2023 = new StudentBatch();
        student2023.add(Aisyah);
        student2023.add(Anis);

        TutorList tutor2023 = new TutorList();
        tutor2023.add(Shaf);

        /*boolean isIn = student2023.find(Aisyah.getStudname());
            if(isIn = true)
                System.out.println("EXIST");
        */
        
        for (int i=0; i<5; i++){
            Aisyah.setMark(100, i);
        }
        System.out.println("\nStudent:\n"+ Aisyah.getStudname());
        float avg = Aisyah.calcAvg();
        System.out.println("Avg = "+avg);
        System.out.println("Min = "+ Aisyah.calcMin());
    
        
        for (int i=0; i<5; i++){
            Anis.setMark(100, i);
        }
        System.out.println("\nStudent:\n"+Anis.getStudname());
        System.out.println("Avg = "+Anis.calcAvg());
        System.out.println("Min = "+ Anis.calcMin());

        System.out.println("\n" + Shaf.toString());
    }
}