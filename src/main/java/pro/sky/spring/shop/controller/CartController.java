package pro.sky.spring.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.spring.shop.service.CartService;

import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class CartController {
    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("ID") Set<Integer> ids) {
        service.add(ids);

    }

    @GetMapping("/get")
    public Set<Integer> get() {
        return service.get();
    }

}
