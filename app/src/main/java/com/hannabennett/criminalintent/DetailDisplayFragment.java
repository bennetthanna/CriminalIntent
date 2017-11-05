package com.hannabennett.criminalintent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;


/**
 * Created by HannaBennett on 11/4/17.
 */

public class DetailDisplayFragment extends DialogFragment {

    private static final String ARG_PHOTO_PATH = "photoPath";

    ImageView mDetailDisplay;

    public static DetailDisplayFragment newInstance(String photoPath) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_PHOTO_PATH, photoPath);

        DetailDisplayFragment fragment = new DetailDisplayFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.dialog_photo, null);

        String imagePath = (String) getArguments().getSerializable(ARG_PHOTO_PATH);
        Bitmap bitmap = PictureUtils.getScaledBitmap(imagePath, getActivity());

        mDetailDisplay = (ImageView) v.findViewById(R.id.dialog_photo);
        mDetailDisplay.setImageBitmap(bitmap);

        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
