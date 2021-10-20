package hu.petrik.hattertarolooop;

public class Meret {
    private long meret; //Méret változó bejelentése - deklaráció
    private MertekEgyseg mertekEgyseg;

    public Meret(long meret, MertekEgyseg mertekEgyseg) {
        this.meret = meret; //Méret változónak érték adás - inicializáció
        this.mertekEgyseg = mertekEgyseg;
    }

    public long getMeret() {
        return meret;
    }

    public void setMeret(long meret) {
        this.meret = meret;
    }

    public MertekEgyseg getMertekEgyseg() {
        return mertekEgyseg;
    }

    public void setMertekEgyseg(MertekEgyseg mertekEgyseg) {
        this.mertekEgyseg = mertekEgyseg;
    }

    public long getEredetiMeret() {
        long meret = this.meret;
        switch (this.mertekEgyseg) {
            case BYTE:
                break;
            case KILOBYTE:
                meret *= 1024;
                break;
            case MEGABYTE:
                meret *= Math.pow(1024, 2);
                break;
            case GIGABYTE:
                meret *= Math.pow(1024, 3);
                break;
            case TERABYTE:
                meret *= Math.pow(1024, 4);
                break;
        }
        return meret;
    }

    @Override
    public String toString() {
        return "Méret: " + this.meret + " " + this.mertekEgyseg;
    }
}
