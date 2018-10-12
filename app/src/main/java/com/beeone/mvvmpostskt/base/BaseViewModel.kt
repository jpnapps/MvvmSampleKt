package com.beeone.mvvmpostskt.base

import android.arch.lifecycle.ViewModel
import com.beeone.mvvmpostskt.injection.component.ViewModelInjector
import com.beeone.mvvmpostskt.injection.module.NetworkModule
import com.beeone.mvvmpostskt.ui.post.PostListViewModel

abstract class BaseViewModel:ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}