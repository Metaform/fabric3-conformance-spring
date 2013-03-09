package test;

public class ServiceWithRefImpl1 implements Service {

    Service ref;

    public Service getRef() {
        return ref;
    }

    public void setRef(Service ref) {
        this.ref = ref;
    }

    public String testIt(String s) {
        return "ServiceImpl1 " + ref.testIt(s);
    }

}
