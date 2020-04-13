package info.androidhive.camerafileupload.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import info.androidhive.camerafileupload.Model.Patient;
import info.androidhive.camerafileupload.R;

public class PatientAdapter extends ArrayAdapter<Patient> {

    private List<Patient> patientList;
    private Context mCtx;

    public PatientAdapter(List<Patient> P, Context c)
    {
        super(c, R.layout.row_item,P);
        this.patientList = P;
        this.mCtx=c;
    }


    public View getView(int position, View converView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.row_item,null,true);
        TextView nama = (TextView) view.findViewById(R.id.name);
        TextView score = (TextView) view.findViewById(R.id.score);
        TextView time = (TextView) view.findViewById(R.id.time);

        Patient patient = patientList.get(position);
        nama.setText(patient.getNama());
        score.setText(patient.getScore());
        time.setText(patient.getTime());

        return view;
    }
}