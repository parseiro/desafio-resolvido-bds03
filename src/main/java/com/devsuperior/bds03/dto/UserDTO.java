package com.devsuperior.bds03.dto;

import com.devsuperior.bds03.entities.User;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserDTO implements Serializable {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @Email(message = "Favor entrar um email válido")
    private String email;

    @Getter
    Set<RoleDTO> roles = new HashSet<>();

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.email = entity.getEmail();
        this.roles = entity.getRoles()
                .parallelStream()
                .map(RoleDTO::new)
                .collect(Collectors.toSet());
    }
}
