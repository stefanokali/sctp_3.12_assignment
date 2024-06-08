package com.skillsunion.shoppingcartapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



/*
    Assignment:
    - Apply @RestController to the class.
    - Apply @GetMapping and @PostMapping to the methods.
    - Apply @PathVariable to the method parameter of get(int).

    Test:
    - Use a client HTTP Tool like YARC to consume the API you have just created.
    E.g. https://chrome.google.com/webstore/detail/yet-another-rest-client/ehafadccdcdedbhcbddihehiodgcddpl?hl=en
*/

@RestController
@RequestMapping("/carts")
public class CartController {
    
    @GetMapping("")
    public String getCarts() {
        return list();
    }

    @GetMapping("/{id}")
    public String getOneCart(@PathVariable int id) {
        return get(id);
    }

    @PostMapping("")
    public String postCarts() {
        return create();
    }
    
    
    
    
    public String list(){
        return "GET /carts ok";
    }

    public String get(int id){
        return "GET /carts/"+id+" ok";
    }

    public String create(){
        return "POST /carts ok";
    }
}
