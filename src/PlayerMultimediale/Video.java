package PlayerMultimediale;

import Interface.Luminosita;
import Interface.Play;
import Interface.Volume;

public class Video extends PlayerMultimediale implements Play, Volume, Luminosita {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }


    public int getLuminosita() {
        return luminosita;
    }


    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitolo() + dimensioneVolume() + dimensioneLuminosita());
        }
    }

    @Override
    public void abbassaVolume() {
        this.volume -= 1;
    }

    @Override
    public void alzaVolume() {
        this.volume += 1;

    }

    @Override
    public String dimensioneVolume() {
        String volume = "";
        for (int i = 0; i < getVolume(); i++) {
            volume += "!";

        }
        return volume;
    }

    @Override
    public void abbassaLuminosita() {
        this.luminosita -= 1;
    }

    @Override
    public void alzaLuminosita() {
        this.luminosita += 1;

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
