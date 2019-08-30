/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgarden.website.model.cart;

import com.itgarden.website.model.Ourproduct;

/**
 *
 * @author User
 */
public class CartItem {

    private Ourproduct ourproduct;

    private Long quantity;

    public CartItem(Ourproduct ourproduct, Long quantity) {
        this.ourproduct = ourproduct;
        this.quantity = quantity;
    }

    public Ourproduct getOurproduct() {
        return ourproduct;
    }

    public void setOurproduct(Ourproduct ourproduct) {
        this.ourproduct = ourproduct;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    

}
