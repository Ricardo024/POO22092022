package cifradocesar;

import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class VentanaCesar extends JFrame {
    
    //Panel 1 
    private JTextArea cuadro;
    private JTextArea resultado;
    private JTextField desplazamiento;
    private JButton boton;
    private Label etiqueta;
    private Label etiqueta2;
    private Label etiqueta3;
    private JPanel panel;
    private JTabbedPane pestañas;
    
    //Panel 2
    private JTextArea cuadro2;
    private JTextArea resultado2;
    private JTextField desplazamiento2;
    private JButton boton2;
    private Label etiqueta01;
    private Label etiqueta02;
    private Label etiqueta03;
    private JPanel panel2;

    public VentanaCesar() throws HeadlessException {
        
        setTitle("Cifrado Cesar");
        setSize(560, 420);
        setLocationRelativeTo(null);
        
        
        pestañas = new JTabbedPane();
        
        // Panel1 para la pestaña "Cifrado"
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        etiqueta = new Label("Ingrese la cantidad de desplazamientos:");
        etiqueta.setBounds(10, 10, 210, 20);
        panel.add(etiqueta);
        
        etiqueta2 = new Label("Ingrese un mensaje:");
        etiqueta2.setBounds(10, 30, 200, 20);
        panel.add(etiqueta2);
        
        etiqueta3 = new Label("Mensaje cifrado:");
        etiqueta3.setBounds(280, 30, 200, 20);
        panel.add(etiqueta3);
        
        desplazamiento = new JTextField();
        desplazamiento.setBounds(230, 10, 30, 20);
        panel.add(desplazamiento);
        
        cuadro = new JTextArea();
        cuadro.setBounds(10, 55, 250, 250);
        panel.add(cuadro);
        
        resultado = new JTextArea();
        resultado.setBounds(280, 55, 250, 250);
        panel.add(resultado);
        
        boton = new JButton("Cifrar");
        boton.setBounds(230, 320, 75, 20);
        panel.add(boton);
        
        
        
        // Panel 2 para la pestaña "Descifrado"
        panel2 = new JPanel();
        panel2.setLayout(null);
        this.getContentPane().add(panel2);
        
        etiqueta01 = new Label("Ingrese la cantidad de desplazamientos:");
        etiqueta01.setBounds(10, 10, 210, 20);
        panel2.add(etiqueta01);
        
        etiqueta02 = new Label("Ingrese un mensaje cifrado:");
        etiqueta02.setBounds(10, 30, 200, 20);
        panel2.add(etiqueta02);
        
        etiqueta03 = new Label("Mensaje descifrado:");
        etiqueta03.setBounds(280, 30, 200, 20);
        panel2.add(etiqueta03);
        
        desplazamiento2 = new JTextField();
        desplazamiento2.setBounds(230, 10, 30, 20);
        panel2.add(desplazamiento2);
        
        cuadro2 = new JTextArea();
        cuadro2.setBounds(10, 55, 250, 250);
        panel2.add(cuadro2);
        
        resultado2 = new JTextArea();
        resultado2.setBounds(280, 55, 250, 250);
        panel2.add(resultado2);
        
        boton2 = new JButton("Descifrar");
        boton2.setBounds(215, 320, 90, 20);
        panel2.add(boton2);
        
        // Agregar las pestañas
        pestañas.add("Cifrado", panel);
        pestañas.add("Descifrado", panel2);
        
        add(pestañas);
        
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String letras = "abcdefghijklmnñopqrstuvwxyz";
                String textoCodificado = "";
                char caracter;
               try {
                int nDesplazamiento = Integer.parseInt(desplazamiento.getText());
                
                for (int i = 0; i < cuadro.getText().length(); i++) {
                    caracter = cuadro.getText().charAt(i);
                    int posicion = letras.indexOf(caracter);
                    
                    if (posicion == -1) {
                        textoCodificado += caracter;
                    } else {
                        textoCodificado += letras.charAt((posicion + nDesplazamiento)
                                % letras.length());
                        
                    }
                    
                }
                
                
                
                resultado.setText(textoCodificado);
            } catch (NumberFormatException ie) {
                JOptionPane.showMessageDialog(null,"Introduce un valor númerico "
                        + "entero en la cantidad de desplazamientos",
                          "Error de captura", JOptionPane.ERROR_MESSAGE);
            }
            }
            
        });
        
        
        // Boton 2
        
        this.boton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String letras = "abcdefghijklmnñopqrstuvwxyz";
                
                String textoDescodificado = "";
                char caracter;
               try {
                int nDesplazamiento = Integer.parseInt(desplazamiento2.getText());
                
                for (int i = 0; i < cuadro2.getText().length(); i++) {
                    caracter = cuadro2.getText().charAt(i);
                    int posicion = letras.indexOf(caracter);
                    
                    if (posicion == -1) {
                        textoDescodificado += caracter;
                    } else {
                        if ((posicion - nDesplazamiento) < 0) {
                            textoDescodificado += letras.charAt(letras.length() +
                                    (posicion - nDesplazamiento));
                        } else{
                        textoDescodificado += letras.charAt((posicion - nDesplazamiento)
                                % letras.length());
                        }
                        
                    }
                }
                
                resultado2.setText(textoDescodificado);
            } catch (NumberFormatException ie) {
                JOptionPane.showMessageDialog(null,"Introduce un valor númerico "
                        + "entero en la cantidad de desplazamientos",
                          "Error de captura", JOptionPane.ERROR_MESSAGE);
            }
            }
            
        });
    }
}
