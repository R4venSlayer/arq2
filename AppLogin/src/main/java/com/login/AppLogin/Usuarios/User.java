package com.login.AppLogin.Usuarios;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="Usuarios")

public class User {
    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private String apellido;

    @Id
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String contraseña;


}
