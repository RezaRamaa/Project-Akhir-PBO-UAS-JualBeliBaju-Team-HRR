
package Entity;

public class daftarpembeli {
    private PembeliEntity pembeli;
    private boolean isVerified;
    private int indexBaju;

    public daftarpembeli(PembeliEntity pembeli, boolean isVerified, int indexBaju) {
        this.pembeli = pembeli;
        this.isVerified = isVerified;
        this.indexBaju = indexBaju;
    }

    public PembeliEntity getPembeli() {
        return pembeli;
    }

    public void setPembeli(PembeliEntity pembeli) {
        this.pembeli = pembeli;
    }

    public boolean isIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getIndexBaju() {
        return indexBaju;
    }

    public void setIndexBaju(int indexBaju) {
        this.indexBaju = indexBaju;
    }

}
