package com.siddharth_and_rashmi_music_player.music_player.exoplayer.callbacks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J4\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\rH\u0016J\"\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\"\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\"\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/callbacks/MusicPlaybackPreparer;", "Lcom/google/android/exoplayer2/ext/mediasession/MediaSessionConnector$PlaybackPreparer;", "firebaseMusicSource", "Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/FirebaseMusicSource;", "", "playerPrepared", "Lkotlin/Function1;", "Landroid/support/v4/media/MediaMetadataCompat;", "", "(Lcom/siddharth_and_rashmi_music_player/music_player/exoplayer/FirebaseMusicSource;Lkotlin/jvm/functions/Function1;)V", "getSupportedPrepareActions", "", "onCommand", "", "player", "Lcom/google/android/exoplayer2/Player;", "controlDispatcher", "Lcom/google/android/exoplayer2/ControlDispatcher;", "command", "", "extras", "Landroid/os/Bundle;", "cb", "Landroid/os/ResultReceiver;", "onPrepare", "playWhenReady", "onPrepareFromMediaId", "mediaId", "onPrepareFromSearch", "query", "onPrepareFromUri", "uri", "Landroid/net/Uri;", "app_debug"})
public final class MusicPlaybackPreparer implements com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.PlaybackPreparer {
    private final com.siddharth_and_rashmi_music_player.music_player.exoplayer.FirebaseMusicSource<java.lang.Object> firebaseMusicSource = null;
    private final kotlin.jvm.functions.Function1<android.support.v4.media.MediaMetadataCompat, kotlin.Unit> playerPrepared = null;
    
    @java.lang.Override()
    public boolean onCommand(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.Player player, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ControlDispatcher controlDispatcher, @org.jetbrains.annotations.NotNull()
    java.lang.String command, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras, @org.jetbrains.annotations.Nullable()
    android.os.ResultReceiver cb) {
        return false;
    }
    
    @java.lang.Override()
    public long getSupportedPrepareActions() {
        return 0L;
    }
    
    @java.lang.Override()
    public void onPrepare(boolean playWhenReady) {
    }
    
    @java.lang.Override()
    public void onPrepareFromMediaId(@org.jetbrains.annotations.NotNull()
    java.lang.String mediaId, boolean playWhenReady, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPrepareFromSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String query, boolean playWhenReady, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onPrepareFromUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, boolean playWhenReady, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    public MusicPlaybackPreparer(@org.jetbrains.annotations.NotNull()
    com.siddharth_and_rashmi_music_player.music_player.exoplayer.FirebaseMusicSource<java.lang.Object> firebaseMusicSource, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.support.v4.media.MediaMetadataCompat, kotlin.Unit> playerPrepared) {
        super();
    }
}