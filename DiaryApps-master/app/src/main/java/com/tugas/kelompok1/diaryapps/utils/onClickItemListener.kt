package com.tugas.kelompok1.diaryapps.utils

import com.tugas.kelompok1.diaryapps.model.ModelNote

/**
 * Created by Azhar Rivaldi on 6/11/2020.
 */

interface onClickItemListener {
    fun onClick(modelNote: ModelNote, position: Int)
}