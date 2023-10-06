package edu.utvt.beans.decorator

import interfaces.AmazonItem
import interfaces.Wish

class WishListGet (private val wish: Wish) : Wish by wish {
    override fun get(itemName: String): AmazonItem? {
        println("we are looking for : $itemName");
        return wish[itemName]
    }
}