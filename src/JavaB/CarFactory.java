package JavaB;

public class CarFactory extends AbstractFactory{


    public CarFactory(int q) {
        super(q);
    }
    // tar emot kompenenter
    @Override
    boolean receiveComponents() {
        System.out.println("Received components for car");

        if(barcodeScanner.scanner("myId")){
            return true;
        }
        return false;
    }
    // sorterar komponenter
    @Override
    boolean sortComponents() {
        System.out.println("Sorting components for car");
        if(barcodeScanner.confirmForNextStep("myId")){
            return true;
        }
        return false;
    }
    // börja sortering
    @Override
    boolean assembly() {
        System.out.println("Assembly car managed");
        return true;
    }
     // börja paketering
    @Override
    boolean packageProduct() {
        System.out.println("Does nothing on car");
        return true;

    }
    // skicka produkten
    @Override
    boolean send() {
        System.out.println("Sending car");
        quota -= 10;
        return true;

    }
}
