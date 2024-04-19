
package co.edu.uniquindio.Modelos.documentos;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "calificaciones")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Calificacion {
    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private String id;

    private Long comentarioId;

    private int valor;

    public Calificacion(String codigo, String id, Long comentarioId, int valor) {
        this.codigo = codigo;
        this.id = id;
        this.comentarioId = comentarioId;
        this.valor = valor;
    }
}