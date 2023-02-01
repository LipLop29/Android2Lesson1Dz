package com.example.android2lesson1dz.ui.iterface

import com.example.android2lesson1dz.data.GeneralModel

interface OnItemTextListener {
    fun onItemClick(model: GeneralModel)
}