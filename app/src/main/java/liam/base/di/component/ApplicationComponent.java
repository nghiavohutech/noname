package liam.base.di.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import liam.base.MvpApp;
import liam.base.di.module.ApplicationModule;
import liam.base.di.scope.ApplicationContext;

/**
 * Created by nghiavo on 2/7/17.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MvpApp app);

    @ApplicationContext
    Context context();

    Application application();
}
