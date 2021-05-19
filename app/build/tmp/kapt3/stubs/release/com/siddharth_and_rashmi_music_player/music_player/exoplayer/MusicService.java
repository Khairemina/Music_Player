package com.siddharth_and_rashmi_music_player.music_player.exoplayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002CDB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J$\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J$\u00105\u001a\u00020+2\u0006\u00106\u001a\u0002002\u0012\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0908H\u0016J\u0012\u0010;\u001a\u00020+2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J(\u0010>\u001a\u00020+2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040@2\b\u0010A\u001a\u0004\u0018\u00010\u00042\u0006\u0010B\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/MusicService;", "Landroidx/media/MediaBrowserServiceCompat;", "()V", "curPlayingSong", "Landroid/support/v4/media/MediaMetadataCompat;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;", "getDataSourceFactory", "()Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;", "setDataSourceFactory", "(Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;)V", "exoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "getExoPlayer", "()Lcom/google/android/exoplayer2/SimpleExoPlayer;", "setExoPlayer", "(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V", "firebaseMusicSource", "Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/FirebaseMusicSource;", "", "getFirebaseMusicSource", "()Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/FirebaseMusicSource;", "setFirebaseMusicSource", "(Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/FirebaseMusicSource;)V", "isForegroundService", "", "()Z", "setForegroundService", "(Z)V", "isPlayerInitialized", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "mediaSessionConnector", "Lcom/google/android/exoplayer2/ext/mediasession/MediaSessionConnector;", "musicNotificationManager", "Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/MusicNotificationManager;", "musicPlayerEventListener", "Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/callbacks/MusicPlayerEventListener;", "serviceJob", "Lkotlinx/coroutines/CompletableJob;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "onCreate", "", "onDestroy", "onGetRoot", "Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;", "clientPackageName", "", "clientUid", "", "rootHints", "Landroid/os/Bundle;", "onLoadChildren", "parentId", "result", "Landroidx/media/MediaBrowserServiceCompat$Result;", "", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "onTaskRemoved", "rootIntent", "Landroid/content/Intent;", "preparePlayer", "songs", "", "itemToPlay", "playNow", "Companion", "MusicQueueNavigator", "app_release"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MusicService extends androidx.media.MediaBrowserServiceCompat {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.android.exoplayer2.upstream.DefaultDataSourceFactory dataSourceFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.android.exoplayer2.SimpleExoPlayer exoPlayer;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.siddharth_and_rashmi_music_player.music_player.exoplayer.FirebaseMusicSource<java.lang.Object> firebaseMusicSource;
    private com.siddharth_and_rashmi_music_player.music_player.exoplayer.MusicNotificationManager musicNotificationManager;
    private final kotlinx.coroutines.CompletableJob serviceJob = null;
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    private android.support.v4.media.session.MediaSessionCompat mediaSession;
    private com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector mediaSessionConnector;
    private boolean isForegroundService = false;
    private android.support.v4.media.MediaMetadataCompat curPlayingSong;
    private boolean isPlayerInitialized = false;
    private com.siddharth_and_rashmi_music_player.music_player.exoplayer.callbacks.MusicPlayerEventListener musicPlayerEventListener;
    private static long curSongDuration = 0L;
    public static final com.siddharth_and_rashmi_music_player.music_player.exoplayer.MusicService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.exoplayer2.upstream.DefaultDataSourceFactory getDataSourceFactory() {
        return null;
    }
    
    public final void setDataSourceFactory(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.upstream.DefaultDataSourceFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.exoplayer2.SimpleExoPlayer getExoPlayer() {
        return null;
    }
    
    public final void setExoPlayer(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.SimpleExoPlayer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siddharth_and_rashmi_music_player.music_player.exoplayer.FirebaseMusicSource<java.lang.Object> getFirebaseMusicSource() {
        return null;
    }
    
    public final void setFirebaseMusicSource(@org.jetbrains.annotations.NotNull()
    com.siddharth_and_rashmi_music_player.music_player.exoplayer.FirebaseMusicSource<java.lang.Object> p0) {
    }
    
    public final boolean isForegroundService() {
        return false;
    }
    
    public final void setForegroundService(boolean p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void preparePlayer(java.util.List<android.support.v4.media.MediaMetadataCompat> songs, android.support.v4.media.MediaMetadataCompat itemToPlay, boolean playNow) {
    }
    
    @java.lang.Override()
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable()
    android.content.Intent rootIntent) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.media.MediaBrowserServiceCompat.BrowserRoot onGetRoot(@org.jetbrains.annotations.NotNull()
    java.lang.String clientPackageName, int clientUid, @org.jetbrains.annotations.Nullable()
    android.os.Bundle rootHints) {
        return null;
    }
    
    @java.lang.Override()
    public void onLoadChildren(@org.jetbrains.annotations.NotNull()
    java.lang.String parentId, @org.jetbrains.annotations.NotNull()
    androidx.media.MediaBrowserServiceCompat.Result<java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem>> result) {
    }
    
    public MusicService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/MusicService$MusicQueueNavigator;", "Lcom/google/android/exoplayer2/ext/mediasession/TimelineQueueNavigator;", "(Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/MusicService;)V", "getMediaDescription", "Landroid/support/v4/media/MediaDescriptionCompat;", "player", "Lcom/google/android/exoplayer2/Player;", "windowIndex", "", "app_release"})
    final class MusicQueueNavigator extends com.google.android.exoplayer2.ext.mediasession.TimelineQueueNavigator {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.support.v4.media.MediaDescriptionCompat getMediaDescription(@org.jetbrains.annotations.NotNull()
        com.google.android.exoplayer2.Player player, int windowIndex) {
            return null;
        }
        
        public MusicQueueNavigator() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/MusicService$Companion;", "", "()V", "<set-?>", "", "curSongDuration", "getCurSongDuration", "()J", "setCurSongDuration", "(J)V", "app_release"})
    public static final class Companion {
        
        public final long getCurSongDuration() {
            return 0L;
        }
        
        private final void setCurSongDuration(long p0) {
        }
        
        private Companion() {
            super();
        }
    }
}