package fr.fms.entities;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Sarah Lefort
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hotel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 50, message = "La taille doit être comprise entre 2 et 50 caractères.")
    private String name;

    @NotNull
    @Size(min = 8, max = 13, message = "La taille doit être comprise entre 8 et 13 caractères.")
    private String phone;

    @NotNull
    private String address;

    @Min(0)
    @Max(5)
    private int rating;

    private String img;

    @NotNull
    private int availableRooms;

    @NotNull
    private double lowerPrice;

    @ManyToOne
    private City city;

    @ManyToOne
    private Users users;
}
