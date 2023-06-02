package champ.champion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Author {
    
    @Id
    private Long authorId;

    private String name;
    private String language;

     @OneToOne(mappedBy = "author")
     private Engli engli;
     

}
