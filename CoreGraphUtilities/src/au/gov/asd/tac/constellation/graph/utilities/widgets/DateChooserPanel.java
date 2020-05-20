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
package au.gov.asd.tac.constellation.graph.utilities.widgets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JPanel;

/**
 *
 * @author algol
 */
public final class DateChooserPanel extends JPanel implements ActionListener {

    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");

    private final Calendar calendar;

    private String fmtDate() {
        return String.format("%4d-%02d-%02d", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
    }

    /**
     * Creates new form DateChooserPanel.
     *
     * @param date The date showing at the beginning.
     */
    public DateChooserPanel(final Date date) {
        initComponents();

        calendar = Calendar.getInstance(UTC);

        monthView.setTimeZone(UTC);
        if (date != null) {
            calendar.setTime(date);
            dateText.setText(fmtDate());
            monthView.ensureDateVisible(date);
            monthView.setSelectionDate(date);
        }

        monthView.addActionListener(this);
    }

    /**
     * Return the date selected by the user.
     *
     * @return The date selected by the user.
     */
    public Date getSelectedDate() {
        return monthView.getFirstSelectionDate();
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        calendar.setTime(monthView.getFirstSelectionDate());
        final String s = fmtDate();

        dateText.setText(s);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monthView = new org.jdesktop.swingx.JXMonthView();
        dateText = new javax.swing.JTextField();

        monthView.setShowingLeadingDays(true);
        monthView.setShowingTrailingDays(true);
        monthView.setShowingWeekNumber(true);
        monthView.setTodayBackground(java.awt.Color.orange);
        monthView.setTraversable(true);

        dateText.setEditable(false);
        dateText.setText(org.openide.util.NbBundle.getMessage(DateChooserPanel.class, "DateChooserPanel.dateText.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateText)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(monthView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateText;
    private org.jdesktop.swingx.JXMonthView monthView;
    // End of variables declaration//GEN-END:variables
}
