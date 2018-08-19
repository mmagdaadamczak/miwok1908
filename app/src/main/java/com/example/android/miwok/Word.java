package com.example.android.miwok;

import android.media.MediaPlayer;
import android.provider.MediaStore;

/**
 * Created by Asus on 30.07.2018.
 */

public class Word {

    /** Default translation for a word*/

    private String mDefaultTranslation;

    /** Default translation for a word*/
    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;






    public Word (String defaultTranslation, String miwokTranslation, int AudioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = AudioResourceId;
    }

    public Word (String defaultTranslation, String miwokTranslation, int ImageResourceId, int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = AudioResourceId;
    }




    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImageResourceId(){return mImageResourceId;}

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

    public int getmAudioResourceId(){return mAudioResourceId;}



}
