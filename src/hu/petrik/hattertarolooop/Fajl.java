package hu.petrik.hattertarolooop;

import java.util.List;

public class Fajl {
    private String nev;
    private String kiterjesztes;
    private String tartalom;
    private List<Attributum> attributumok;
    private Meret meret;

    public Fajl(String nev, String kiterjesztes, String tartalom, List<Attributum> attributumok) {
        this.nev = nev;
        this.kiterjesztes = kiterjesztes;
        this.tartalom = tartalom;
        this.attributumok = attributumok;
        int mertEgysegIndex = 0;
        long meret = tartalom.length();
        while (meret > 1024 && mertEgysegIndex < 4) {
            meret /= 1024;
            mertEgysegIndex++;
        }
        MertekEgyseg mertekEgyseg;
        switch (mertEgysegIndex) {
            case 1:
                mertekEgyseg = MertekEgyseg.KILOBYTE;
                break;
            case 2:
                mertekEgyseg = MertekEgyseg.MEGABYTE;
                break;
            case 3:
                mertekEgyseg = MertekEgyseg.GIGABYTE;
                break;
            case 4:
                mertekEgyseg = MertekEgyseg.TERABYTE;
                break;
            default:
                mertekEgyseg = MertekEgyseg.BYTE;
                break;
        }
        this.meret = new Meret(meret, mertekEgyseg);
    }

    public String getTartalom() {
        return tartalom;
    }

    public List<Attributum> getAttributumok() {
        return attributumok;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKiterjesztes(String kiterjesztes) {
        this.kiterjesztes = kiterjesztes;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
        int mertEgysegIndex = 0;
        long meret = tartalom.length();
        while (meret > 1024 && mertEgysegIndex < 4) {
            meret /= 1024;
            mertEgysegIndex++;
        }
        MertekEgyseg mertekEgyseg;
        switch (mertEgysegIndex) {
            case 1:
                mertekEgyseg = MertekEgyseg.KILOBYTE;
                break;
            case 2:
                mertekEgyseg = MertekEgyseg.MEGABYTE;
                break;
            case 3:
                mertekEgyseg = MertekEgyseg.GIGABYTE;
                break;
            case 4:
                mertekEgyseg = MertekEgyseg.TERABYTE;
                break;
            default:
                mertekEgyseg = MertekEgyseg.BYTE;
                break;
        }
        this.meret.setMeret(meret);
        this.meret.setMertekEgyseg(mertekEgyseg);
    }

    public void setAttributumok(List<Attributum> attributumok) {
        this.attributumok = attributumok;
    }

    @Override
    public String toString() {
        return nev + "." + kiterjesztes + " " + meret;
    }
}
