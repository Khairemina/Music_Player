// Generated by Dagger (https://dagger.dev).
package com.siddharth_bhat_music_player.music_player.adapters;

import com.bumptech.glide.RequestManager;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SongAdapter_Factory implements Factory<SongAdapter> {
  private final Provider<RequestManager> glideProvider;

  public SongAdapter_Factory(Provider<RequestManager> glideProvider) {
    this.glideProvider = glideProvider;
  }

  @Override
  public SongAdapter get() {
    return newInstance(glideProvider.get());
  }

  public static SongAdapter_Factory create(Provider<RequestManager> glideProvider) {
    return new SongAdapter_Factory(glideProvider);
  }

  public static SongAdapter newInstance(RequestManager glide) {
    return new SongAdapter(glide);
  }
}
