package io.nsy.jcartstoreback.controller;

import io.nsy.jcartstoreback.dto.in.OrderCheckoutInDTO;
import io.nsy.jcartstoreback.dto.out.OrderListOutDTO;
import io.nsy.jcartstoreback.dto.out.OrderShowOutDTO;
import io.nsy.jcartstoreback.dto.out.PageOutDTO;
import io.nsy.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
