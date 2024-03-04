public class Sportsperson {
    private String name;

    public Sportsperson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display_all_info() {
        System.out.println("Name: " + name);
    }
}

public class Athlete extends Sportsperson {
    private String event;

    public Athlete(String name, String event) {
        super(name);
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

    @Override
    public void display_all_info() {
        super.display_all_info();
        System.out.println("Event: " + event);
    }
}

public class HockeyPlayer extends Sportsperson {
    private int goalsScored;

    public HockeyPlayer(String name, int goalsScored) {
        super(name);
        this.goalsScored = goalsScored;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    @Override
    public void display_all_info() {
        super.display_all_info();
        System.out.println("Goals Scored: " + goalsScored);
    }
}
