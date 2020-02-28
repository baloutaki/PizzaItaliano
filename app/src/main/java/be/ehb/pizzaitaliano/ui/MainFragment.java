package be.ehb.pizzaitaliano.ui;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import be.ehb.pizzaitaliano.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    private View.OnClickListener sizeListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new SizeDialogFragment().show(getParentFragmentManager(), "fdf");
        }
    };
    private View.OnClickListener topicListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new TopicDialogFragment().show(getParentFragmentManager(), "sdf");
        }
    };
    private View.OnClickListener orderListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Snackbar snackbar = Snackbar.make(rootView.findViewById(R.id.frag_container),
                    "Thanks for your order", Snackbar.LENGTH_INDEFINITE);
            snackbar.setAction("Ok", new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            snackbar.setActionTextColor(Color.CYAN);

            snackbar.show();

        }
    };
    private View rootView;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button btnSize = rootView.findViewById(R.id.btn_size);
        btnSize.setOnClickListener(sizeListener);

        Button btntopic = rootView.findViewById(R.id.btn_topics);
        btntopic.setOnClickListener(topicListener);

        Button btnOrder = rootView.findViewById(R.id.btn_order);
        btnOrder.setOnClickListener(orderListener);

    return  rootView;
    }

}
