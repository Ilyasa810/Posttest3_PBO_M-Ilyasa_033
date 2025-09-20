package Model;

public class PCGame extends Game {

    public PCGame(String nama, String genre, int tahunRilis) {
        super(nama, genre, tahunRilis);
    }

    @Override
    public String toString() {
        return super.toString() + " | (PC)";
    }
}
