package PlayerMultimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        PlayerMultimediale[] players = new PlayerMultimediale[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Cosa vuoi creare tra: ( immagine / video / audio ) ?");
            String sceltaCreazione = scanner.nextLine();
            switch (sceltaCreazione) {
                case "immagine": {
                    System.out.println("Inserisci il Titolo del Immagine!");
                    String titolo = scanner.nextLine();
                    System.out.println("Inserisci la Luminosita del Immagine!");
                    int luminosita = Integer.parseInt(scanner.nextLine());


                    players[i] = new Immagine(titolo, luminosita);
                    break;
                }
                case "video": {
                    System.out.println("Inserisci il Titolo del video!");
                    String titolo = scanner.nextLine();
                    System.out.println("Inserisci la durata del video!");
                    int durata = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume del video!");
                    int volume = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la Luminosita del video!");
                    int luminosita = Integer.parseInt(scanner.nextLine());


                    players[i] = new Video(titolo, durata, volume, luminosita);
                    break;
                }
                case "audio": {
                    System.out.println("Inserisci il Titolo del Audio!");
                    String titolo = scanner.nextLine();
                    System.out.println("Inserisci la durata del Audio!");
                    int durata = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume del Audio!");
                    int volume = Integer.parseInt(scanner.nextLine());


                    players[i] = new Audio(titolo, durata, volume);
                    break;
                }
                default:
                    System.out.println("Errore.. la tua scelta non è tra le opzioni date!! ");
                    i--;
                    break;
            }
        }

        int sceltaPlayer;
        while (true) {
            System.out.println("Inserisci il numero del Player che vuoi riprodurre!");
            sceltaPlayer = Integer.parseInt(scanner.nextLine());
            if (sceltaPlayer == 0) {
                System.out.println("MediaPlayer turned off!");
                break;
            }
            if (sceltaPlayer > 5) {
                System.out.println("Player non presente!");
                continue;
            }
            int indexPlayer = sceltaPlayer - 1;
            if (players[indexPlayer] instanceof Immagine) {
                Immagine immagine = (Immagine) players[indexPlayer];
                immagine.show();
                immagine.cambioLuminositaDinamico();

            } else if (players[indexPlayer] instanceof Video) {
                Video video = (Video) players[indexPlayer];
                video.play();
                video.cambioLuminositaDinamico();
                video.cambioVolumeDinamico();

            } else if (players[indexPlayer] instanceof Audio) {
                Audio audio = (Audio) players[indexPlayer];
                audio.play();
                audio.cambioVolumeDinamico();
            }
        }
        ;


        scanner.close();
    }
}