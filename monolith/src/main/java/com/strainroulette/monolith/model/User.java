package com.strainroulette.monolith.model;


import jakarta.persistence.Id;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Builder
public class User {

    @Id private String userId;
    private String name;
    private String email;
}
