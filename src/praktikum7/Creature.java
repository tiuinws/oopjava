package praktikum7;
class Creature {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIs_alive() {
        return is_alive;
    }
    public void setIs_alive(String is_alive) {
        this.is_alive = is_alive;
    }
    public String getIs_hungry() {
        return is_hungry;
    }
    public void setIs_hungry(String is_hungry) {
        this.is_hungry = is_hungry;
    }
    public String getIs_thirsty() {
        return is_thirsty;
    }
    public void setIs_thirsty(String is_thirsty) {
        this.is_thirsty = is_thirsty;
    }
    private String name, is_alive, is_hungry, is_thirsty;
    Creature(String name, String is_alive, String is_hungry, String is_thirsty) {
        this.name = name;
        this.is_alive = is_alive;
        this.is_hungry = is_hungry;
        this.is_thirsty = is_thirsty;
    }
}
