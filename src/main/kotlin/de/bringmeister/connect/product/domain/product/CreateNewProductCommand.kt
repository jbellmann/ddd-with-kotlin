package de.bringmeister.connect.product.domain.product

import de.bringmeister.connect.product.domain.Command

data class CreateNewProductCommand(val productNumber: String,
                                  val name: String,
                                  val description: String) : Command
