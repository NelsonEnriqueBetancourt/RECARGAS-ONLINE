package SERVICE.WEB.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "RecargaUff")
public class Uff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Telefono")
    private int NumeroPhone;
    @Column(name = "Precio")
    private float ValorRecarga;
    @Column(name = "Nombre_Usuario")
    private String NombreVendedor;
}
