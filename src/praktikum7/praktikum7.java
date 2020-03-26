package praktikum7;
import alfianLib.*;
public class praktikum7 {
    public static void main(String[] args) {
        Human hmn = new Human("Budi","yes","no","no","yes","yes");
        hmn.addMerit(10);
        fn.outln("Name: " + hmn.getName());
        fn.outln("State: " + "Have brain? : " + hmn.getIs_have_brain() + ", Have heart? : " + hmn.getIs_have_heart());
        fn.outln("Merit: " + hmn.getMerit());
        fn.out("Sin: " + hmn.getSin());
    }
}
