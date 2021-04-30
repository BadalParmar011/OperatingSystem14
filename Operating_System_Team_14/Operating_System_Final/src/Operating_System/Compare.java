package Operating_System;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;



class node{

    int distance = 0;

    boolean accessed = false;
}

public class Compare extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form GUI
     */
    public int[] array;
    
    public static int fcfs1;
    public static int sstf1;
    public static int scan1 ;
    public static int scan2 ;
    public static int cscan1;
    public static int clook1;
    public static int look1;
    public static int look2;
    
    
    public Compare() {
    	setResizable(false);
    	getContentPane().setBackground(new Color(240, 223, 214));
       initComponents(); 
      
    }   
    
    public Compare(String title){
       super( title ); 
      setContentPane(createDemoPanel( ));
    }

    private void initUI() {

        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel objpnl = new ChartPanel(chart);
        objpnl.setVisible(true);
        objpnl.setPreferredSize(new java.awt.Dimension(plotPanel.getWidth(), plotPanel.getHeight()));

        plotPanel.setViewportView(objpnl);
        
    }
     
    
 
   
    private XYDataset createDataset() {

        int[] x = array;
        int[] y = new int[x.length];

        for (int i = 0; i < y.length; i++) {
            y[i] = i + 1;
        }

//        System.out.println(x);
        var series = new XYSeries("Seek", false);

        for (int j = 0; j < x.length; j++) {
            series.add(x[j], y[j]);
//            System.out.println("X=" + x[j] + "  Y= " + y[j]);

        }
        
        var dataset= new XYSeriesCollection();
        dataset.addSeries(series);

        return dataset;
    }

    private JFreeChart createChart(XYDataset dataset) {

        JFreeChart chart = ChartFactory.createScatterPlot(
                "Disk Scheduling Chart",
                "Time(ms)",
                " ",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();

//        chart.getPlot().setBackgroundPaint(Color.BLUE);
        var renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);

        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(new Color(230,230,250));

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(new Color(230,230,250));

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(new Color(230,230,250));

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle("Disk Scheduling Chart",
                new Font("Cambria", java.awt.Font.BOLD, 18)
        )
        );

        return chart;
    }

    
     
   
   
   private static PieDataset createDataset1( ) {
      DefaultPieDataset dataset1 = new DefaultPieDataset( );
            
             dataset1.setValue( "FCFS" , new Double(fcfs1 ) );  
           dataset1.setValue( "SSTF" , new Double(sstf1 ) );  
            dataset1.setValue( "SCAN-RIGHT" , new Double(scan1 ) );  
             dataset1.setValue( "SCAN-LEFT" , new Double(scan2 ) );  
              dataset1.setValue( "CSCAN" , new Double(cscan1 ) );  
               dataset1.setValue( "CLOOK" , new Double(clook1 ) );  
                dataset1.setValue( "LOOK-RIGHT" , new Double(look1 ) );  
                 dataset1.setValue( "LOOK-LEFT" , new Double(look2 ) );  
   
      return dataset1;         
   }
   
   private static JFreeChart createChart1( PieDataset dataset1 ) {
      JFreeChart chart1 = ChartFactory.createPieChart3D(      
         "Seek Time Comparison Chart",   // chart title 
         dataset1,          // data    
         true,             // include legend   
         true, 
         false);
  //   try {//https://www.pinterest.com/pin/79516749641165970/
    	 //   chart1.setBackgroundImage(ImageIO.read(new URL(
    	     //   "https://th.bing.com/th/id/Rb71ed3e179536fc907517da6e93cc9f1?rik=22czDMmEER%2fSNA&riu=http%3a%2f%2fgetwallpapers.com%2fwallpaper%2ffull%2f0%2f9%2f5%2f1284849-mint-colored-wallpaper-1920x1200-pc.jpg&ehk=drVs3yEMdt3qV0NmaVqGyPmKwrvLCi8831T0ZhukUKY%3d&risl=&pid=ImgRaw")));
   // 	} catch (IOException ex) {
    //	    ex.printStackTrace(System.err);
   // 	}
    	chart1.setBackgroundPaint(new Color(0x7fffff00, true));
      chart1.setBackgroundPaint(new Color(255,222,173));
      chart1.getPlot().setBackgroundPaint(new Color(230,230,250) );
      return chart1;
   }
   
   public static JPanel createDemoPanel( ) {
      JFreeChart chart1 = createChart1(createDataset1( ) );  
      return new ChartPanel( chart1 ); 
   }
    
    
    
    public int[] FCFS(int[] arr) {

        int size = arr.length;
        int seek_count = 0;
        int distance, cur_track;
        int head = Integer.parseInt(InitialHeaderTF.getText());
        //System.out.println(head);

        for (int i = 0; i < size; i++) {
            cur_track = arr[i];

            // calculate absolute distance 
            distance = Math.abs(cur_track - head);

            // increase the total count 
            seek_count += distance;

            // accessed track is now new head 
            head = cur_track;
        }

    
        DefaultTableModel tblModel = (DefaultTableModel) tableDisplay.getModel();
        tblModel.setValueAt(String.valueOf(Arrays.toString(arr)), 0, 1);
        tblModel.setValueAt(InitialHeaderTF.getText(), 0, 2);
        tblModel.setValueAt(String.valueOf(seek_count), 0, 3);
        
        fcfs1=seek_count;
        return arr;
    }

    private int parseInt(Object object) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void calculateDifference(int queue[],
            int head, node diff[]) {
        for (int i = 0; i < diff.length; i++) {
            diff[i].distance = Math.abs(queue[i] - head);
        }
    }


    public static int findMin(node diff[]) {
        int index = -1, minimum = Integer.MAX_VALUE;

        for (int i = 0; i < diff.length; i++) {
            if (!diff[i].accessed && minimum > diff[i].distance) {

                minimum = diff[i].distance;
                index = i;
            }
        }
        
        return index;
    }

    public int[] SSTF(int request[]) {

        int head = Integer.parseInt(InitialHeaderTF.getText().toString());
        int seek_count;
        int[] seek_sequence = new int[request.length + 1];

        {
            if (request.length == 0) {
                return null;
            }

            node diff[] = new node[request.length];

            for (int i = 0; i < diff.length; i++) {
                diff[i] = new node();
            }

            seek_count = 0;

            for (int i = 0; i < request.length; i++) {

                seek_sequence[i] = head;
                calculateDifference(request, head, diff);

                int index = findMin(diff);

                diff[index].accessed = true;

                seek_count += diff[index].distance;

                head = request[index];
            }

            seek_sequence[seek_sequence.length - 1] = head;

          
            DefaultTableModel tblModel = (DefaultTableModel) tableDisplay.getModel();
            tblModel.setValueAt(String.valueOf(Arrays.toString(seek_sequence)), 1, 1);
            tblModel.setValueAt(InitialHeaderTF.getText(), 1, 2);
            tblModel.setValueAt(String.valueOf(seek_count), 1, 3);
        }
        
        sstf1=seek_count;
        return seek_sequence;
    }

    public int[] SCAN(int[] arr, String direction) {
        String given=direction;
        int head = Integer.parseInt(InitialHeaderTF.getText().toString());
        int disk_size = 200;
        int size = arr.length;

        int seek_count = 0;
        int distance, cur_track;
        Vector<Integer> left = new Vector<Integer>(),
                right = new Vector<Integer>();
        Vector<Integer> seek_sequence = new Vector<Integer>();

        if (direction == "left") {
            left.add(0);
        } else if (direction == "right") {
            right.add(disk_size - 1);
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] < head) {
                left.add(arr[i]);
            }
            if (arr[i] > head) {
                right.add(arr[i]);
            }
        }

        Collections.sort(left);
        Collections.sort(right);

    
        int run = 2;
        while (run-- > 0) {
            if (direction == "left") {
                for (int i = left.size() - 1; i >= 0; i--) {
                    cur_track = left.get(i);

                    // appending current track to seek sequence 
                    seek_sequence.add(cur_track);

                    // calculate absolute distance 
                    distance = Math.abs(cur_track - head);

                    // increase the total count 
                    seek_count += distance;

                    // accessed track is now the new head 
                    head = cur_track;
                }
                direction = "right";
             
        
                
            } else if (direction == "right") {
                for (int i = 0; i < right.size(); i++) {
                    cur_track = right.get(i);

              
                    seek_sequence.add(cur_track);

                    distance = Math.abs(cur_track - head);

                    
                    seek_count += distance;

                    head = cur_track;
                }
                direction = "left";
              
               
            }
             
               
        }

        String[] stringArray = new String[seek_sequence.size()];
        for (int i = 0; i < seek_sequence.size(); i++) {
            stringArray[i] = seek_sequence.get(i).toString();
        }
        int[] ar = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            ar[i] = Integer.parseInt(stringArray[i]);
        }
        
        if(given=="right"){
            scan1=seek_count;
                    DefaultTableModel tblModel = (DefaultTableModel) tableDisplay.getModel();
                tblModel.setValueAt(String.valueOf(seek_sequence), 2, 1);
                tblModel.setValueAt(InitialHeaderTF.getText(), 2, 2);
                tblModel.setValueAt(String.valueOf(seek_count),2, 3);
               }
               else if(given=="left"){
                   scan2=seek_count;
                    DefaultTableModel tblModel = (DefaultTableModel) tableDisplay.getModel();
                tblModel.setValueAt(String.valueOf(seek_sequence), 3, 1);
                tblModel.setValueAt(InitialHeaderTF.getText(), 3, 2);
                tblModel.setValueAt(String.valueOf(seek_count),3, 3);
               }
        

        return ar;

    }

    public int[] CSCAN(int[] arr) {
        int head = Integer.parseInt(InitialHeaderTF.getText().toString());
        int disk_size = 200;
        int size = arr.length;
        int seek_count = 0;
        int distance, cur_track;
        Vector<Integer> left = new Vector<Integer>(), right = new Vector<Integer>();
        Vector<Integer> seek_sequence = new Vector<Integer>();

        left.add(0);
        right.add(disk_size - 1);

        for (int i = 0; i < size; i++) {
            if (arr[i] < head) {
                left.add(arr[i]);
            }
            if (arr[i] > head) {
                right.add(arr[i]);
            }
        }

        Collections.sort(left);
        Collections.sort(right);

        for (int i = 0; i < right.size(); i++) {
            cur_track = right.get(i);

            seek_sequence.add(cur_track);

            distance = Math.abs(cur_track - head);

            seek_count += distance;

            head = cur_track;
        }

        head = 0;

        for (int i = left.size() - 1; i >= 0; i--) {
            cur_track = left.get(i);

            seek_sequence.add(cur_track);

            distance = Math.abs(cur_track - head);

            seek_count += distance;

            head = cur_track;
        }

   
        DefaultTableModel tblModel = (DefaultTableModel) tableDisplay.getModel();
        tblModel.setValueAt(String.valueOf(seek_sequence), 4, 1);
        tblModel.setValueAt(InitialHeaderTF.getText(), 4, 2);
        tblModel.setValueAt(String.valueOf(seek_count), 4, 3);


        String[] stringArray = new String[seek_sequence.size()];
        for (int i = 0; i < seek_sequence.size(); i++) {
            stringArray[i] = seek_sequence.get(i).toString();
        }
        int[] ar = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            ar[i] = Integer.parseInt(stringArray[i]);
        }
        
        cscan1=seek_count;
        return ar;
    }
    
    public int[] CLOOK(int[] request){
              int size=request.length;
        int head = Integer.parseInt(InitialHeaderTF.getText().toString());
        
         int seek_count = 0; 
        int distance, cur_track; 
     Vector<Integer> left = new Vector<Integer>(),
                right = new Vector<Integer>();
        Vector<Integer> seek_sequence = new Vector<Integer>();
 
  
   
    for (int i = 0; i < size; i++) { 
        if (request[i] < head) 
            left.add(request[i]); 
        if (request[i] > head) 
            right.add(request[i]); 
    } 
  

    Collections.sort(left);
    Collections.sort(right);
  
  
 
    for (int i = 0; i < right.size(); i++) { 
        cur_track = right.get(i); 
  
      
        seek_sequence.add(cur_track); 
  
     
        distance = abs(cur_track - head); 
  
     
        seek_count += distance; 
  
        head = cur_track; 
    } 
  
   
    seek_count += abs(head - left.get(0)); 
    head=left.get(0);
  
  
    for (int i = 0; i < left.size(); i++) { 

        cur_track = left.get(i); 

        seek_sequence.add(cur_track);
  
        distance = abs(cur_track - head); 
  
        seek_count += distance; 
  
        head = cur_track; 
    } 
    
    String[] stringArray = new String[seek_sequence.size()];
        for (int i = 0; i < seek_sequence.size(); i++) {
            stringArray[i] = seek_sequence.get(i).toString();
        }
        int[] ar = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            ar[i] = Integer.parseInt(stringArray[i]);
        }
       
        clook1=seek_count;

        DefaultTableModel tblModel = (DefaultTableModel) tableDisplay.getModel();
        tblModel.setValueAt(String.valueOf(seek_sequence), 5, 1);
        tblModel.setValueAt(InitialHeaderTF.getText(), 5, 2);
        tblModel.setValueAt(String.valueOf(seek_count),5, 3);
        return ar;
    }
    
    public int[] LOOK(int[] request, String direction){
        
        int size=request.length;
        int head = Integer.parseInt(InitialHeaderTF.getText().toString());
        String given=direction;
        int seek_count = 0;
        int distance, cur_track;
        Vector<Integer> left = new Vector<Integer>(),
        right = new Vector<Integer>();
        Vector<Integer> seek_sequence = new Vector<Integer>();

      
        for (int i = 0; i < size; i++) {
            if (request[i] < head)
            left.add(request[i]);
            if (request[i] > head)
            right.add(request[i]);
        }

        Collections.sort(left);
        Collections.sort(right);

   
    int run = 2; 
    while(run-- > 0) { 
        if (direction == "left") { 
            for (int i = left.size() - 1; i >= 0; i--) { 
                cur_track = left.get(i); 
  
                seek_sequence.add(cur_track); 
  
                distance = abs(cur_track - head); 
  
                seek_count += distance; 
  
                head = cur_track; 
            } 
            direction = "right"; 
        } 
        else if (direction == "right") { 
            for (int i = 0; i < right.size(); i++) { 
                cur_track = right.get(i); 
                seek_sequence.add(cur_track); 
  
                distance = abs(cur_track - head); 
  
                seek_count += distance; 
  
                head = cur_track; 
            } 
            direction = "left"; 
        }
        
    } 
  
        String[] stringArray = new String[seek_sequence.size()];
        for (int i = 0; i < seek_sequence.size(); i++) {
            stringArray[i] = seek_sequence.get(i).toString();
        }
        int[] ar = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            ar[i] = Integer.parseInt(stringArray[i]);
        }
       
      
       if(given=="right"){
             look1=seek_count;
            DefaultTableModel tblModel = (DefaultTableModel) tableDisplay.getModel();
        tblModel.setValueAt(String.valueOf(seek_sequence), 6, 1);
        tblModel.setValueAt(InitialHeaderTF.getText(), 6, 2);
        tblModel.setValueAt(String.valueOf(seek_count), 6, 3);
       }
       else if(given=="left"){
             look2=seek_count;
            DefaultTableModel tblModel = (DefaultTableModel) tableDisplay.getModel();
        tblModel.setValueAt(String.valueOf(seek_sequence), 7, 1);
        tblModel.setValueAt(InitialHeaderTF.getText(), 7, 2);
        tblModel.setValueAt(String.valueOf(seek_count), 7, 3);
       }
        return ar;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(new Color(230, 230, 250));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
        jLabel1.setBounds(10, 95, 106, 14);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
        jLabel3.setBounds(10, 133, 106, 14);
        InitialHeaderTF = new javax.swing.JTextField();
        InitialHeaderTF.setToolTipText("Enter Arm Position (Numberic Values Only!!!)");
        InitialHeaderTF.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
        InitialHeaderTF.setBounds(126, 87, 172, 31);
        QueueTF = new javax.swing.JTextField();
        QueueTF.setToolTipText("Enter Disk Queue (For eg. 34,65,35,67,89,87)");
        QueueTF.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
        QueueTF.setBounds(126, 125, 172, 31);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(10, 11, 444, 31);
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDisplay = new javax.swing.JTable();
        tableDisplay.setBackground(new Color(255, 222, 173));
        tableDisplay.setBorder(null);
        tableDisplay.setFont(new Font("Bookman Old Style", Font.PLAIN, 12));
        jButton2 = new javax.swing.JButton();
        jButton2.setBackground(new Color(244, 164, 96));
        plotPanel = new javax.swing.JScrollPane();
        plotPanel.setBackground(new Color(230, 230, 250));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);


        jLabel1.setText("Arm Position");

        jLabel3.setText("Disk Queue");

        InitialHeaderTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldStartPosActionPerformed(evt);
            }
        });

        QueueTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueueTFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new Font("Bookman Old Style", Font.BOLD, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DISK SCHEDULING ALGORITHMS");

        tableDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"FCFS", null, null, null},
                {"STF", null, null, null},
                {"SCAN(Right)", null, null, null},
                {"SCAN(Left)", null, null, null},
                {"CSCAN", null, null, null},
                {"CLOOK", null, null, null},
                {"LOOK(Right)", null, null, null},
                {"LOOK(Left)", null, null, null}
            },
            new String [] {
                "Algorithm", "Process Order", "Start Position", "Seek time"
            }
        ));
        jScrollPane1.setViewportView(tableDisplay);

        jButton2.setFont(new Font("Bookman Old Style", Font.BOLD, 12)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        plotPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        plotPanel.setToolTipText("");
        plotPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        plotPanel.setEnabled(false);
        submit = new javax.swing.JButton();
        submit.setBackground(new Color(244, 164, 96));
        
                submit.setFont(new Font("Bookman Old Style", Font.BOLD, 12)); // NOI18N
                submit.setText("RUN SIMULATION");
                submit.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        submitActionPerformed(evt);
                    }
                });
        jPanel1.setLayout(null);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel3);
        jPanel1.add(QueueTF);
        jPanel1.add(InitialHeaderTF);
        jPanel1.add(jLabel4);
        jButton1 = new javax.swing.JButton();
        jButton1.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
        jButton1.setBounds(308, 87, 134, 69);
        jPanel1.add(jButton1);
        
                jButton1.setText("AutoGen");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(null);
        panel.setBackground(Color.WHITE);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setToolTipText("Homepage");
        lblNewLabel_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	Firstpage fre = new Firstpage();
        	fre.show();
        	}
        });
        lblNewLabel_1.setIcon(new ImageIcon(Compare.class.getResource("/Images/home.png")));
        lblNewLabel_1.setBackground(Color.GRAY);
        lblNewLabel_1.setBounds(36, 76, 64, 68);
        panel.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setToolTipText("Algorithms");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	GUI frame12 = new GUI();
        	frame12.show();
        	}
        });
        lblNewLabel_2.setIcon(new ImageIcon(Compare.class.getResource("/Images/Algorithms.png")));
        lblNewLabel_2.setBackground(Color.GRAY);
        lblNewLabel_2.setBounds(36, 204, 64, 68);
        panel.add(lblNewLabel_2);
        
        lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setToolTipText("Simulator");
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	Simulation fres = new Simulation();
        	fres.show();
        	}
        });
        lblNewLabel_3.setIcon(new ImageIcon(Compare.class.getResource("/Images/Simulator (2).png")));
        lblNewLabel_3.setBackground(Color.GRAY);
        lblNewLabel_3.setBounds(36, 340, 64, 68);
        panel.add(lblNewLabel_3);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setToolTipText("Quiz");
        lblNewLabel.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
      Quiz2 fre = new Quiz2();
      fre.show();
      
        	}
        });
        lblNewLabel.setIcon(new ImageIcon(Compare.class.getResource("/Images/Quiz.png")));
        lblNewLabel.setBackground(Color.GRAY);
        lblNewLabel.setBounds(36, 470, 64, 68);
        panel.add(lblNewLabel);
        
        lblNewLabel_4 = new JLabel(" ");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setIcon(new ImageIcon(Compare.class.getResource("/Images/Disc.jpeg")));
        lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_4.setForeground(Color.WHITE);
        lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
        lblNewLabel_4.setBackground(new Color(0, 128, 0));
        lblNewLabel_4.setBounds(10, 11, 113, 596);
        panel.add(lblNewLabel_4);
        comboBoxAlgo = new javax.swing.JComboBox<>();
        comboBoxAlgo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
        
                comboBoxAlgo.setModel(new DefaultComboBoxModel(new String[] {"FCFS", "SSTF", "SCAN(Right)", "SCAN(Left)", "CSCAN", "CLOOK", "LOOK(left)", "LOOK(right)"}));
                comboBoxAlgo.setSelectedIndex(0);
                comboBoxAlgo.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        comboBoxAlgoActionPerformed(evt);
                    }
                });
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(10)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
        			.addGap(6)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        						.addComponent(submit, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        						.addComponent(comboBoxAlgo, 0, 184, Short.MAX_VALUE)))
        				.addComponent(plotPanel, GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
        			.addContainerGap())
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(11)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 618, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(comboBoxAlgo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(submit, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)))
        					.addGap(8)
        					.addComponent(plotPanel)))
        			.addContainerGap())
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldStartPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldStartPosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldStartPosActionPerformed

    private void QueueTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueueTFActionPerformed
    
    	
        // TODO add your handling code here:
    }//GEN-LAST:event_QueueTFActionPerformed

    private void comboBoxAlgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAlgoActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_comboBoxAlgoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Random r = new Random();
        int[] random = new int[8];
        for (int i = 0; i < random.length; i++) {
            random[i] = r.nextInt(100 - 1) + 1; // storing random integers in an array
            //System.out.println(random[i]); // printing each array element
        }

        String[] strRandom = new String[random.length];
        for (int i = 0; i < random.length; i++) {
            strRandom[i] = String.valueOf(random[i]);
        }

        String result = "";

        if (strRandom.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (String s : strRandom) {
                sb.append(s).append(",");
            }

            result = sb.deleteCharAt(sb.length() - 1).toString();
        }
        QueueTF.setText(result);

    }//GEN-LAST:event_jButton1ActionPerformed


    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String sector = QueueTF.getText();

        String[] numbers = sector.split(",");

        List<String> SectorString = Arrays.asList(numbers);

        ArrayList<String> SectorNumber = new ArrayList<String>(SectorString);

