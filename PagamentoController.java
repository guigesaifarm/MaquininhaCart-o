package com.ecommerce.controller;
 
import org.springframework.web.bind.annotation.*;
 
import java.util.HashMap;
import java.util.Map;
 
@RestController
@RequestMapping("/api/pagamento")
@CrossOrigin
public class PagamentoController {
 
    @PostMapping("/pix")
    public Map<String, String> gerarPix(){
 
        Map<String, String> response = new HashMap<>();
 
        response.put("qrCode", "https://api.qrserver.com/v1/create-qr-code/?size=200x200&data=PIX123456");
 
        response.put("pixCopiaCola", "000201PIXCOPIACOLA123456789");
 
        return response;
    }
}
