package edu.utvt.beans

import interfaces.AmazonItem
import interfaces.Shopping

object ShoppingCart: Shopping {
        val items= mutableListOf<AmazonItem>();
    override fun addItem(item: AmazonItem) {
        this.items.add(item)
    }
}