//				System.out.println("list from comma separated String : " + SectorNumber); 
//				System.out.println("size of ArrayList : " + SectorNumber.size());
        Object[] ArraySector = SectorNumber.toArray();
        int[] request = new int[ArraySector.length];
        for (int i = 0; i < ArraySector.length; i++) {
            request[i] = Integer.valueOf(numbers[i]);
        }
        
      

        if (comboBoxAlgo.getSelectedItem().equals("FCFS")) {
            array = FCFS(request);
            initUI();
            
            SSTF(request);
            SCAN(request, "right");
            SCAN(request, "left");
            CSCAN(request);
            CLOOK(request);
            LOOK(request,"right");
            LOOK(request,"left");

        } else if (comboBoxAlgo.getSelectedItem().equals("SSTF")) {
            FCFS(request);
            array = SSTF(request);
            SCAN(request, "right");
            SCAN(request, "left");
            CSCAN(request);
             CLOOK(request);
             LOOK(request,"right");
            LOOK(request,"left");
            initUI();
 

        } else if (comboBoxAlgo.getSelectedItem().equals("SCAN(Left)")) {
            FCFS(request);
            SSTF(request);
            
            array = SCAN(request, "left");
            LOOK(request,"right");
            LOOK(request,"left");
            CLOOK(request);
            CSCAN(request);
        } else if (comboBoxAlgo.getSelectedItem().equals("SCAN(Right)")) {
            FCFS(request);
            SSTF(request);

            array = SCAN(request, "right");
            CSCAN(request);
            CLOOK(request);
            LOOK(request,"right");
            LOOK(request,"left");
            initUI();
        } else if (comboBoxAlgo.getSelectedItem().equals("CSCAN")) {
            FCFS(request);
            SSTF(request);
            SCAN(request, "right");
            array = CSCAN(request);
            SCAN(request,"left");
            CLOOK(request);
            LOOK(request,"right");
            LOOK(request,"left");
            initUI();
            
        }
        else if (comboBoxAlgo.getSelectedItem().equals("CLOOK")) {
            FCFS(request);
            SSTF(request);
            CSCAN(request);
            SCAN(request, "right");
            SCAN(request,"left");
            array = CLOOK(request);
            LOOK(request,"right");
            LOOK(request,"left");
            initUI();   
        }
        else if (comboBoxAlgo.getSelectedItem().equals("LOOK(left)")) {
            FCFS(request);
            SSTF(request);
             CSCAN(request);
             SCAN(request, "right");
            SCAN(request,"left");
            CLOOK(request);
            LOOK(request,"right");
            array=LOOK(request,"left");
        }
        else if (comboBoxAlgo.getSelectedItem().equals("LOOK(right)")) {
            FCFS(request);
            SSTF(request);
             CSCAN(request);
             SCAN(request, "right");
            SCAN(request,"left");
            CLOOK(request);
            LOOK(request,"left");
            array=LOOK(request,"right");
            initUI();   
        }
        
      Compare demo = new Compare( "Disk Scheduling Algorithms" );  
      demo.setSize( 560 , 367 );    
      RefineryUtilities.centerFrameOnScreen( demo );    
      demo.setVisible( true );


    }//GEN-LAST:event_submitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       GUI frame18 = new GUI();
       frame18.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     * 
     */
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxAlgo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane plotPanel;
    private javax.swing.JButton submit;
    private javax.swing.JTable tableDisplay;
    private javax.swing.JTextField QueueTF;
    private javax.swing.JTextField InitialHeaderTF;
    private JPanel panel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
