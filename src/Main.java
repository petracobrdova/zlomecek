public class Main
{
    public static void main(String[] args)
    {
/*        Zlomok Z1 = new Zlomok(4, 3);
        Zlomok Z2 = new Zlomok(6,5);
        Bod Prvy = new Bod(Z1, Z2);
        Bod Druhy = new Bod();
        System.out.println(Prvy);
        System.out.println(Druhy);
        System.out.println(Prvy.getCenter(Druhy));
        System.out.println(Prvy.getDistance(Druhy));
        System.out.println(Z1);
        System.out.println(Z2);*/

        /*System.out.println(Z1.plus(Z2));
        System.out.println(Z1.plus(3));
        System.out.println(Z1.minus(Z2));
        System.out.println(Z1.krat(Z2));
        System.out.println(Z1.deleno(Z2));
        System.out.printf("%s + %s = %s",Z1,Z2,Z1.plus(Z2));*/

/*        Bod []pole = new Bod[10];
        for(int i = 0; i < 10; ++i)
        {
            pole[i] = new Bod();
            System.out.println(pole[i]);
        }

        double max = pole[0].getDistance(new Bod(new Zlomok(0),new Zlomok(0)));
        int maxIndex = 0;

        for(int i = 1; i < 10; i++)
        {
            if(pole[i].getDistance(new Bod(new Zlomok(0),new Zlomok(0))) > max)
            {
                max = pole[i].getDistance(new Bod(new Zlomok(0),new Zlomok(0)));
                maxIndex = i;
            }
        }
        System.out.println(max + " je " + pole[maxIndex]);*/

        Bod X = new Bod();
        Bod Y = new Bod();
        Bod Z = new Bod();
        Trojuholnik XYZ = new Trojuholnik(X, Y, Z);
        Bod K = new Bod(new Zlomok(1), new Zlomok(1));
        Bod L = new Bod(new Zlomok(3), new Zlomok(3));
        Bod M = new Bod(new Zlomok(6), new Zlomok(6));
        Trojuholnik KLM = new Trojuholnik(K, L, M);
    }
}