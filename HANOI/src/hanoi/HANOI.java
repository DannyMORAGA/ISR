package hanoi;


public class HANOI {

private String Dat;
private HANOI up;
private HANOI down;

    public String getDat() {
        return Dat;
    }

    public void setDat(String Dat) {
        this.Dat = Dat;
    }

    public HANOI getUp() {
        return up;
    }

    public void setUp(HANOI up) {
        this.up = up;
    }

    public HANOI getDown() {
        return down;
    }

    public void setDown(HANOI down) {
        this.down = down;
    }

  
}
