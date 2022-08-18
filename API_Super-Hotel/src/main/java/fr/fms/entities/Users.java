/**
 *
 */
package fr.fms.entities;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sarah Lefort
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    //@Pattern(regexp="/[^@ \\t\\r\\n\\/]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]*+/gm", message="L'email doit être de forme exemple@test.fr.")
    @Email
    private String mail;

    @NotNull
    private String password;

    @NotNull
    private String name;

    @NotNull
    private Boolean active;

    @ManyToMany
    @JoinTable(
            name = "users_role",
            joinColumns = {@JoinColumn(name = "usersId")},
            inverseJoinColumns = {@JoinColumn(name = "roleId")}
    )
    @JsonIgnore
    private List<Role> role;

    @OneToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "users_id")
    private List<Hotel> hotels;

    /**
     * @param id
     * @param password
     */
    public Users(Long id, String mail, String password) {
        this.id = id;
        this.mail = mail;
        this.password = password;
    }

    /**
     * @param id
     * @param mail
     * @param active
     */
    public Users(Long id, String mail, @NotNull Boolean active) {
        this.id = id;
        this.mail = mail;
        this.active = active;
    }

    /**
     * @param id
     * @param mail
     * @param password
     * @param active
     */
    public Users(Long id, @NotNull String mail, @NotNull String password, @NotNull Boolean active) {
        this.id = id;
        this.mail = mail;
        this.password = password;
        this.active = active;
    }

    /**
     * @param mail
     * @param password
     * @param active
     */
    public Users(@NotNull String mail, @NotNull String password, @NotNull Boolean active) {
        this.mail = mail;
        this.password = password;
        this.active = active;
    }

    public Users(Long id, String mail, String password, String name, Boolean active) {
        this.id = id;
        this.mail = mail;
        this.password = password;
        this.name = name;
        this.active = active;
    }

}
