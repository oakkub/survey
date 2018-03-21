package com.oakkub.survey.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by oakkub on 21/3/2018 AD.
 */
@Module
class AppModule {

    @Provides
    fun provideContext(application: Application): Context = application

}