package pe.edu.tecsup.lab03;

public class StudentEntity {
    private Long id;
    private String name;

    // Constructor
    public StudentEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
