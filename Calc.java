import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        char Subject;
        float Maths, Sci, SST, Hin, Eng, IT;
        float Mpercent, Spercent, SSpercent, Hpercent, Epercent, ITpercent;
        float Tpercent;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Welcome to Percentage Calculator v1.1");
        System.out.println(
                "You can find percentage of individual subjects by typing the first letter of the subject and then its marks..... For SST use J and K for IT");
        System.out.println("To find total percentage type @");
        System.out.println("Tell the subject for which you want to find Percentage: ");
        Subject = myObj.next().charAt(0);

        switch (Subject) {
            case 'M':
                System.out.println("Enter the Maths Marks: ");
                Maths = myObj.nextFloat();
                Mpercent = (Maths / 80) * 100;
                System.out.println(Mpercent + "%");
                break;

            case 'S':
                System.out.println("Enter the Science Marks: ");
                Sci = myObj.nextFloat();
                Spercent = (Sci / 80) * 100;
                System.out.println(Spercent + "%");
                break;

            case 'J':
                System.out.println("Enter the SST Marks: ");
                SST = myObj.nextFloat();
                SSpercent = (SST / 80) * 100;
                System.out.println(SSpercent + "%");
                break;

            case 'H':
                System.out.println("Enter the Hindi Marks: ");
                Hin = myObj.nextFloat();
                Hpercent = (Hin / 80) * 100;
                System.out.println(Hpercent + "%");
                break;

            case 'E':
                System.out.println("Enter the English Marks: ");
                Eng = myObj.nextFloat();
                Epercent = (Eng / 80) * 100;
                System.out.println(Epercent + "%");
                break;

            case 'K':
                System.out.println("Enter the Maths Marks: ");
                IT = myObj.nextFloat();
                ITpercent = (IT / 80) * 100;
                System.out.println(ITpercent + "%");
                break;

            case '@':
                System.out.println("Enter the Marks Of all subjects: ");
                System.out.println("Maths: ");
                Maths = myObj.nextFloat();
                System.out.println("Science: ");
                Sci = myObj.nextFloat();
                System.out.println("Hindi: ");
                Hin = myObj.nextFloat();
                System.out.println("English: ");
                Eng = myObj.nextFloat();
                System.out.println("IT: ");
                IT = myObj.nextFloat();

                Tpercent = ((Maths + Sci + Hin + Eng + IT) / 400) * 100;
                System.out.println(Tpercent);
                break;

        }
        myObj.close();
    }

}
