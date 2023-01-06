package usercomms.joemarini.example.com.usercommunications.Dialogs

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log

import androidx.fragment.app.DialogFragment
import androidx.appcompat.app.AlertDialog

class SimpleDialogFragment : DialogFragment() {
    private val TAG = "AUC_SIMPLE"

    // TODO: Implement an interface to send callback results


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // TODO: Create an AlertDialog.Builder instance
        val builder = AlertDialog.Builder(activity!!)

        // TODO: Set dialog properties
        builder.setTitle("Peas preference")
        builder.setMessage("Do you like sugar snap peas?")
        builder.setPositiveButton("Sure!") { dialog, which ->
            Log.i(TAG, "positive button was clicked")
        }
        builder.setNegativeButton("No way!") { dialog, which ->
            Log.i(TAG, "negative button was clicked")
        }
        builder.setNeutralButton("Not sure") { dialog, which ->
            Log.i(TAG, "neutral button was clicked")
        }
        // TODO: return the created dialog
        return builder.create()
    }

    // TODO: override onCancel to listen for dialog cancel
    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        Log.i(TAG, "Dialog canceled")
    }

    // TODO: override onAttach to get the Activity context

}
