package Inheritance;

public class Device {
String deviceName;

    void showInfo(){
        System.out.println("Device Name: "+deviceName);
    }
}

class Mobile extends Device{
String os;
void showInfo(){
System.out.println("Device Name: "+deviceName);
System.out.println("Operating System: "+os);
}
}
class Main2{
public static void main(String[] args){

        Mobile m = new Mobile();
        m.deviceName = "Motorola G64 5g";
        m.os = "Android";
        m.showInfo();


    }
}