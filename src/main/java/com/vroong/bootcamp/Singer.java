package com.vroong.bootcamp;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "singers")
@Getter
@EqualsAndHashCode(of = {"id"})
@ToString(of = {"id", "name"})
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
