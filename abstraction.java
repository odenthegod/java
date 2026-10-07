abstract class Appliance{
    private  String brand;

    public Appliance(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }

    abstract void turnOn();

    void displayPowerStatus() {
        System.out.println(brand + " appliance status: Plugged into power.");
    }
}

interface SmartDevice{
    void connectToWifi();
}
interface VoiceControlled{
    void processVoiceCommand(String command);
}

class SmartRefrigerator extends Appliance implements SmartDevice, VoiceControlled {
    public SmartRefrigerator(String brand) {
        super(brand);
    }
    @Override
    void turnOn() {
        System.out.println(getBrand() + " Smart Refrigerator is now cooling.");
    }

    @Override
    public void connectToWifi() {
        System.out.println(getBrand() + " Refrigerator connected to home Wi-Fi.");
    }

    @Override
    public void processVoiceCommand(String command) {
        System.out.println(getBrand() + " Refrigerator executing command: \"" + command + "\"");
    }

}
public class abstraction {

    public static void main(String[] args) {
        SmartRefrigerator myFridge=new SmartRefrigerator("samsung");
        myFridge.displayPowerStatus();
        myFridge.turnOn();
        myFridge.connectToWifi();
        myFridge.processVoiceCommand("Set temperature to 4 degrees Celsius");

    }
}