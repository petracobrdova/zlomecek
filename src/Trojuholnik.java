public class Trojuholnik
{
    private Bod A;
    private Bod B;
    private Bod C;

    private double getVelkostStrany(char pStrana,Bod pA, Bod pB, Bod pC)
    {
        double velkost = 0;

        switch(pStrana)
        {
            case 'a':
                velkost = pB.getDistance(pC);
                break;
            case 'b':
                velkost = pA.getDistance(pC);
                break;
            case 'c':
                velkost = pA.getDistance(pB);
        }
        return velkost;
    }

    public Trojuholnik(Bod pA, Bod pB, Bod pC)
    {
        double stranaA = getVelkostStrany('a',pA,  pB,  pC);
        double stranaB = getVelkostStrany('b',pA,  pB,  pC);
        double stranaC = getVelkostStrany('c',pA,  pB,  pC);

        if(stranaA + stranaB > stranaC && stranaA + stranaC > stranaB && stranaB + stranaC > stranaA)
        {
            A = pA;
            B = pB;
            C = pC;
            System.out.println("trojuholnik s vrcholmi" + A + " " + B + " " + C + " " + "ok");
        }
        else
        {
            System.out.println("trojuholnik neexistuje");
        }
    }
}