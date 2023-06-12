package Appendix_D;

public class BitVectorBase {
    private long value;

    BitVectorBase() {

    }

    BitVectorBase(long initialValue){
        this.value = initialValue;
    }

    boolean isSet(int bit){
        long buffer = 1;
        buffer = buffer << bit;
        return (buffer & this.value) > 0;
    }

    void setBit(int bit, boolean value){
        if (bit < 0 || bit > 63) throw new IllegalArgumentException("Argument bit is out of range; valid range: [0..63]");
        long buffer = 1;
        buffer = buffer << bit;
        long full = Long.MAX_VALUE;

        if (value) {
            this.value = this.value | buffer;
        }
        else {
            full = full ^ buffer;
            this.value = this.value & full;
        }

    }

    public long getValue(){
        return this.value;
    }

    public void setValue(long value){
        this.value = value;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof BitVectorBase) {
            return ((BitVectorBase) obj).getValue() == this.getValue();
        }
        return false;
    }
}
