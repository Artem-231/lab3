package character.aborigen;

public record Villager(String name, int age, String role) {

    public String getRole() {
        return role;
    }

    public void introduce() {
        System.out.println("Привет, моё имя " + name + ". Мне " + age + " лет и я работаю " + role + ".");
    }
}
