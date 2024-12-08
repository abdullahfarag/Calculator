import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame {

    private JPanel panel;
    private String operations = null;
    private JLabel label = new JLabel();
    private Dimension numDimentions = new Dimension(50, 40);
    private Dimension oprDimentions = new Dimension(50, 31);

    String[] btnLabel = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        ".", "0", "=", "C", "+", "-", "*", "/"};
    JButton[] buttons = new JButton[17];

    private boolean update = false;
    private boolean clicopr = false;
    private double result;

    public Calculator() {
        prepareCalculator();

    }

    private void prepareCalculator() {
        panel = new JPanel();
        prepareFram();
        handleCalculator();
    }

    private void handleCalculator() {
        Font police = new Font("Calibri", Font.BOLD, 18);
        prepareInput(police);
        JPanel opr = new JPanel();
        opr.setPreferredSize(new Dimension(55, 225));
        JPanel panelNums = new JPanel();
        panelNums.setPreferredSize(new Dimension(165, 225));
        JPanel panlabel = new JPanel();
        panlabel.setPreferredSize(new Dimension(220, 30));
        prepareButtons(opr, panelNums);
        panlabel.add(label);
        panlabel.setBorder(BorderFactory.createLineBorder(Color.black));
        drawContainer(opr, panelNums, panlabel);
        this.setContentPane(panel);
        this.setVisible(true);
    }

    private void calculations() {
        // if (operations.equals("+")) {
        //     result = result
        //             + Double.valueOf(label.getText()).doubleValue();
        //     label.setText(String.valueOf(result));
        // }
        if (operations.equals("-")) {
            result = result
                    - Double.valueOf(label.getText()).doubleValue();
            label.setText(String.valueOf(result));
        }
        if (operations.equals("*")) {
            result = result
                    * Double.valueOf(label.getText()).doubleValue();
            label.setText(String.valueOf(result));
        }
        if (operations.equals("/")) {
            try {
                result = result
                        / Double.valueOf(label.getText()).doubleValue();
                label.setText(String.valueOf(result));
            } catch (ArithmeticException e) {
                label.setText("0");
            }
        }
    }

    private void prepareButtons(JPanel opr, JPanel panelNums) {
        for (int i = 0; i < btnLabel.length; i++) {
            buttons[i] = new JButton(btnLabel[i]);
            buttons[i].setPreferredSize(numDimentions);
            switch (i) {
                case 11:
                    buttons[i].setForeground(Color.black);
                    buttons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            calculations();
                            update = true;
                            clicopr = false;
                        }
                    });
                    panelNums.add(buttons[i]);
                    break;
                case 12:
                    buttons[i].setForeground(Color.red);
                    buttons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            clicopr = false;
                            update = true;
                            result = 0;
                            operations = "";
                            label.setText("0");
                        }
                    });
                    buttons[i].setPreferredSize(oprDimentions);
                    opr.add(buttons[i]);
                    break;
                case 13:
                    buttons[i].setForeground(Color.black);
                    buttons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (clicopr) {
                                calculations();
                                label.setText(String.valueOf(result));
                            } else {
                                result
                                        = Double.valueOf(label.getText()).doubleValue();
                                clicopr = true;
                            }
                            operations = "+";
                            update = true;
                        }
                    });
                    buttons[i].setPreferredSize(oprDimentions);
                    opr.add(buttons[i]);
                    break;
                case 14:
                    buttons[i].setForeground(Color.black);
                    buttons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (clicopr) {
                                calculations();
                                label.setText(String.valueOf(result));
                            } else {
                                result
                                        = Double.valueOf(label.getText()).doubleValue();
                                clicopr = true;
                            }
                            operations = "-";
                            update = true;
                        }
                    });
                    buttons[i].setPreferredSize(oprDimentions);
                    opr.add(buttons[i]);
                    break;
                case 15:
                    buttons[i].setForeground(Color.black);
                    buttons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (clicopr) {
                                calculations();
                                label.setText(String.valueOf(result));
                            } else {
                                result
                                        = Double.valueOf(label.getText()).doubleValue();
                                clicopr = true;
                            }
                            operations = "*";
                            update = true;
                        }
                    });
                    buttons[i].setPreferredSize(oprDimentions);
                    opr.add(buttons[i]);
                    break;
                case 16:
                    buttons[i].setForeground(Color.black);
                    buttons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (clicopr) {
                                calculations();
                                label.setText(String.valueOf(result));
                            } else {
                                result
                                        = Double.valueOf(label.getText()).doubleValue();
                                clicopr = true;
                            }
                            operations = "/";
                            update = true;
                        }
                    });
                    buttons[i].setPreferredSize(oprDimentions);
                    opr.add(buttons[i]);
                    break;
                case 17:
                    buttons[i].setForeground(Color.black);
                    buttons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                            if (clicopr) {
                                calculations();
                                label.setText(String.valueOf(result));
                            } else {
                                result
                                        = Double.valueOf(label.getText()).doubleValue();
                                clicopr = true;
                            }
                            operations = "/";
                            update = true;
                        }
                    });
                    buttons[i].setPreferredSize(oprDimentions);
                    opr.add(buttons[i]);
                    break;
                default:
                    buttons[i].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String str = ((JButton) e.getSource()).getText();
                            if (update) {
                                update = false;
                            } else {
                                if (!label.getText().equals("0")) {
                                    str = label.getText() + str;
                                }
                            }
                            label.setText(str);
                        }
                    });
                    panelNums.add(buttons[i]);
                    break;
            }
        }
    }

    private void drawContainer(JPanel opr, JPanel panelNums, JPanel panlabel) {
        panel.add(panlabel, BorderLayout.NORTH);
        panel.add(panelNums, BorderLayout.CENTER);
        panel.add(opr, BorderLayout.EAST);
    }

    private void prepareInput(Font police) {
        label = new JLabel("0");
        label.setFont(police);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setPreferredSize(new Dimension(220, 20));
    }

    private void prepareFram() {
        this.setSize(450, 400);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
