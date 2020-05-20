/*
 * Copyright 2010-2020 Australian Signals Directorate
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package au.gov.asd.tac.constellation.graph.utilities.planes;

import au.gov.asd.tac.constellation.graph.GraphReadMethods;

/**
 *
 * @author algol
 */
public class PlanePositionPanel extends javax.swing.JPanel {

    public PlanePositionPanel() {
        initComponents();
    }

    public float[] getPosition(final GraphReadMethods rg, final float x, final float y, final float z, final float radius, final float width, final float height) {
        float xx;
        float yy;
        float rr = includeRadiusCheck.isSelected() ? radius : 0;

        if (topLeftRb.isSelected()) {
            xx = x + rr;
            yy = y - height - rr;
        } else if (topRb.isSelected()) {
            xx = x - width / 2f;
            yy = y - height - rr;
        } else if (topRightRb.isSelected()) {
            xx = x - width - rr;
            yy = y - height - rr;
        } else if (rightRb.isSelected()) {
            xx = x - width - rr;
            yy = y - height / 2f;
        } else if (bottomRightRb.isSelected()) {
            xx = x - width - rr;
            yy = y + rr;
        } else if (bottomRb.isSelected()) {
            xx = x - width / 2f;
            yy = y + rr;
        } else if (bottomLeftRb.isSelected()) {
            xx = x + rr;
            yy = y + rr;
        } else if (leftRb.isSelected()) {
            xx = x + rr;
            yy = y - height / 2f;
        } else if (centreRb.isSelected()) {
            xx = x - width / 2f;
            yy = y - height / 2f;
        } else {
            throw new IllegalStateException();
        }

        return new float[]{xx, yy, z};
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        positionGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        topLeftRb = new javax.swing.JRadioButton();
        topRb = new javax.swing.JRadioButton();
        topRightRb = new javax.swing.JRadioButton();
        rightRb = new javax.swing.JRadioButton();
        bottomRightRb = new javax.swing.JRadioButton();
        bottomRb = new javax.swing.JRadioButton();
        bottomLeftRb = new javax.swing.JRadioButton();
        leftRb = new javax.swing.JRadioButton();
        centreRb = new javax.swing.JRadioButton();
        includeRadiusCheck = new javax.swing.JCheckBox();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.jPanel1.border.title"))); // NOI18N

        positionGroup.add(topLeftRb);
        topLeftRb.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(topLeftRb, org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.topLeftRb.text")); // NOI18N

        positionGroup.add(topRb);
        org.openide.awt.Mnemonics.setLocalizedText(topRb, org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.topRb.text")); // NOI18N

        positionGroup.add(topRightRb);
        org.openide.awt.Mnemonics.setLocalizedText(topRightRb, org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.topRightRb.text")); // NOI18N

        positionGroup.add(rightRb);
        org.openide.awt.Mnemonics.setLocalizedText(rightRb, org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.rightRb.text")); // NOI18N

        positionGroup.add(bottomRightRb);
        org.openide.awt.Mnemonics.setLocalizedText(bottomRightRb, org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.bottomRightRb.text")); // NOI18N

        positionGroup.add(bottomRb);
        org.openide.awt.Mnemonics.setLocalizedText(bottomRb, org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.bottomRb.text")); // NOI18N

        positionGroup.add(bottomLeftRb);
        org.openide.awt.Mnemonics.setLocalizedText(bottomLeftRb, org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.bottomLeftRb.text")); // NOI18N

        positionGroup.add(leftRb);
        org.openide.awt.Mnemonics.setLocalizedText(leftRb, org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.leftRb.text")); // NOI18N

        positionGroup.add(centreRb);
        org.openide.awt.Mnemonics.setLocalizedText(centreRb, org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.centreRb.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topLeftRb)
                    .addComponent(topRb)
                    .addComponent(topRightRb)
                    .addComponent(rightRb)
                    .addComponent(bottomRightRb)
                    .addComponent(bottomRb)
                    .addComponent(bottomLeftRb)
                    .addComponent(leftRb)
                    .addComponent(centreRb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topLeftRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topRightRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomRightRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomLeftRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leftRb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centreRb)
                .addContainerGap())
        );

        includeRadiusCheck.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(includeRadiusCheck, org.openide.util.NbBundle.getMessage(PlanePositionPanel.class, "PlanePositionPanel.includeRadiusCheck.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(includeRadiusCheck))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(includeRadiusCheck)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bottomLeftRb;
    private javax.swing.JRadioButton bottomRb;
    private javax.swing.JRadioButton bottomRightRb;
    private javax.swing.JRadioButton centreRb;
    private javax.swing.JCheckBox includeRadiusCheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton leftRb;
    private javax.swing.ButtonGroup positionGroup;
    private javax.swing.JRadioButton rightRb;
    private javax.swing.JRadioButton topLeftRb;
    private javax.swing.JRadioButton topRb;
    private javax.swing.JRadioButton topRightRb;
    // End of variables declaration//GEN-END:variables
}
