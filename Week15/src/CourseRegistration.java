
public class CourseRegistration {
    
    public static void main(String[] args) {

        String lastName = "Sparks";
        String firstName = "Tyler";
        String officeNumber = "KT72";

        String lastName1 = "Me";
        String firstName1 = "Me";
        String officeNumber1 = "Last Name You First Name Me";
        
        Instructor tSparks = new Instructor(lastName,firstName,officeNumber);
        TextBook tb = new TextBook("Advanced Aerospace Engineering Vol. 7", "George Lucas", "Penguin Random House");
        Course eng15200 = new Course("Intro to Cooking I",tSparks,tb);
        String tString = eng15200.toString();

        Instructor HenryCavil = new Instructor(tSparks);
        TextBook tb1 = new TextBook(tb);
        Course HIS99999 = new Course("Intro to Cooking I",HenryCavil,tb1);
        String tString2 = HIS99999.toString();

        System.out.println(tString);
        System.out.println(tString2);

        System.out.println(eng15200.equals(HIS99999));
    }
}
