package com.siddharth_and_rashmi_music_player.music_player.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\"\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0012\u0010\'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020 H\u0002J\b\u00102\u001a\u00020 H\u0002J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\nH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00066"}, d2 = {"Lcom/siddharth_and_rashmi_music_player/music_player/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btn_search", "Landroid/widget/ImageButton;", "getBtn_search", "()Landroid/widget/ImageButton;", "setBtn_search", "(Landroid/widget/ImageButton;)V", "curPlayingSong", "Lcom/siddharth_and_rashmi_music_player/music_player/data/entities/Song;", "glide", "Lcom/bumptech/glide/RequestManager;", "getGlide", "()Lcom/bumptech/glide/RequestManager;", "setGlide", "(Lcom/bumptech/glide/RequestManager;)V", "mainViewModel", "Lcom/siddharth_and_rashmi_music_player/music_player/ui/viewmodels/MainViewModel;", "getMainViewModel", "()Lcom/siddharth_and_rashmi_music_player/music_player/ui/viewmodels/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "playBackState", "Landroid/support/v4/media/session/PlaybackStateCompat;", "swipeSongAdapter", "Lcom/siddharth_and_rashmi_music_player/music_player/adapters/SwipeSongAdapter;", "getSwipeSongAdapter", "()Lcom/siddharth_and_rashmi_music_player/music_player/adapters/SwipeSongAdapter;", "setSwipeSongAdapter", "(Lcom/siddharth_and_rashmi_music_player/music_player/adapters/SwipeSongAdapter;)V", "hideBottomBar", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "showBottomBar", "subscribeToObservers", "switchViewPagerToCurrentSong", "song", "Companion", "app_release"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageButton btn_search;
    private final kotlin.Lazy mainViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siddharth_and_rashmi_music_player.music_player.adapters.SwipeSongAdapter swipeSongAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.bumptech.glide.RequestManager glide;
    private com.siddharth_and_rashmi_music_player.music_player.data.entities.Song curPlayingSong;
    private android.support.v4.media.session.PlaybackStateCompat playBackState;
    private static final int REQUEST_CODE_STT = 1;
    public static final com.siddharth_and_rashmi_music_player.music_player.ui.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageButton getBtn_search() {
        return null;
    }
    
    public final void setBtn_search(@org.jetbrains.annotations.NotNull()
    android.widget.ImageButton p0) {
    }
    
    private final com.siddharth_and_rashmi_music_player.music_player.ui.viewmodels.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siddharth_and_rashmi_music_player.music_player.adapters.SwipeSongAdapter getSwipeSongAdapter() {
        return null;
    }
    
    public final void setSwipeSongAdapter(@org.jetbrains.annotations.NotNull()
    com.siddharth_and_rashmi_music_player.music_player.adapters.SwipeSongAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getGlide() {
        return null;
    }
    
    public final void setGlide(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void hideBottomBar() {
    }
    
    private final void showBottomBar() {
    }
    
    private final void switchViewPagerToCurrentSong(com.siddharth_and_rashmi_music_player.music_player.data.entities.Song song) {
    }
    
    private final void subscribeToObservers() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/siddharth_and_rashmi_music_player/music_player/ui/MainActivity$Companion;", "", "()V", "REQUEST_CODE_STT", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}