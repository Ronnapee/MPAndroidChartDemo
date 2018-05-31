package solution.devdd.mpandroidchartdemo;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import solution.devdd.mpandroidchartdemo.Model.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart chart = (PieChart) findViewById(R.id.pie_chart);

        final ArrayList<Student> listStudent = Student.getSampleStudentData(5);

        ArrayList<PieEntry> entries = new ArrayList<>();
        for (Student student : listStudent) {
            entries.add(new PieEntry(student.getScore(), student.getName()));
        }

        PieDataSet dataset = new PieDataSet(entries, "Student");
        dataset.setSelectionShift(10);
        dataset.setValueTextSize(14);
        dataset.setColors(ColorTemplate.MATERIAL_COLORS);

        PieData data = new PieData(dataset);

        chart.setData(data);

        chart.setHoleRadius(30);
        chart.setTransparentCircleRadius(40);
    }
}
