public class SloganClient {
    public static void main(String[] args){
        Slogan s1 = new Slogan("Im lovin it");
        Slogan s2 = new Slogan("Eat fresh");
        Slogan s3 = new Slogan("Just Do it");
        Slogan s4 = new Slogan("Its finger lickin good");


        s1.setKey(0 ,0000);
        s2.setKey(0 ,1111);
        s3.setKey(0 ,2222);
        s4.setKey(0 ,3333);
        s1.lock(0000);
        s2.lock(1111);
        s3.lock(2222);
        s4.lock(3333);

        s2.unlock(1111);
        s4.unlock(1234); //incorrect key



        if (s1.locked() == true){
            System.out.println("Slogan 1 is not locked");
        }
        else{
            System.out.println("Slogan 1 is locked");
        }
        System.out.println("Slogan 1 : "+s1.toString(s1));
        System.out.println("Slogan 2 : "+s2.toString(s2));
        System.out.println("Slogan 3 : "+s3.toString(s3));
        System.out.println("Slogan 4 : "+s4.toString(s4));
        System.out.println("There are " + Slogan.getCount() + " instances of the slogan");
    }
}



