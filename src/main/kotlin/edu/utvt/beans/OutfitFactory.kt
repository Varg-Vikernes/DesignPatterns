package edu.utvt.beans

import interfaces.Fashion

object OutfitFactory : Fashion{

    override fun getOutfit(fashionStyles: FashionStyles): Outfit {
        val outfit = when (fashionStyles){
            FashionStyles.PREPPY -> getSportyOutfit()
                else -> getDefaultOutfit()
        }
        return outfit;
    }

    override fun getSportyOutfit() = Outfit (
        Shirt("T-Shirt" , Color.ORANGE),
        Pants("Sports" , Color.PINK),
        Shoes("Tennis", Color.BLUE)
    );

    override fun getDefaultOutfit() = Outfit(
        Shirt("T-shirt", Color.BLUE),
        Pants("Jogger", Color.BLACK),
        Shoes("Shoes" , Color.GREEN)
    );

}