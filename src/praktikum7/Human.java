package praktikum7;
public class Human extends Creature {
    private String is_have_brain, is_have_heart;
    private double sin, merit;
    Human(String name, String is_alive, String is_hungry, String is_thirsty, String is_have_brain, String is_have_heart) {
        super(name, is_alive, is_hungry, is_thirsty);
        this.is_have_brain = is_have_brain;
        this.is_have_heart = is_have_heart;
    }
    public String getIs_have_brain() {
        return is_have_brain;
    }
    public void setIs_have_brain(String is_have_brain) {
        this.is_have_brain = is_have_brain;
    }
    public String getIs_have_heart() {
        return is_have_heart;
    }
    public void setIs_have_heart(String is_have_heart) {
        this.is_have_heart = is_have_heart;
    }
    public double getSin() {
        return sin;
    }
    public void setSin(double sin) {
        this.sin = sin;
    }
    public double getMerit() {
        return merit;
    }
    public void setMerit(double merit) {
        this.merit = merit;
    }
    public void addMerit(double merit) {
        this.merit += merit;
    }
    public void reduceMerit(double merit) {
        this.merit -= merit;
    }
    public void addSin(double sin) {
        this.sin += sin;
    }
    public void reduceSin(double sin) {
        this.merit += sin;
    }
    String[] state() {
        return new String[]{"","x"};
    }
    @Override // fucking override eh? fuck you parent Creature.
    public String getName() {
        return "Shit"; // here is fucking side effect, who knows it's changed to Shit?
    }
}
