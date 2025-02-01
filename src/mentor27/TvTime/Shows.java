package mentor27.TvTime;

import java.util.Objects;

public class Shows {
    private int id;
    private String name;
    private double imdb;
    private Genres genre;
    private Status status;
    private static int idCounter;

    public Shows(String name, double imdb, Genres genre, Status status) {
        this.id = idCounter++;
        this.name = name;
        this.imdb = imdb;
        this.genre = genre;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getImdb() {
        return imdb;
    }

    public Genres getGenre() {
        return genre;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Shows{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imdb=" + imdb +
                ", genre=" + genre +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shows shows = (Shows) o;
        return id == shows.id && Double.compare(imdb, shows.imdb) == 0 &&
                Objects.equals(name, shows.name) && genre == shows.genre && status == shows.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, imdb, genre, status);
    }
}
