package org.dependencies;

public class Knight {
    private Horse horse;


    public Knight(Horse horse) {
        this.horse = horse;
    }

    public boolean canPlanMission() {
        if (this.getHorse().getHealthScore() > 5) {
            return false;
        }
        return true;
    }
    public Horse getHorse() {
        return horse;
    }
}
