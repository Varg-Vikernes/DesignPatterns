package edu.utvt.beans.decorator

import interfaces.AmazonItem
import interfaces.Wish

class WishList : Wish{
    private val list= mutableMapOf <String, AmazonItem>()
    override fun get(itemName: String): AmazonItem? {
        return list[itemName];
    }

    override fun set(itemName: String, item: AmazonItem) {
        println("new item has beed added : ${item}");
        list.put(itemName, item);
    }
}