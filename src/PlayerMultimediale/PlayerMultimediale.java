package PlayerMultimediale;

import java.util.Objects;

public abstract class PlayerMultimediale {
    private String titolo;

    public PlayerMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerMultimediale that = (PlayerMultimediale) o;
        return Objects.equals(titolo, that.titolo);
    }


}
