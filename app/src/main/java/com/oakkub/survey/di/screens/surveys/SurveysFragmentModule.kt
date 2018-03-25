package com.oakkub.survey.di.screens.surveys

import com.oakkub.survey.common.thread.SchedulerProvider
import com.oakkub.survey.data.repository.oauth.OAuthRepository
import com.oakkub.survey.data.repository.surveys.SurveysRepository
import com.oakkub.survey.data.services.oauth.OAuthRequest
import com.oakkub.survey.ui.surveys.SurveysLoadingRequest
import com.oakkub.survey.ui.surveys.SurveysViewModel
import dagger.Module
import dagger.Provides

/**
 * Created by oakkub on 25/3/2018 AD.
 */
@Module
class SurveysFragmentModule {

    @Provides
    fun provideSurveysLoadingRequest(): SurveysLoadingRequest = SurveysLoadingRequest(1, 10)

    @Provides
    fun provideSurveysViewModel(
            oAuthRepository: OAuthRepository,
            surveysRepository: SurveysRepository,
            schedulerProvider: SchedulerProvider,
            oAuthRequest: OAuthRequest,
            surveysLoadingRequest: SurveysLoadingRequest
    ): SurveysViewModel = SurveysViewModel(oAuthRepository, surveysRepository, schedulerProvider, oAuthRequest, surveysLoadingRequest)

}