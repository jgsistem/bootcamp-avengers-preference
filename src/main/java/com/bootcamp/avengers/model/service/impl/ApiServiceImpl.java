package com.bootcamp.avengers.model.service.impl;

import com.bootcamp.avengers.model.entity.Preference;
import com.bootcamp.avengers.model.repository.PreferenceRepository;
import com.bootcamp.avengers.model.service.IApiService;
import io.reactivex.Completable;
import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements IApiService {

    @Autowired
    private PreferenceRepository preferenceRepository;

    @Override
    public Observable<List<Preference>> getAllPreferences() {
        return Observable.fromArray(preferenceRepository.findAll());
    }

    @Override
    public Completable savePreference(Preference category) {
        return Completable.create(subscriber -> {
            preferenceRepository.save(category);
            subscriber.onComplete();
        });
    }

    @Override
    public Observable<List<Preference>> getAllPreferencesByCategory(Long idCategory) {
        return Observable.fromArray(preferenceRepository.findAllByCategory(idCategory));
    }
}
