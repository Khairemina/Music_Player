package com.siddharth_and_rashmi_music_player.music_player.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001eH\u0002J\b\u0010 \u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/siddharth_and_rashmi_music_player/music_player/ui/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "mainViewModel", "Lcom/siddharth_and_rashmi_music_player/music_player/ui/viewmodels/MainViewModel;", "getMainViewModel", "()Lcom/siddharth_and_rashmi_music_player/music_player/ui/viewmodels/MainViewModel;", "setMainViewModel", "(Lcom/siddharth_and_rashmi_music_player/music_player/ui/viewmodels/MainViewModel;)V", "songAdapter", "Lcom/siddharth_and_rashmi_music_player/music_player/adapters/SongAdapter;", "getSongAdapter", "()Lcom/siddharth_and_rashmi_music_player/music_player/adapters/SongAdapter;", "setSongAdapter", "(Lcom/siddharth_and_rashmi_music_player/music_player/adapters/SongAdapter;)V", "songs", "", "Lcom/siddharth_and_rashmi_music_player/music_player/data/entities/Song;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "searchInFirestore", "searchText", "", "setupRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "subscribeToObservers", "app_release"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private final com.google.firebase.firestore.FirebaseFirestore firebaseFirestore = null;
    private java.util.List<com.siddharth_and_rashmi_music_player.music_player.data.entities.Song> songs;
    @org.jetbrains.annotations.NotNull()
    public com.siddharth_and_rashmi_music_player.music_player.ui.viewmodels.MainViewModel mainViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siddharth_and_rashmi_music_player.music_player.adapters.SongAdapter songAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.siddharth_and_rashmi_music_player.music_player.ui.viewmodels.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull()
    com.siddharth_and_rashmi_music_player.music_player.ui.viewmodels.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siddharth_and_rashmi_music_player.music_player.adapters.SongAdapter getSongAdapter() {
        return null;
    }
    
    public final void setSongAdapter(@org.jetbrains.annotations.NotNull()
    com.siddharth_and_rashmi_music_player.music_player.adapters.SongAdapter p0) {
    }
    
    private final void searchInFirestore(java.lang.String searchText) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final androidx.recyclerview.widget.RecyclerView setupRecyclerView() {
        return null;
    }
    
    private final void subscribeToObservers() {
    }
    
    public HomeFragment() {
        super();
    }
}