package me.mundane.dagger2learning.di.components;

import dagger.Component;
import me.mundane.dagger2learning.activity.SingletonActivity2;
import me.mundane.dagger2learning.di.modules.HttpModule;
import me.mundane.dagger2learning.di.scopes.ActivityScope;

/**
 * Created by mundane on 2018/5/14 上午9:39
 */

@ActivityScope
@Component(modules = HttpModule.class, dependencies = AppComponent.class)
public interface SingletonComponent2 {
    void inject(SingletonActivity2 activity);
}
