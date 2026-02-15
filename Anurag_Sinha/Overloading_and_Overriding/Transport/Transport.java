package Overloading_and_Overriding.Transport;

class Transport {
    void TravelMode(){
        System.out.println("Traveling");
    }
}
class Bus extends Transport {
    void TravelMode(){
        System.out.println("Traveling by bus");
    }
}
class Train extends Transport{
    void TravelMode(){
        System.out.println("Traveling by Train");
    }
}
class Flight extends Transport{
    void TravelMode(){
        System.out.println("Traveling by flight");
    }
}

class Main{
    public static void main(String[] args){
        Transport t1=new Bus();
        Transport t2=new Train();
        Transport t3=new Flight();

        t1.TravelMode();
        t2.TravelMode();
        t3.TravelMode();
    }
}