package usercomms.joemarini.example.com.usercommunications.Dialogs

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View

import androidx.fragment.app.DialogFragment
import androidx.appcompat.app.AlertDialog

import usercomms.joemarini.example.com.usercommunications.R

class CustomDialogFragment : DialogFragment() {
    private val TAG = "AUC_CUSTOM"

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity!!)

        // TODO: Create the custom layout using the LayoutInflater class

        // Build the dialog
        builder.setTitle("Please enter your name")
                .setPositiveButton("OK") { dialog, which -> Log.i(TAG, "OK Clicked") }
                .setNegativeButton("Cancel") { dialog, which -> Log.i(TAG, "Cancel clicked") }

        return builder.create()
    }
}
