package ada.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Corretor {
    @Id
    private String nome;
}
