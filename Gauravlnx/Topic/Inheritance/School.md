class School{

    String schoolName;
    void showSchool(){
        System.out.println("School: "+schoolName);
    }

}
class Teacher extends School{

    String teacherName;
    void showTeacherDetails(String sn , String tn){
        schoolName = sn;
        teacherName = tn;
        System.out.println("School: "+schoolName);
        System.out.println("Teacher: "+teacherName);
    }

    Teacher t = new Teacher();
    t.showTeacherDetails();

}