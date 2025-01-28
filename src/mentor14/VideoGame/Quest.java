package mentor14.VideoGame;

public class Quest {
    String questName;
    String description;
    String reward;

    public Quest(String questName, String description, String reward) {
        this.questName = questName;
        this.description = description;
        this.reward = reward;
    }


    public void start() {
        System.out.println("Start the quest! ");
    }

    public void complete() {
        System.out.println("Complete the quest.. ");
    }

    public void trackProgress() {

    }
}
