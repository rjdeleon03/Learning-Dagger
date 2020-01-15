package com.rjdeleon.hellodagger

import dagger.Component

@Component
interface MagicBox {

    /*
    Note I use poke just to make it different from other tutorial,
    so you know you could name it anything.
    Almost every other example I see, people call it inject.
    In a group project I recommend follow this convention,
    so everyone could understand your code.
     */
    fun poke(app: MainActivity)
}