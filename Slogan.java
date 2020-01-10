public class Slogan {


    private String slogan;
    private static int count;

    public Slogan(String slogan){
        this.slogan = slogan;
        count++;

    }
    public static int getCount(){
        return count;
    }

    public String toString(){
        return slogan;
    }


}
