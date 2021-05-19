// Generated by Dagger (https://dagger.dev).
package com.siddharth_and_rashmi_music_player.music_player.di;

import com.siddharth_and_rashmi_music_player.music_player.data.remote.MusicDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceModule_ProvideMusicDatabaseFactory implements Factory<MusicDatabase> {
  @Override
  public MusicDatabase get() {
    return provideMusicDatabase();
  }

  public static ServiceModule_ProvideMusicDatabaseFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MusicDatabase provideMusicDatabase() {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideMusicDatabase());
  }

  private static final class InstanceHolder {
    private static final ServiceModule_ProvideMusicDatabaseFactory INSTANCE = new ServiceModule_ProvideMusicDatabaseFactory();
  }
}
