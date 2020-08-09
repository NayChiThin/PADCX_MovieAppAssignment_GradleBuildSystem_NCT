package com.padcmyanmar.androidftc.padcx_movieappassignment_nct.mvp.views

import com.padcmyanmar.androidftc.padcx_movieappassignment_nct.data.vos.VideoDetailVO
import com.padcmyanmar.androidftc.shared.mvp.views.BaseView

interface VideoPlayView : BaseView {
    fun displayVideo(video:VideoDetailVO)
}