public class SloganClient {
    public static void main(String[] args){
        Slogan s1 = new Slogan("Im lovin it");
        Slogan s2 = new Slogan("Eat fresh");
        Slogan s3 = new Slogan("Just Do it");
        Slogan s4 = new Slogan("Its finger lickin good");

        System.out.println("Slogan 1 : "+s1.toString());
        System.out.println("Slogan 2 : "+s2.toString());
        System.out.println("Slogan 3 : "+s3.toString());
        System.out.println("Slogan 4 : "+s4.toString());
        System.out.println("There are " + Slogan.getCount() + " instances of the slogan");
    }
}



