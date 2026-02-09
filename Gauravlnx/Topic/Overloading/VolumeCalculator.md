package Overloading;


public class VolumeCalculator {

        void volume(int side){

            int Cude = side * side * side;
            System.out.println("Volume of Cude: "+Cude);

        }

        void volume(int length , int breadth, int height){

            int result = length * breadth * height;
            System.out.println("Volume of Cuboid: "+result);

        }

        void volume(double radius, double height){

            double result = Math.PI * radius * radius * height;
            System.out.println("Volume of Cylinder: "+result);
        }

        public static void main(String[] args){

            VolumeCalculator vc = new VolumeCalculator();

            vc.volume(10);
            vc.volume(12,23,43);
            vc.volume(12.3,3.2);

        }

    }
