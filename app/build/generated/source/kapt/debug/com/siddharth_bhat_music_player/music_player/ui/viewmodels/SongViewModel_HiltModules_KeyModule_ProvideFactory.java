// Generated by Dagger (https://dagger.dev).
package com.siddharth_bhat_music_player.music_player.ui.viewmodels;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SongViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static SongViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(SongViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final SongViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new SongViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
