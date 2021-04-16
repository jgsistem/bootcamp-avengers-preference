package com.bootcamp.avengers.controllers;

import com.bootcamp.avengers.model.entity.Preference;
import com.bootcamp.avengers.model.service.IApiService;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/preference/v1")
public class ApiController {
    @Autowired
    private IApiService apiService;

    @GetMapping("/")
    public String index() {
        return "bootcamp-avengers-preference api rest";
    }

    @GetMapping("/all")
    public Observable<List<Preference>> getAllPreferences() {
        return apiService.getAllPreferences()
                .subscribeOn(Schedulers.io());
    }

    @PostMapping("/save")
    public Completable savePreference(@RequestBody Preference preference) {
        return apiService.savePreference(preference)
                .subscribeOn(Schedulers.io());
    }

    @GetMapping("/allByCategory/{idCategory}")
    public Observable<List<Preference>> getAllPreferencesByCategory(@PathVariable Long idCategory) {
        return apiService.getAllPreferencesByCategory(idCategory)
                .subscribeOn(Schedulers.io());
    }
}