package com.example.ex_intermediate.Domain;

public class SLeague {

    private String giants;
    private String tigers;
    private String dragons;
    private String baystars;
    private String carp;
    private String swallows;
    public String getGiants() {
        return giants;
    }
    public void setGiants(String giants) {
        this.giants = giants;
    }
    public String getTigers() {
        return tigers;
    }
    public void setTigers(String tigers) {
        this.tigers = tigers;
    }
    public String getDragons() {
        return dragons;
    }
    public void setDragons(String dragons) {
        this.dragons = dragons;
    }
    public String getBaystars() {
        return baystars;
    }
    public void setBaystars(String baystars) {
        this.baystars = baystars;
    }
    public String getCarp() {
        return carp;
    }
    public void setCarp(String carp) {
        this.carp = carp;
    }
    public String getSwallows() {
        return swallows;
    }
    public void setSwallows(String swallows) {
        this.swallows = swallows;
    }
    @Override
    public String toString() {
        return "SLeague [giants=" + giants + ", tigers=" + tigers + ", dragons=" + dragons + ", baystars=" + baystars
                + ", carp=" + carp + ", swallows=" + swallows + "]";
    }
    
}
