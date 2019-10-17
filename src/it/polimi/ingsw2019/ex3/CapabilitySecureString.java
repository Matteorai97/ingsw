package it.polimi.ingsw2019.ex3;

public class CapabilitySecureString extends SecureString {

    private Object capability;
    private boolean emitted;

    public CapabilitySecureString(String s) {
        super(s);
        capability = null;
        emitted = false;
    }

    public Object getCapability(){
        if(emitted)
            return null;

        capability = new Object();
        emitted = true;

        return capability;

    }

    @Override
    protected boolean isSafe(Object o) {
        return o == capability;
    }

    public static void main(String[] args){
        CapabilitySecureString s = new CapabilitySecureString("Hello!");
        Object o = s.getCapability();

        s.securePrint(o);
        s.securePrint(null);
        s.securePrint(new Object());
    }
}
