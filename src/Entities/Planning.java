package Entities;

public class Planning {
    private String heurePlanning;
    private String datePlanning;
    private String codeLecon;


    public Planning(String heureplanning,String date,String codeLecon){
        this.setHeurePlanning(heureplanning);
        this.setDatePlanning(date);
        this.setCodeLecon(codeLecon);

    }

    public String getHeurePlanning() {
        return heurePlanning;
    }

    public void setHeurePlanning(String heurePlanning) {
        this.heurePlanning = heurePlanning;
    }

    public String getDatePlanning() {
        return datePlanning;
    }

    public void setDatePlanning(String datePlanning) {
        this.datePlanning = datePlanning;
    }

    public String getCodeLecon() {
        return codeLecon;
    }

    public void setCodeLecon(String codeLecon) {
        this.codeLecon = codeLecon;
    }
}
