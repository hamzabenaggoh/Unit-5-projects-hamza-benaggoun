public class NUM implements Comparable{
    int val;
    public NUM(int vval){
        vval = val;

    }
    public NUM(){
        val = 0;
    }

    public int getNUM(){
        return val;
    }

    public void setNUM(int vval){
        val = vval;
    }

    public String toString(){
        return ("" + val);
    }

    public boolean  numEquals(NUM n1){
        if (n1.toString().equals(val)){
            return true;
        }
        else{
            return false;
        }
    }

    public int compareTo(Object other){
        NUM otherNum = (NUM) other;
        return this.getNUM() - otherNum.getNUM();
    }



}
