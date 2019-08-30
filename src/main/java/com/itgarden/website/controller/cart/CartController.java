/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgarden.website.controller.cart;

import com.itgarden.website.model.cart.CartItem;
import com.itgarden.website.ripository.OurproductRepository;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author User
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    OurproductRepository ourproductRepository;

    @RequestMapping(value = {"","/", "/index"})
    public String index(Model model) {

        return "cart/index";
    }

    @RequestMapping("/cart/{prodid}")
    public void Cart(Model model, @PathVariable Long prodid, HttpSession session) {

        if (session.getAttribute("cart") == null) {
            List<CartItem> cart = new ArrayList<CartItem>();
            cart.add(new CartItem(ourproductRepository.getOne(prodid), 1l));
            model.addAttribute("attribute", "value");
            session.setAttribute("cart", cart);
        }
    }

    @RequestMapping("/shipping")
    public String shipping(Model model
    ) {
        return "cart/shipping";
    }

    @RequestMapping("/payment")
    public String payment(Model model
    ) {
        return "cart/payment";

    }

}
