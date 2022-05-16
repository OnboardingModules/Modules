public class first {

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        if (!(isBirthday))
        {
            if (speed <= 60)
                return 0;
            if (speed > 60 && speed <= 80)
                return 1;
            else
                return 2;
        }
        else if (speed <=65)
            return 0;
        else if (speed > 65 && speed <= 85)
            return 1;
        else
            return 2;
    }

    public static void main(String[] args)
    {
        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(65, true));
    }

}
