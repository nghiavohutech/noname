package liam.base.di.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import liam.base.di.scope.ApplicationContext;

/**
 * Created by nghiavo on 2/6/17.
 */
@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }
}
