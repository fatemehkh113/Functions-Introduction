import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       /* String firstname = s.nextLine();
        String lastname = s.nextLine();
        fullname(firstname,lastname);
        String phon = s.nextLine();
        phonenumber(phon);
         String id = s.nextLine();
         userld(id);
        String information = s.nextLine();
        int shift = s.nextInt();
        informationEncoder(information, shift);
        informationDecoder(information, shift);
        */
       /* String[] array = new String[10];
       for (int i = 0;i<10; i++) {
            array[i]=s.nextLine();
            if(array[i].equals(" ")) {
                i = 9;
            }
            else {
                continue;
            }
        }
        getInterests(array);
       // userFullInformation(firstname,phon,id,array);
*/
    }

    public static void fullname(String firstname, String lastname) {
        String result = firstname.substring(0, 1).toUpperCase() + firstname.substring(1).toLowerCase();
        String re = lastname.substring(0, 1).toUpperCase() + lastname.substring(1).toLowerCase();
        System.out.println("Full name: " + result + " " + re);

    }

    public static void phonenumber(String phone) {
        if (phone.length() < 10) {
            System.out.print("Wrong entry. Try again.");
        } else {
            System.out.print("0" + phone);
        }
    }

    public static void userld(String id) {
        if (id.length() >= 13 || id.length() <= 4) {
            System.out.println("please enter correct");
        } else {
            System.out.println(id);
        }
    }
    public static void getInterests(String[] interests) {
        System.out.print("{");
        for (int i = 0; i < interests.length; i++) {
            System.out.print(interests[i]+ ",");
        }
        System.out.print("}");
    }
    public static void userFullInformation(String fullname,String phonnumber,String userid,String[] interests){
        System.out.println("Hello! My name is "+fullname+". My ID is "+userid+". Here are some of my interests:");
        for(int i=0;;i++){
            System.out.println(i+1+". "+interests[i]);
        }
    }
    public static void informationEncoder(String information, int shift) {
        String s = "";
        int len = information.length();
        for (int i = 0; i < len; i++) {
            if (information.charAt(i) == '.' || information.charAt(i) == ',' || information.charAt(i) == ' ') {
                s += (char) information.charAt(i);
            } else {
                char c = (char) (information.charAt(i) + shift);

                if (c > 'z')
                    s += (char) (information.charAt(i) - (26 - shift));
                else
                    s += (char) (information.charAt(i) + shift);
            }

        }
        System.out.println(s);
    }
    public static void informationDecoder(String information, int shift) {
        String s = " ";
        int c;
        c = information.charAt(0) - shift;
        if ((char) c < 'A') {
            s += (char) (information.charAt(0) - shift + 26);
        }
        for (int i = 1; i < information.length(); i++) {
            if (information.charAt(i) == ',' || information.charAt(i) == ',' || information.charAt(i) == ' ') {
                s += information.charAt(i);
            } else {
                c = information.charAt(i) - shift;
                if ((char) c < 'a') {
                    s += (char) (information.charAt(i) - shift + 26);
                } else {
                    s += (char) (information.charAt(i) - shift);
                }
            }
        }
        System.out.println(s);
    }
}

