package com.lpu.multithreading;

public class MultithreadingDemo {

    public static void main(String[] args) {

        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.audioLoading();
        videoPlayer.videoLoading();
        videoPlayer.graphics();
        videoPlayer.videoPause();

    }
}

class VideoPlayer{

    void videoLoading(){
        for (int i=0;i<30;i++){
            System.out.println("Video Loading....");
        }
    }

    void audioLoading(){
        System.out.println("Audio Loading....");
    }

    void graphics(){
        System.out.println("Graphics....");
    }

    void videoPause(){
        System.out.println("Video Pause....");
    }

    void videoResume(){
        System.out.println("Video Resume....");
    }
}
