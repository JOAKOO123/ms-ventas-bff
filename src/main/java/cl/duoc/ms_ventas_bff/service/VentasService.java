package cl.duoc.ms_ventas_bff.service;

import org.springframework.beans.factory.annotation.Autowired;

import cl.duoc.ms_ventas_bff.clients.VentasBsFeignClient;
import cl.duoc.ms_ventas_bff.model.dto.PedidoDTO;

public class VentasService {
    
    @Autowired
    VentasBsFeignClient ventasBsFeignClient;

    public PedidoDTO getVentasById(Long id){
        return ventasBsFeignClient.getVentasById(id).getBody();
    }


}
