package com.padcmyanmar.androidftc.padcx_movieappassignment_nct.utils

import com.padcmyanmar.androidftc.padcx_movieappassignment_nct.BuildConfig

// constants
const val BASE_URL = "https://api.themoviedb.org/3/"
const val GET_POPULAR_MOVIES = "movie/popular"
const val GET_GENRES = "genre/movie/list"
const val GET_PERSON = "person/popular"
const val GET_MOVIE_DETAILS = "movie"
const val GET_NOW_PLAYING_MOVIES = "movie/now_playing"
const val GET_MOVIES = "discover/movie"
const val GET_UPCOMING_MOVIES = "movie/upcoming"
const val GET_VIDEOS = "videos"
const val MOVIE_ID_EXTRA = "Movie_id"

// params
const val PARAM_API_KEY = "api_key"
const val DUMMY_API_KEY = BuildConfig.MY_API_KEY.toString()
const val PARAM_GENRE = "with_genres"

// error messages
const val EM_NO_INTERNET_CONNECTION = "No Internet Connection"