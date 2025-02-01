package mentor27.TvTime;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TvShowManagementSystem {
    private List<Shows> shows = new ArrayList<>();

    // Create ➝ Add a new object
    public void addShow(Shows show) {
        shows.add(show);
        System.out.println("New show added: " + show);
    }

    // Read ➝ Display all objects
    public void displayAllShows() {
        if (shows.isEmpty()) {
            System.out.println("No available..");
        } else {
            shows.forEach(System.out::println);
        }
    }

    // Update ➝ Modify an object
    public void updateShow(int id, String newName, double newImdb, Genres newGenre, Status newStatus) throws EntityNotFoundException {
        Optional<Shows> showsOptional = shows.stream().filter(s -> s.getId() == id).findFirst();
        if (showsOptional.isPresent()) {
            Shows show = showsOptional.get();
            shows.remove(show);
            Shows updatedShow = new Shows(newName, newImdb, newGenre, newStatus);
            shows.add(updatedShow);
            System.out.println("Updated show: " + updatedShow);
        } else {
            throw new EntityNotFoundException(id + "not found");
        }
    }

    // Delete ➝ Remove an object
    public void deleteShow (int id) throws EntityNotFoundException {
        Shows show = shows.stream().filter(s -> s.getId() == id).findFirst().orElseThrow(() ->
                new EntityNotFoundException(id + "not found"));
        shows.remove(show);
        System.out.println(show + "removed");
    }

    public void displayShowsByStatus(Status status) {
        shows.stream().filter(s -> s.getStatus() == status).forEach(System.out::println);
    }

    public void displayShowsBySortedImdb() {
        shows.stream().sorted(Comparator.comparingDouble(Shows::getImdb)).forEach(System.out::println);
    }

    public void findBestImdbShow() {
        Shows topShow = shows.stream().max(Comparator.comparingDouble(Shows::getImdb)).orElse(null);
        if (topShow != null) {
            System.out.println("Best IMDb rated show: " + topShow);
        } else {
            System.out.println("No Tv show..");
        }
    }
}
