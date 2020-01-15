package com.rjdeleon.hellodagger

import dagger.Module
import dagger.Provides

@Module
/*
This @Module is used just like a bag,
used to store a repository of provided object for Injection.
So I’m going to store my Info provider in it, like below.

The class Bag is annotated with @Module,
and that tells Dagger 2 this is where we stores the @Provides functions within.
 */
class Bag {

    @Provides
            /*
            In other Tutorials, they usually will name the function as provides<ClassName>(),
            i.e. in our case, that would be providesInfo().
            When I scan through the entire tutorial,
            I won’t see the provide function get called anywhere in the code…
            It makes me very confused… screaming “WHERE IS IT CALLED??!!”.
             */
    fun sayLoveDagger2(): Info {
        return Info("Love Dagger 2!")
    }
}