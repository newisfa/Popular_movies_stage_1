package abdiaziz.popular_movies.ui.movie_details;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import abdiaziz.popular_movies.R;
/**
 * Created by hp on 5/27/2017.
 */
public class DetailsActivity extends AppCompatActivity {

    Bundle params;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DetailsFragment fragment=new DetailsFragment();
        Fragment detailsFragment=getFragmentManager().findFragmentByTag("details");
        if (detailsFragment==null) {
            params=getIntent().getExtras();
            fragment.setArguments(params);

            getFragmentManager().beginTransaction().add(R.id.container,fragment,"details").commit();
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
        }
        return (super.onOptionsItemSelected(item));
    }


}
