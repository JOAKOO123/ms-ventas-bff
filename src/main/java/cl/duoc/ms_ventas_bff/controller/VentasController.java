package cl.duoc.ms_ventas_bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.duoc.ms_ventas_bff.model.dto.PedidoDTO;
import cl.duoc.ms_ventas_bff.service.VentasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/bff/sales")
@Tag(name = "Ventas - Perfulandia BFF", description = "Controlador BFF que expone las ventas realizadas en Perfulandia.")
public class VentasController {

    @Autowired
    private VentasService ventasService;

    @Operation(
        summary = "Buscar venta por ID",
        description = "Obtiene la información detallada de un pedido (venta) realizado por un cliente en Perfulandia, según su ID."
    )
    @GetMapping("/{id}")
    public ResponseEntity<PedidoDTO> findSalesById(@PathVariable("id") Long id) {
        PedidoDTO pedidoDTO = ventasService.getVentasById(id);
        return (pedidoDTO != null)
            ? ResponseEntity.ok(pedidoDTO)
            : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
