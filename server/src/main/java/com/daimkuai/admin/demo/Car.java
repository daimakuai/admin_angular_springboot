package com.daimkuai.admin.demo;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Car {
    @Id    @GeneratedValue
    private Long id;
    private @NonNull String name;
}
