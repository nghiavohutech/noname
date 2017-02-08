package liam.base.di.component;

import javax.inject.Singleton;

import dagger.Component;
import liam.base.di.module.ApplicationModule;
import liam.base.di.module.ClientModule;

/**
 * Created by nghiavo on 2/7/17.
 */
@Singleton
@Component(modules={ApplicationModule.class, ClientModule.class})
public interface ClientComponent {
}
