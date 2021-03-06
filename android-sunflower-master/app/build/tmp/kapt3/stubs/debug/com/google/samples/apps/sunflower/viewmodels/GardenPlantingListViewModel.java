package com.google.samples.apps.sunflower.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/sunflower/viewmodels/GardenPlantingListViewModel;", "Landroidx/lifecycle/ViewModel;", "gardenPlantingRepository", "Lcom/google/samples/apps/sunflower/data/GardenPlantingRepository;", "(Lcom/google/samples/apps/sunflower/data/GardenPlantingRepository;)V", "gardenPlantings", "Landroidx/lifecycle/LiveData;", "", "Lcom/google/samples/apps/sunflower/data/GardenPlanting;", "getGardenPlantings", "()Landroidx/lifecycle/LiveData;", "plantAndGardenPlantings", "Lcom/google/samples/apps/sunflower/data/PlantAndGardenPlantings;", "getPlantAndGardenPlantings", "app_debug"})
public final class GardenPlantingListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.sunflower.data.GardenPlanting>> gardenPlantings = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.sunflower.data.PlantAndGardenPlantings>> plantAndGardenPlantings = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.sunflower.data.GardenPlanting>> getGardenPlantings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.google.samples.apps.sunflower.data.PlantAndGardenPlantings>> getPlantAndGardenPlantings() {
        return null;
    }
    
    public GardenPlantingListViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.sunflower.data.GardenPlantingRepository gardenPlantingRepository) {
        super();
    }
}