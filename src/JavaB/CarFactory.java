package JavaB;

public class CarFactory extends AbstractFactory{

    public CarFactory(int q) {
        super(q);
    }

    @Override
    boolean receiveComponents() {
        System.out.println("Received components for car");
        return true;
    }

    @Override
    void sortComponents() {
        System.out.println("Sorting components for car");
    }

    @Override
    void assembly() {
        System.out.println("Assembly car managed");
    }

    @Override
    void packageProduct() {
        System.out.println("Does nothing on car");
    }

    @Override
    void send() {
        System.out.println("Sending car");
    }
}
