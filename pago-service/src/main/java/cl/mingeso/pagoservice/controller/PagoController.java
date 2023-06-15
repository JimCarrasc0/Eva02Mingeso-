package cl.mingeso.pagoservice.controller;

import cl.mingeso.pagoservice.entity.PagoEntity;
import cl.mingeso.pagoservice.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pago")
public class PagoController {
    @Autowired
    PagoService pagoService;

    @GetMapping("/{proveedorId}")
    public ResponseEntity<PagoEntity> getPagoProveedor(@PathVariable("proveedorId") String proveedorId){
        PagoEntity pago= pagoService.calculoPago(proveedorId);
        return ResponseEntity.ok(pago);
    }
}
