package my;

public class BaseballCoach implements Coach{
    private FortureService fortureService;

    public BaseballCoach(FortureService fortureService) {
        this.fortureService = fortureService;
    }

    public String getDailyWorkout(){
        return "Spend 13 min";
    }
}
