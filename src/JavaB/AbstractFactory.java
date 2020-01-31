package JavaB;

public abstract class AbstractFactory {

    int quota;
    abstract boolean receiveComponents();
    abstract void sortComponents();
    abstract void assembly();
    abstract void packageProduct();
    abstract void send();

    public AbstractFactory(int q) {
        this.quota = q;
    }
}

