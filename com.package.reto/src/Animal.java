public class Animal {
    private String nombre;
    private String especie;
    private String onomatopeya;

    public Animal(String nombre, String especie, String onomatopeya) {
        this.nombre = nombre;
        this.especie = especie;
        this.onomatopeya = onomatopeya;
    }

    public String getOnomatopeya() {
        return onomatopeya;
    }

    public void setOnomatopeya(String onomatopeya) {
        this.onomatopeya = onomatopeya;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
