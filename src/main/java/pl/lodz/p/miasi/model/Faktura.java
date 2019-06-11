package pl.lodz.p.miasi.model;

public class Faktura {

    private double prad;
    private double gaz;

    public double getPrad() {
        return prad;
    }

    public void setPrad(double prad) {
        this.prad = prad;
    }

    public double getGaz() {
        return gaz;
    }

    public void setGaz(double gaz) {
        this.gaz = gaz;
    }

    @Override
    public String toString() {
        return "Faktura{" +
                "prad=" + prad +
                ", gaz=" + gaz +
                '}';
    }
}
