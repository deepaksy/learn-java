package collections.list;
import java.util.ArrayList;
import java.util.Iterator;

class Car{
    int noOfWeels;
    double maxSpeed;
    double torque,power;
    String brand,name;
    public Car(String brand,String name,double torque,double power,double maxspeed,int weels){
        this.noOfWeels=weels;
        this.brand=brand;
        this.maxSpeed=maxspeed;
        this.torque=torque;
        this.power=power;
        this.name=name;
    }
    public int getNoOfWeels() {
        return noOfWeels;
    }
    public void setNoOfWeels(int noOfWeels) {
        this.noOfWeels = noOfWeels;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public double getTorque() {
        return torque;
    }
    public void setTorque(double torque) {
        this.torque = torque;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Car [noOfWeels=" + noOfWeels + ", maxSpeed=" + maxSpeed + ", torque=" + torque + ", power=" + power
                + ", brand=" + brand + ", name=" + name + "]";
    }
    
}
public class ArrayListCollection{
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        ArrayList<Car> cars =new ArrayList<Car>();
        list.add("Deepak");
        cars.add(new Car("Honda","City",114,250,220,4));
        cars.add(new Car("Suzuki","Baleno",114,250,220,4));
        cars.add(new Car("Honda","Amaze",114,250,220,4));
        Iterator<Car> itr= cars.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
}