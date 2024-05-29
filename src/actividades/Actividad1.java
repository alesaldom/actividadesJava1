package actividades;

public class Actividad1 {
    public static void main(String[] args) {
        // CREAR LA INSTANCIA DEL OBJETO
        Objeto objeto = new Objeto("Nicolasa", (short) 11, "Negra con blanco", true);

        // LLAMAR AL OBJETO CON GET
        objeto.getName();
        objeto.getColor();
        objeto.getAge();
        objeto.getIsACat();

        System.out.println(objeto.name + " es " + objeto.color + " tiene " + objeto.age + " años. Es un gato? " + objeto.isACat);

        // CREAR OTRAS INSTANCIAS DEL OBJETO CON SET
        objeto.setName("Dopamina");
        objeto.setColor("Naranja");
        objeto.setIsACat(true);
        System.out.println(objeto.name + " es " + objeto.color + " Es un gato? " + objeto.isACat);

        objeto.setName("Nutella");
        objeto.setColor("café");
        objeto.setIsACat(false);
        System.out.println(objeto.name + " es " + objeto.color + " Es un gato? " + objeto.isACat);
    }
}
