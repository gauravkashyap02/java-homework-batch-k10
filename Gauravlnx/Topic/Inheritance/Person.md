class Person{
    
    void showDetails(){
        System.out.println("Person Details");
    }

    public static void main(String[] args){
        Student s = new Student();
        s.showDetails();
    }

}

class Student extends Person{
    
    void showDetails(){
        System.out.println("Student details");
        
    }
    
    
}