/*
 * SavePanel.java
 *
 * Created on April 3, 2008, 3:55 PM
 */
package org.geoimage.viewer.widget.panels;

import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;

import org.geoimage.common.OptionMenu;
import org.geoimage.viewer.core.api.ISave;
import org.geotools.referencing.CRS;
import org.geoimage.viewer.core.api.ILayer;
import org.geoimage.viewer.core.api.IImageLayer;
import org.geoimage.viewer.core.Platform;
import org.geoimage.viewer.core.layers.vectors.MaskVectorLayer;






/**
 *
 * @author  thoorfr
 */
public class SavePanel extends javax.swing.JPanel {

    private ISave layer;
    private String epsg="4326";

    /** Creates new form SavePanel */
    public SavePanel(ISave layer) {
        initComponents();
        this.layer = layer;
        
        
        DefaultComboBoxModel<OptionMenu> modelComboFormat=new DefaultComboBoxModel<OptionMenu>(layer.getFileFormatTypes()){
        	@Override
        	public Object getSelectedItem(){
        		return super.getSelectedItem();
        	}
        	
        	@Override
        	public void setSelectedItem(final Object item){
        		super.setSelectedItem(item);
        	}
        	
        	
        };
        
        this.comboSaveFormat.setModel(modelComboFormat);
        		
        
        
        this.jComboBox2.setModel(new DefaultComboBoxModel(CRS.getSupportedCodes("EPSG").toArray()));
        this.jComboBox2.getModel().setSelectedItem("4326");
        this.jComboBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                epsg=(String)comboSaveFormat.getModel().getSelectedItem();
                epsg=epsg.replace("EPSG:", "");
            }
        });
        if(layer instanceof MaskVectorLayer)
            if(((MaskVectorLayer)layer).getParent() instanceof IImageLayer){
            	OptionMenu opt=comboSaveFormat.getItemAt(comboSaveFormat.getSelectedIndex());
            	if (opt==null)
            		opt=comboSaveFormat.getItemAt(0);
                jTextField1.setText(((IImageLayer)((MaskVectorLayer)layer).getParent()).getImageReader().getFilesList()[0] + "." + opt.getOptionDesc());
            }    
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboSaveFormat = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setName("Save"); // NOI18N

        jLabel1.setText("File:");

        jButton1.setText("Choose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Type:");

        comboSaveFormat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSaveFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Projection:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                            .addComponent(jComboBox2, 0, 329, Short.MAX_VALUE)
                            .addComponent(comboSaveFormat, 0, 329, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboSaveFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    	OptionMenu opt=(OptionMenu)comboSaveFormat.getSelectedItem();
        layer.save(jTextField1.getText(),opt.getOptionId() , "EPSG:"+epsg);        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String filename = null;
        for (ILayer l : Platform.getLayerManager().getLayers().keySet()) {
            if (l instanceof IImageLayer & l.isActive()) {
                filename = ((IImageLayer) l).getName();
                break;
            }
        }
        filename = jTextField1.getText();
        //System.out.println(filename);
        JFileChooser fd = null;
        if(filename.lastIndexOf(File.separator) != -1)
             fd = new JFileChooser(filename.substring(0, filename.lastIndexOf(File.separator)));
        else
            fd = new JFileChooser("");
        
        int returnVal = fd.showOpenDialog(Frame.getFrames()[0]);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                jTextField1.setText(fd.getSelectedFile().getCanonicalPath());
            } catch (IOException ex) {
                Logger.getLogger(SavePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    // remove the previous extension for the file
    String filename = jTextField1.getText();
    int ii=filename.lastIndexOf(".");
    filename = filename.substring(0,ii!=-1?ii:filename.length()-1);
    
    int id=(comboSaveFormat.getSelectedIndex()!=-1)?comboSaveFormat.getSelectedIndex():0;
    OptionMenu opt=comboSaveFormat.getItemAt(id);
    jTextField1.setText(filename + "." + opt.getOptionDesc());
}//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<OptionMenu> comboSaveFormat;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
