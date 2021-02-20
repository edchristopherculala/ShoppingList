package com.culala.shoppinglist.ui.shoppinglist

import com.culala.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}