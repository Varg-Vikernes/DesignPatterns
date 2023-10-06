package interfaces

import edu.utvt.beans.Color
import edu.utvt.beans.Department

abstract class Item(open var name: String, open var color: Color, open var department: Department):
    AmazonItem

abstract class Shirt(open var name: String, open var color: Color, open var department: Department):
        AmazonItem

abstract class Pants(open var name: String, open var color: Color, open var department: Department):
    AmazonItem