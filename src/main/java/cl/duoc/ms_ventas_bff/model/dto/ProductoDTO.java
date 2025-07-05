package cl.duoc.ms_ventas_bff.model.dto;

import java.math.BigDecimal;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(description = "Representa un perfume disponible en el catálogo de Perfulandia.")
public class ProductoDTO {

    @Schema(description = "ID único del perfume", example = "1001")
    private Long idProducto;

    @Schema(description = "Nombre del perfume", example = "Euphoria Men")
    private String nombre;

    @Schema(description = "Descripción detallada del perfume", example = "Fragancia amaderada con toques cítricos.")
    private String descripcion;

    @Schema(description = "Precio de venta del perfume en CLP", example = "25990.00")
    private BigDecimal precio;

    @Schema(description = "Stock disponible del perfume", example = "45")
    private Integer stock;

    @Schema(description = "Información del proveedor del perfume")
    private ProveedorDTO proveedor;

}
