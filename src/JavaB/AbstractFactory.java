package JavaB;

public abstract class AbstractFactory {

    int quota;
    protected BarcodeScanner barcodeScanner;
    abstract boolean receiveComponents();
    abstract boolean sortComponents();
    abstract boolean assembly();
    abstract boolean packageProduct();
    abstract boolean send();

    public AbstractFactory(int q) {
        this.quota = q;
        this.barcodeScanner = BarcodeScanner.getInstance();
    }


}

