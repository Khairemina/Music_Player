// Generated by Dagger (https://dagger.dev).
package com.siddharth_bhat_music_player.music_player.ui.viewmodels;

import com.siddharth_bhat_music_player.music_player.exoplayer.MusicServiceConnection;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<MusicServiceConnection> musicServiceConnectionProvider;

  public MainViewModel_Factory(Provider<MusicServiceConnection> musicServiceConnectionProvider) {
    this.musicServiceConnectionProvider = musicServiceConnectionProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(musicServiceConnectionProvider.get());
  }

  public static MainViewModel_Factory create(
      Provider<MusicServiceConnection> musicServiceConnectionProvider) {
    return new MainViewModel_Factory(musicServiceConnectionProvider);
  }

  public static MainViewModel newInstance(MusicServiceConnection musicServiceConnection) {
    return new MainViewModel(musicServiceConnection);
  }
}
