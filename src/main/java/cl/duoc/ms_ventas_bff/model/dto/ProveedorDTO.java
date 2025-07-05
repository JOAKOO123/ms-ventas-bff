package cl.duoc.ms_ventas_bff.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(description = "Representa un proveedor de perfumes en Perfulandia.")
public class ProveedorDTO {

    @Schema(description = "ID único del proveedor", example = "10")
    private Integer idProveedor;

    @Schema(description = "Nombre de la empresa o proveedor", example = "Essence Group")
    private String nombre;

    @Schema(description = "Correo electrónico del proveedor", example = "contacto@essencegroup.cl")
    private String email;

    @Schema(description = "Número de contacto del proveedor", example = "+56 9 1234 5678")
    private String telefono;
}
