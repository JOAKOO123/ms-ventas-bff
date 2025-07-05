package cl.duoc.ms_ventas_bff.model.dto;

import java.math.BigDecimal;

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
@Schema(description = "Detalle de un pedido en Perfulandia, incluyendo el perfume seleccionado, cantidad y precio unitario.")
public class DetallePedidoDTO {

    @Schema(description = "ID único del detalle del pedido", example = "1001")
    private Long id;

    @Schema(description = "ID del pedido asociado", example = "500")
    private Long pedido_id;

    @Schema(description = "ID del producto (perfume) comprado", example = "3001")
    private Long producto_id;

    @Schema(description = "Información completa del producto (perfume)")
    private ProductoDTO producto;

    @Schema(description = "Cantidad solicitada del perfume", example = "2")
    private Integer cantidad;

    @Schema(description = "Precio unitario del perfume en el momento de la compra", example = "19990.00")
    private BigDecimal precio_unitario;
}
