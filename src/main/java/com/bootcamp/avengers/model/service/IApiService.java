package com.bootcamp.avengers.model.service;

import com.bootcamp.avengers.model.entity.Preference;
import io.reactivex.Completable;
import io.reactivex.Observable;

import java.util.List;

public interface IApiService {

    Observable<List<Preference>> getAllPreferences();

    Completable savePreference(Preference preference);
    
    Observable<List<Preference>> getAllPreferencesByCategory(Long idCategory);
}
