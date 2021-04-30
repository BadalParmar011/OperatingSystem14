package Operating_System;

/*
 ** author @BadalParmar
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.chart.ui.HorizontalAlignment;
import org.jfree.chart.ui.RectangleEdge;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph extends ApplicationFrame {

    static int[] Order;
    static String[] SeekTime;
    static String title;
    
    public Graph(String title,Object[] Parameters) {
        super(title);
        this.title = title;
        Graph.Order = (int[])Parameters[0];
        Graph.SeekTime = (String[])Parameters[1];
        JPanel chartPanel = createPanel();
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }

    private static CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0;i<Order.length;i++){
            dataset.addValue(Order[i], "Header", SeekTime[i]);
        }
        return dataset;
    }

    private static JFreeChart createChart(CategoryDataset dataset) {

        JFreeChart chart = ChartFactory.createLineChart(
            title +" Graph",
            null,
            "Arm Position",
            dataset,
            PlotOrientation.HORIZONTAL,
            false,
            true,
            false
        );

        TextTitle TotalTime = new TextTitle(
                "Total Seek Time => "+SeekTime[SeekTime.length-1]);
        TotalTime.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
        TotalTime.setPosition(RectangleEdge.BOTTOM);
        TotalTime.setHorizontalAlignment(HorizontalAlignment.CENTER);
        chart.addSubtitle(TotalTime);

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setRangePannable(true);
        plot.setRangeGridlinesVisible(false);
        
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartUtils.applyCurrentTheme(chart);

        LineAndShapeRenderer renderer
                = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setDefaultShapesVisible(true);
        renderer.setDrawOutlines(true);
        renderer.setSeriesPaint(0, Color.blue);
        renderer.setUseFillPaint(true);
        renderer.setDefaultFillPaint(Color.red);
        
        renderer.setSeriesStroke(0, new BasicStroke(5.0f));
        renderer.setSeriesOutlineStroke(0, new BasicStroke(5.0f));
        renderer.setSeriesShape(0, new Ellipse2D.Double(-5.0, -5.0, 10.0, 10.0));
        return chart;
    }

    public static JPanel createPanel() {
        JFreeChart chart = createChart(createDataset());
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        return panel;
    }

}