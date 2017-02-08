package liam.base.Demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import liam.base.MvpApp;
import liam.base.R;
import liam.base.di.component.DaggerActivityComponent;
import liam.base.di.module.ActivityModule;

public class Home extends AppCompatActivity {
    private boolean single = false;
    private Fragment fragment;
    private daasddas ee;
    @Inject
    Nghia nghia;

    @OnClick(R.id.btnChange)
    void onClick() {
        if (single) {
            fragment = new Fragment1();
            single = false;
        } else {
            fragment = new Fragment2();
            single = true;
        }
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment, fragment);
        transaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        DaggerActivityComponent.builder().activityModule(new ActivityModule(this)).applicationComponent(MvpApp.get(this).getComponent()).build().inject(this);
        if (nghia == null) {
            Log.i("Nghia", "Nghia Null");
        } else {
            Log.i("Nghia", "Nghia Not null");
        }

        if (nghia.liam == null) {
            Log.i("Nghia", "Liam Null");
        } else {
            Log.i("Nghia", "Liam Not null");
        }
    }
}
