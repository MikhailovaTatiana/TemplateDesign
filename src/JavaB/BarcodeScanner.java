package JavaB;

public class BarcodeScanner {

    private static BarcodeScanner barcodeScanner;

    private BarcodeScanner() {
    }
    public static BarcodeScanner getInstance(){
        if (barcodeScanner == null){
            barcodeScanner = new BarcodeScanner();
        }
        return barcodeScanner;
    }
        public boolean scanner(String id){
        return true;
    }
    public boolean compare(String numbers){
        return true;
    }
    public boolean confirmForNextStep(String product){
        return true;
    }
}
