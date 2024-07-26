package PlayerMultimediale;

import Interface.Play;
import Interface.Volume;

import java.util.Objects;
import java.util.Scanner;

public class Audio extends PlayerMultimediale implements Play, Volume {
    Scanner scanner = new Scanner(System.in);
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

    @Override
    public void cambioVolumeDinamico() {
        System.out.println("vuoi cambiare Volume? ( yes / no )");
        String cambiareLumi = scanner.nextLine();

        while (Objects.equals(cambiareLumi, "yes")) {
            System.out.println("Volume attuale: " + getVolume());

            System.out.println("Sceglia tra ( plus / minus / esci) ");
            String sceltaLumi = scanner.nextLine();
            switch (sceltaLumi) {
                case "plus": {
                    alzaVolume();
                    break;
                }
                case "minus": {
                    abbassaVolume();
                    break;
                }
                default:
                    System.out.println("Volume rimasto invariato");

                    cambiareLumi = "no";
                    break;
            }
        }
        play();
    }

}
