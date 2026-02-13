package Inheritance;

class Device {
    String devicename="Samsung";
    void showInfo(){
        System.out.println("Device Name: "+devicename);
    }
}
class Mobile extends Device{
    String os="Android";
    void showInfo(){
        super.showInfo();
        System.out.println("Device OS: "+os);
    }
    public static void main(String[] args){
        Mobile m=new Mobile();
        m.showInfo();
    }
}