package actividades;

public class Objeto {
    // ATRIBUTOS
    String name;
    short age;
    String color;
    boolean isACat;

    // FUNCIONES
    public void eat(){
        System.out.println("She eats to much");
    }

    public void sleep(){
        System.out.println("She loves to sleep");
    }

    public void givesLove(){
        System.out.println("Is the most loving being in world");
}

    // CONSTRUCTOR

    public Objeto(String name, short age, String color, boolean isACat) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isACat = isACat;
    }


    // GETTER AND SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsACat() {
        return isACat;
    }

    public void setIsACat(boolean isACat) {
        this.isACat = isACat;
    }
}
