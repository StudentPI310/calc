        import java.awt.*;
        import javax.swing.*;
         
        public class calcu extends JFrame
        {
            String Str;
            double tsena, kolvo, summ_part, S=0.0;
            Label
                    lb1 = new Label("Название товара:"),
                    lb2 = new Label("Цена единицы (руб.):"),
                    lb3 = new Label("Число единиц:"),
                    lb5 = new Label("Итоговая сумма покупок:"),
                    lb6 = new Label("Общая стоймость в списке:");
            Button 
                    b1 = new Button("Получить стоймость позиции и добавить в список");
            Button  b2 = new Button("Выход");
            List
                    l1 = new List(10);
            TextField
                    tf1 = new TextField(),
                    tf2 = new TextField(),
                    tf3 = new TextField(),
                    //tf4 = new TextField(),
                    tf5 = new TextField();
            calcu(String s)
            {
                super(s);
                setSize(570, 300);
                setVisible(true);
                setLocation(200,200);
                setLayout(null);
                setBackground(Color.LIGHT_GRAY);
                tf1.setBounds(150, 30, 130, 20);
                add(tf1);
                lb1.setBounds(10, 30, 130, 20);
                add(lb1);
                lb2.setBounds(10, 80, 130, 20);
                add(lb2);
                tf2.setBounds(150, 80, 130, 20);
                add(tf2);
                lb3.setBounds(10, 130, 130, 20);
                add(lb3);
                tf3.setBounds(150, 130, 130, 20);
                add(tf3);
                b1.setBounds(10, 180, 300, 20);
                add(b1);
                b2.setBounds(490, 220, 50, 20);
                add(b2);
                
                //tf4.setBounds(150, 230, 130, 20);
                //add(tf4);
                l1.setBounds(320, 30, 150, 150);
                add(l1);
                lb5.setBounds(320, 190, 300, 20);
                add(lb5);
                tf5.setBounds(320, 210, 130, 20);
                add(tf5);
                lb6.setBounds(310, 5, 200, 20);
                add(lb6);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
            
            public boolean action(Event e, Object arg)
            {
                if(e.target == b2){
                    System.exit(0);
                }
                
                if(e.target == b1)
                {
                    Str = String.valueOf(tf1.getText());
                    tsena = Double.valueOf(tf2.getText());
                    kolvo = Double.valueOf(tf3.getText());
                    summ_part = tsena * kolvo;
                    l1.add(Str+": "+tsena+"*"+kolvo+"="+summ_part);
                        S+=summ_part;
                        tf5.setText(String.valueOf(S));
                   return true;
                }
                else return false;
            }
            public static void main(String [] Args)
            {
                calcu F = new calcu("Калькулятор товаров");
            }
        }