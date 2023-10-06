package edu.utvt.beans

fun main(): Unit {
    val shoes = Shoes("Estrella del sur");
    var shopping = ShoppingCart;
    var shopping2 = ShoppingCart;
    var antivirus = Antivirus("Estampita de las estrellas");

    shopping.addItem(shoes);
    println("-----------------")
    shopping2.addItem(antivirus);
}