package question5;

class Student {
    String name;

    void display(){
        System.out.println("Marks are here:");
    }

}

class MarkSheet extends Student {
    int chemestry;
    int physics;
    int math;

    public MarkSheet(String akram, int i, int i1, int i2) {
        this.name = akram;
        this.chemestry = i;
        this.physics = i1;
        this.math = i2;
    }

    @Override
    void display() {
//      super.display();
        System.out.println("Marks are here:");
        System.out.println(name);
        System.out.println("Chemistry:" + chemestry);
        System.out.println("Physics:" + physics);
        System.out.println("Math:" + math);

    }
}




public class Main {
    public static void main(String[] args) {
        MarkSheet m = new MarkSheet("Akram",50,90,78);
        m.display();
    }
}
