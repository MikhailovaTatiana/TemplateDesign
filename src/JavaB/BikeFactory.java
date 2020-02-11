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
    boolean sortComponents() {
        System.out.println("Sorting components for bike");
    }

    @Override
    boolean assembly() {
        System.out.println("Assembly bike managed");
    }

    @Override
    boolean packageProduct() {
        System.out.println("Does nothing on bike");
    }

    @Override
    boolean send() {
        System.out.println("Sending bike");
    }
}
