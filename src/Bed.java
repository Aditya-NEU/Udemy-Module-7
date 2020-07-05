public class Bed {

    private String stall;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String stall, int pillows, int height, int sheets, int quilt) {
        this.stall = stall;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }


    public String getStall() {
        return stall;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }


    public void make(){

        System.out.println("In the bed class making.");
    }
}
