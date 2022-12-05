package Entities;

public class Participe {
    private int CodeLecon;
    private int codeUser;

    public Participe(int CodeLecon,int codeUser){
        this.setCodeLecon(CodeLecon);
        this.setCodeUser(codeUser);

    }

    public int getCodeLecon() {
        return CodeLecon;
    }

    public void setCodeLecon(int codeLecon) {
        CodeLecon = codeLecon;
    }

    public int getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(int codeUser) {
        this.codeUser = codeUser;
    }
}
