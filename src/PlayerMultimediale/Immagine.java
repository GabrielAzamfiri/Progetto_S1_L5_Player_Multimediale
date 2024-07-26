package PlayerMultimediale;

import Interface.Luminosita;

public class Immagine extends PlayerMultimediale implements Luminosita {
    private int luminosita;


    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }


    public void show() {

        System.out.println(getTitolo() + dimensioneLuminosita());

    }

    @Override
    public void abbassaLuminosita() {
        this.luminosita -= 1;
    }

    @Override
    public void alzaLuminosita() {
        this.luminosita -= 1;

    }

    @Override
    public String dimensioneLuminosita() {
        String luminux = "";
        for (int i = 0; i < getLuminosita(); i++) {
            luminux += "*";

        }
        return luminux;
    }
}
