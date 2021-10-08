package com.devsuperior.bds03.dto;

import com.devsuperior.bds03.services.validation.UserInsertValid;
import lombok.Getter;
import lombok.Setter;

@UserInsertValid
public class UserInsertDTO extends UserDTO {
    @Getter @Setter
    private String password;

    public UserInsertDTO() {
        super();
    }
}
