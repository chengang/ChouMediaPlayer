package com.chou.android.mediaplayerlibrary.controllers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.chou.android.mediaplayerlibrary.VideoPlayerBaseController;

/**
 * 列表样式的VideoPlayerController
 */
public class ListVideoPlayerController extends VideoPlayerBaseController
    implements View.OnClickListener {

    public ListVideoPlayerController(
        @NonNull Context context) {
        super(context);
    }


    @Override public void onClick(View view) {

    }


    @Override protected void onPlayStateChanged(int playState) {

    }


    @Override protected void onPlayModeChanged(int playMode) {

    }


    @Override protected void reset() {

    }


    @Override protected void updateProgress() {

    }


    @Override
    protected void showChangePosition(long duration, int newPositionProgress, boolean isShow) {

    }


    @Override protected void hideChangePosition() {

    }


    @Override protected void showChangeVolume(int newVolumeProgress) {

    }


    @Override protected void hideChangeVolume() {

    }


    @Override protected void showChangeBrightness(int newBrightnessProgress) {

    }


    @Override protected void hideChangeBrightness() {

    }
}
