package cl.duoc.ms_ventas_bff.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.ms_ventas_bff.model.dto.PedidoDTO;

@FeignClient(name = "ms-ventas-bs", url ="http://localhost:8181/api/pedidos")
public interface VentasBsFeignClient {

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDTO > getVentasById(@PathVariable("id") Long id);

    @PostMapping("/pedidos")
    public HttpEntity<PedidoDTO> crearPedido(@RequestBody PedidoDTO pedidoDTO);


}
