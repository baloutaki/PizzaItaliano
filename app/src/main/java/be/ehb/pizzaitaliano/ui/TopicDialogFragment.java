package be.ehb.pizzaitaliano.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;

public class TopicDialogFragment extends DialogFragment {
    String[] topings = {"Champignon", "Chorizo", "Ansjovis", "Olijven", "Pineapple"};
    ArrayList<String> selectedItems = new ArrayList();


    private DialogInterface.OnMultiChoiceClickListener multiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which, boolean isChecked) {

            if (isChecked) {
                // If the user checked the item, add it to the selected items
                selectedItems.add(topings[which]);
            } else if (selectedItems.contains(which)) {
                // Else, if the item is already in the array, remove it
                selectedItems.remove(topings[which]);
            }
        }
    };
    private DialogInterface.OnClickListener okListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

            Toast.makeText(getActivity(), "You have chosen the next topic's on your pizza: " + selectedItems, Toast.LENGTH_LONG).show();
        }
    };


    @NonNull
        @Override
        public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

            builder.setTitle("choose your topings");
            builder.setMultiChoiceItems(topings, null, multiChoiceClickListener);
            builder.setNegativeButton(android.R.string.cancel, null);
            builder.setPositiveButton(android.R.string.ok, okListener);



            return builder.create();
        }
    }

