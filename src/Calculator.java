import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Calculator extends JFrame {

    public Calculator() {

        ArrayList<String> exp = new ArrayList<>();
        //panel and frame
        JFrame frame = new JFrame("Calculator");
        JPanel panel = new JPanel();
        JTextField input = new JTextField();
        //buttons
        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton div = new JButton("/");
        JButton mul = new JButton("x");
        JButton solve = new JButton("Solve");
        JButton clr = new JButton("C");

        clr.addActionListener(e -> {
            exp.clear();
            input.setText("");
        });
        zero.addActionListener(e -> {
            exp.add("0");
            String exps = "";
            for (String s : exp) {
                exps += s;
                System.out.println(exps);
            }
            input.setText(exps);
        });
        one.addActionListener(e -> {
            exp.add("1");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());
        });
        two.addActionListener(e -> {
            exp.add("2");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());
        });
        three.addActionListener(e -> {
            exp.add("3");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());
        });
        four.addActionListener(e -> {
            exp.add("4");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());

        });
        five.addActionListener(e -> {
            exp.add("5");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());

        });
        six.addActionListener(e -> {
            exp.add("6");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());
        });
        seven.addActionListener(e -> {
            exp.add("7");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());

        });
        eight.addActionListener(e -> {
            exp.add("8");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());

        });
        nine.addActionListener(e -> {
            exp.add("9");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());

        });
        add.addActionListener(e -> {
            exp.add("+");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());

        });
        sub.addActionListener(e -> {
            exp.add("-");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());

        });
        div.addActionListener(e -> {
            exp.add("/");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());

        });
        mul.addActionListener(e -> {
            exp.add("*");
            StringBuilder exps = new StringBuilder();
            for (String s : exp) {
                exps.append(s);
            }
            input.setText(exps.toString());


        });
        solve.addActionListener(e -> {
            int i;

            for (i = 0; i < exp.size(); i++) {
                if (exp.get(i).equals("+") || exp.get(i).equals("-") || exp.get(i).equals("*") || exp.get(i).equals("/")) {
                    break;
                }
            }
            StringBuilder numString1 = new StringBuilder();
            StringBuilder numString2 = new StringBuilder();

            for (int j = 0; j < i; j++) {
                numString1.append(exp.get(j));

            }
            for (int j = i + 1; j < exp.size(); j++) {
                numString2.append(exp.get(j));

            }


            double num1 = Double.parseDouble(numString1.toString());
            double num2 = Double.parseDouble(numString2.toString());
            double valueOf = 0;
            boolean isValid = true;


            switch (exp.get(i)) {
                case "+":
                    valueOf = num1 + num2;
                    break;
                case "-":
                    valueOf = num1 - num2;
                    break;
                case "*":
                    valueOf = num1 * num2;
                    break;
                case "/":
                    if (num2 > 0) {
                        valueOf = num1 / num2;
                    } else {
                        isValid = false;
                    }
                    break;
            }

            if (isValid) {
                input.setText(String.valueOf(valueOf));
            } else {
                input.setText("Error");
            }
        });


        //Input


        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //Input position
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.BOTH;

        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        panel.add(input, gbc);
        gbc.gridwidth = 1;

        gbc.gridy = 1;
        gbc.gridx = 0;

        panel.add(seven, gbc);

        gbc.gridy = 1;
        gbc.gridx = 1;

        panel.add(eight, gbc);

        gbc.gridy = 1;
        gbc.gridx = 2;

        panel.add(nine, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;

        panel.add(four, gbc);

        gbc.gridy = 2;
        gbc.gridx = 1;

        panel.add(five, gbc);

        gbc.gridy = 2;
        gbc.gridx = 2;

        panel.add(six, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;

        panel.add(one, gbc);

        gbc.gridy = 3;
        gbc.gridx = 1;

        panel.add(two, gbc);

        gbc.gridy = 3;
        gbc.gridx = 2;

        panel.add(three, gbc);

        gbc.gridy = 4;
        gbc.gridx = 1;

        panel.add(zero, gbc);

        gbc.gridy = 1;
        gbc.gridx = 3;

        panel.add(add, gbc);

        gbc.gridy = 2;
        gbc.gridx = 3;

        panel.add(sub, gbc);

        gbc.gridy = 3;
        gbc.gridx = 3;

        panel.add(mul, gbc);

        gbc.gridy = 4;
        gbc.gridx = 3;

        panel.add(div, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;

        panel.add(clr, gbc);

        gbc.gridy = 5;
        gbc.gridx = 0;

        gbc.gridwidth = 4;

        panel.add(solve, gbc);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(250, 400);
        frame.add(panel);
        frame.setVisible(true);


    }

}
