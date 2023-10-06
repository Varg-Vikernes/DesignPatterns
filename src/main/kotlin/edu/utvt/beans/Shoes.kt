package edu.utvt.beans

import interfaces.Item

data class Shoes(
    override  var name : String,
    override  var color: Color= Color.BLACK,
    override var department: Department = Department.COMPUTER
)   : Item(name, color, department)
