package pe.edu.tecsup.lab03.entities;

public class StudentEntity {

    private Long id;
    private String name;
    private String email;

    public StudentEntity(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "StudentEntity{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }
}
