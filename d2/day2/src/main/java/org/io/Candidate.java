package org.io;

public class Candidate {
    private String candidate1;
    private String candidate2;

    public Candidate(String candidate1, String candidate2) {
        this.candidate1 = candidate1;
        this.candidate2 = candidate2;
    }

    public Candidate() {}

    public String getCandidate1() {
        return candidate1;
    }

    public void setCandidate1(String candidate1) {
        this.candidate1 = candidate1;
    }

    public String getCandidate2() {
        return candidate2;
    }

    public void setCandidate2(String candidate2) {
        this.candidate2 = candidate2;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidate1='" + candidate1 + '\'' +
                ", candidate2='" + candidate2 + '\'' +
                '}';
    }
}
