package be.ehb.pizzaitaliano.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class SizeDialogFragment extends DialogFragment {

    String[] sizes = {"Small", "Medium", "Large"};
    private DialogInterface.OnClickListener itemSelectListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Toast.makeText(getActivity(), "You've chosen  " + sizes[i], Toast.LENGTH_SHORT).show();
        }
    };

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("choose your topics");
        builder.setItems(sizes, itemSelectListener);
        builder.setNegativeButton(android.R.string.cancel, null);


        return builder.create();
    }
}
