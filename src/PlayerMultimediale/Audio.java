package PlayerMultimediale;

import Interface.Play;
import Interface.Volume;

public class Audio extends PlayerMultimediale implements Play, Volume {
    private int durata;
    private int volume;


    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }


    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitolo() + dimensioneVolume());
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
}
