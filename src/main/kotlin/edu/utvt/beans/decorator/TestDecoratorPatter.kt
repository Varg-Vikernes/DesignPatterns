package edu.utvt.beans.decorator

import edu.utvt.beans.Color
import interfaces.Shirt

fun main(): Unit {
    var wishList = WishList();
    var wishListGet = WishListGet(wishList);
    var wishListSetValidation = WishListSetValidation(wishList);

    val shirt = edu.utvt.beans.Shirt("T-Shirt", Color.GREEN);
    val shirt2 = edu.utvt.beans.Shirt("T-Shirt2", Color.BLACK);
    val shirt3 = edu.utvt.beans.Shirt("T-Shirtaaaaa", Color.PINK);

    wishList.set("T-Shirt", shirt);
    wishListGet.set("T-Shirt", shirt2);

        wishListGet.get("T-Shirt");
        wishListGet.get("T-Shirt");

    wishListSetValidation.set("T-Shirtaaaa", shirt3)
}