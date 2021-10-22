package com.djumabaevs.modernfood.data

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject
import dagger.hilt.android.scopes.ViewModelScoped


@ViewModelScoped
class Repository @Inject constructor(
    remoteDataSource: RemoteDataSource,
    localDataSource: LocalDataSource
) {

    val remote = remoteDataSource
    val local = localDataSource

}