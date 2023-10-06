package edu.utvt.beans.decorator

import interfaces.AmazonItem
import interfaces.Wish

class WishListSetValidation (private val wish: Wish): Wish by wish {
        private val maxItemNameLength = 10;
    override fun set(itemName: String, item: AmazonItem) {
        require(itemName.length < maxItemNameLength){
            "$itemName name is longer than  $maxItemNameLength characters!"
        }
        wish.set(itemName, item);
    }
}