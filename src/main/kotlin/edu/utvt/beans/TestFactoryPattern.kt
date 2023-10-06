import edu.utvt.beans.FashionStyles
import edu.utvt.beans.Outfit
import edu.utvt.beans.OutfitFactory


fun main() {
    // Test the OutfitFactory
    val outfitFactory = OutfitFactory

    // Get a sporty outfit
    val sportyOutfit = outfitFactory.getSportyOutfit()
    println("Sporty Outfit:")
    printOutfitDetails(sportyOutfit)

    // Get a default outfit
    val defaultOutfit = outfitFactory.getDefaultOutfit()
    println("Default Outfit:")
    printOutfitDetails(defaultOutfit)

    // Get an outfit based on a fashion style (e.g., PREPPY)
    val preppyOutfit = outfitFactory.getOutfit(FashionStyles.PREPPY)
    println("Preppy Outfit:")
    printOutfitDetails(preppyOutfit)
}

fun printOutfitDetails(outfit: Outfit) {
    println("Shirt: ${outfit.shirt.name}, Color: ${outfit.shirt.color}")
    println("Pants: ${outfit.pants.name}, Color: ${outfit.pants.color}")
    println("Shoes: ${outfit.shoes.name}, Color: ${outfit.shoes.color}")
}
