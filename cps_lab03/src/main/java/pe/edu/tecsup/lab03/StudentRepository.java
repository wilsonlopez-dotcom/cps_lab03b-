package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;

public class StudentRepository {

    public StudentEntity findById(Long id) {
        // Simulación: en un futuro aquí se conectará a la BD
        return new StudentEntity(id, "Emerson Flores", "emerson.flores.q@tecsup.edu.pe");
    }
}
