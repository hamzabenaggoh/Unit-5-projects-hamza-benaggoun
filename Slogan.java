public class Slogan implements Lockable {

    private String slogan;
    private static int count;
    private int key;
    private boolean isLocked;

    public Slogan(String slogan){
        this.slogan = slogan;
        count++;
        key = 0;
        this.isLocked = false;
    }

    public void setKey(int oldKey , int key){
        if (oldKey == key){
            this.key = key;
        }
    }

    public void lock(int key){
        if (this.key == key){
            this.isLocked = true;
        }
    }

    public void unlock(int key){
        if (key == this.key){
            this.isLocked = false;
        }
    }

    public boolean locked(){
        return this.isLocked;
    }

    public static int getCount(){
        return count;
    }

    public String toString(Slogan slog){
        if (slog.locked() == false){
            return slogan;
        }
        else{
            return "ERROR: Slogan method is locked";
        }
    }


}
