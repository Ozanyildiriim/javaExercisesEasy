package Chapter7OopClassesAndInherıtance.RecordProject;

public class POJO {

    public static void main(String[] args) {
        for (int i=1; i <=5; i++){
            //Student s = new Student("S90" + i,
            LPAStudent s = new LPAStudent("S90" + i,
                    switch (i){
                        case 1 -> "Ozan";
                        case 2 -> "Hanna";
                        case 3 -> "Jakob";
                        case 4 -> "Emil";
                        case 5 -> "Martina";
                        default -> "Anonymous";

                    },"05/26/1998","Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S90","Anna","05/02/2001","Java MasterCLASS");
        LPAStudent recordStudent = new LPAStudent("S998","Lukas","05/04/1995","Java MasterCLASS");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", JAVA OCP Exam 829");
//        recordStudent.classList(recordStudent.classList() + ", JAVA OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}
