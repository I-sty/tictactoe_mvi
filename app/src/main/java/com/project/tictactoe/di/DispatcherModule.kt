package com.project.tictactoe.di

import kotlinx.coroutines.Dispatchers
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
class DispatcherModule {
    @Single
    fun provideDispatcherIO() = Dispatchers.IO
}