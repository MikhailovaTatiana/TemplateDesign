package JavaB;

public class TelefoneFactory extends AbstractFactory {

    public TelefoneFactory(int q) {
        super(q);
    }
    @Override
    boolean receiveComponents() {
        System.out.println("Received components for telefone");
        return true;
    }

    @Override
    void sortComponents() {
        System.out.println("Sorting components for telefone");
    }

    @Override
    void assembly() {
        System.out.println("Assembly telefone managed");
    }

    @Override
    void packageProduct() {
        System.out.println("Does nothing on telefone");
    }

    @Override
    void send() {
        System.out.println("Sending telefone");
    }
}
