import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.*;



public class Main extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("COSI_lab1");

        final LineChart<Number, Number> chart = new LineChart<>(new NumberAxis(/*-2 * Math.PI, 2 * Math.PI, Math.PI / 4*/), new NumberAxis());
        chart.setTitle("Base function");
        chart.setLegendVisible(false);

        XYChart.Series series = new XYChart.Series();

        ObservableList<XYChart.Data> data = FXCollections.observableArrayList();

        for(int i = 0; i < 8; i++)
        {
            data.add(new XYChart.Data(2 *i * (Math.PI / 8), Math.cos(2 * i * (Math.PI / 8)) + Math.sin(2 * i * (Math.PI / 8))));
        }

        series.setData(data);

        Scene scene = new Scene(chart, 500, 400);

        chart.getData().add(series);
        chart.setCreateSymbols(false);

        stage.setScene(scene);
        stage.show();
    }
}
