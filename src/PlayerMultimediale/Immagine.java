package PlayerMultimediale;

import Interface.Luminosita;

import java.util.Objects;
import java.util.Scanner;

public class Immagine extends PlayerMultimediale implements Luminosita {
    Scanner scanner = new Scanner(System.in);
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

    @Override
    public void cambioLuminositaDinamico() {
        System.out.println("vuoi cambiare luminosita? ( yes / no )");
        String cambiareLumi = scanner.nextLine();

        while (Objects.equals(cambiareLumi, "yes")) {
            System.out.println("Luminosita attuale: " + getLuminosita());

            System.out.println("Sceglia tra ( plus / minus / esci) ");
            String sceltaLumi = scanner.nextLine();
            switch (sceltaLumi) {
                case "plus": {
                    alzaLuminosita();
                    break;
                }
                case "minus": {
                    abbassaLuminosita();
                    break;
                }
                default:
                    System.out.println("Luminosita rimasta invariata");

                    cambiareLumi = "no";
                    break;
            }
        }

        show();
    }
}
