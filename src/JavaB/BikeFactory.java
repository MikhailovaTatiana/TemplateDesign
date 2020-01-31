package JavaB;

public class BikeFactory extends AbstractFactory {

    public BikeFactory(int q) {
        super(q);
    }
    @Override
    boolean receiveComponents() {
        System.out.println("Received components for bike");
        return true;
    }

    @Override
    void sortComponents() {
        System.out.println("Sorting components for bike");
    }

    @Override
    void assembly() {
        System.out.println("Assembly bike managed");
    }

    @Override
    void packageProduct() {
        System.out.println("Does nothing on bike");
    }

    @Override
    void send() {
        System.out.println("Sending bike");
    }
}
