package liam.base.di.component;

import dagger.Component;
import liam.base.Demo.Home;
import liam.base.di.module.ActivityModule;
import liam.base.di.scope.PerActivity;
import liam.base.ui.MainActivity;

/**
 * Created by nghiavo on 2/7/17.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
    void inject(Home home);
}
