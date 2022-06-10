import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator extends JFrame{
    double in, cur = 0;

    public Calculator() {

        Stack<Character> expStack = new Stack<>();

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

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expStack.push('0');
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expStack.push('1');
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expStack.push('2');
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expStack.push('3');
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expStack.push('4');
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expStack.push('5');
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expStack.push('6');
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expStack.push('7');
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expStack.push('8');
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expStack.push('9');
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
