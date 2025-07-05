package cl.duoc.ms_ventas_bff.model.dto;

import java.math.BigDecimal;
import java.util.List;
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
@Schema(description = "Representa un pedido realizado por un cliente en Perfulandia.")
public class PedidoDTO {

    @Schema(description = "ID único del pedido", example = "101")
    private Long id_pedido;

    @Schema(description = "ID del cliente que realizó el pedido", example = "500")
    private Long cliente_id;

    @Schema(description = "Información del cliente que realizó el pedido")
    private ClienteDTO cliente;

    @Schema(description = "Fecha del pedido en formato ISO", example = "2025-07-05T14:30:00")
    private String fecha;

    @Schema(description = "Estado actual del pedido", example = "PENDIENTE")
    private String estado;

    @Schema(description = "Total del pedido en pesos chilenos", example = "39980.00")
    private BigDecimal total;

    @Schema(description = "ID del descuento aplicado al pedido (si existe)", example = "2", nullable = true)
    private Integer descuento_id;

    @Schema(description = "Lista de detalles del pedido (perfumes seleccionados)")
    private List<DetallePedidoDTO> detalles;
}
