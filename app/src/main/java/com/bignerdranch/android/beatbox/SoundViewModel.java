package com.bignerdranch.android.beatbox;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

public class SoundViewModel extends AndroidViewModel {
    private MutableLiveData<List<Sound>> sounds = new MutableLiveData<>();
    private BeatBox mBeatBox;

    public SoundViewModel(@NonNull Application application) {
        super(application);
        mBeatBox = new BeatBox(application);
        sounds.setValue(mBeatBox.getSounds());
    }

    public MutableLiveData<List<Sound>> getAllSounds() {
        return sounds;
    }
}
