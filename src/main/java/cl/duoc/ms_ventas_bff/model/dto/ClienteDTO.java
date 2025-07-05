package cl.duoc.ms_ventas_bff.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Schema(description = "Representa a un cliente de Perfulandia, una tienda especializada en perfumes.")
public class ClienteDTO {

    @Schema(description = "ID único del cliente", example = "101")
    private Long id_cliente;

    @Schema(description = "Nombre completo del cliente", example = "Camila Rojas")
    private String nombre;

    @Schema(description = "Contraseña del cliente para autenticación", example = "mi_contraseña_segura123")
    private String contrasena;

    @Schema(description = "Dirección de despacho del cliente", example = "Av. Las Condes 12345, Santiago")
    private String direccion;

    @Schema(description = "Correo electrónico del cliente", example = "camila.rojas@example.com")
    private String email;

    @Schema(description = "Número telefónico del cliente", example = "+56 9 8765 4321")
    private String telefono;
}
