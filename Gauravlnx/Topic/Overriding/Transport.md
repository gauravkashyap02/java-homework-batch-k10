package Overriding;

class Transport {
void travelMode(){
System.out.println("Traveling");
}
}

class Bus extends Transport{
void travelMode(){
System.out.println("Traveling in bus");
}
}

class Train extends Transport{
void travelMode(){
System.out.println("Traveling in train");
}
}

class Flight extends Transport{
void travelMode(){
System.out.println("Traveling in flight");
}
}

class Main3{
public static void main(String[] args){

        Transport t1 = new Bus();
        Transport t2 = new Train();
        Transport t3 = new Flight();

        t1.travelMode();
        t2.travelMode();
        t3.travelMode();



    }
}