package liam.base.di.module;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;
import liam.base.Demo.Liam;
import liam.base.Demo.Nghia;
import liam.base.di.scope.ActivityContext;
import liam.base.di.scope.PerActivity;

/**
 * Created by nghiavo on 2/6/17.
 */
@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return activity;
    }

    @Provides
    Activity provideActivity() {
        return activity;
    }

    @Provides
    @PerActivity
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    Liam provideLiam() {
        return new Liam();
    }

    @Provides
    Nghia provideNghia(Liam liam) {
        return new Nghia(liam);
    }

}
