import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import javax.swing.JButton;

public class App extends javax.swing.JFrame {
    public App() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de login");
        getContentPane().setLayout(null);

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(276, 241, 96, 23);

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(176, 241, 72, 23);

        jLabel1.setText("NOME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 24, 35, 16);

        jLabel2.setText("CURSO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 64, 38, 16);

        jLabel3.setText("SERIE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(6, 104, 28, 16);

        jLabel4.setText("DATA DE NASCIMENTO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(6, 144, 125, 16);

        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(170, 21, 210, 22);

        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(170, 61, 210, 22);

        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField3);
        jFormattedTextField3.setBounds(170, 101, 210, 22);

        jFormattedTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField4);
        jFormattedTextField4.setBounds(170, 141, 210, 22);

        pack();
    }// </editor-fold>                        

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Cadastro de Aluno");
            System.out.print("Digite o nome do aluno: ");
            String NOME = scanner.nextLine();
            
            System.out.println("Aluno cadastrado com sucesso:");
            System.out.println("Nome: " + NOME);
        }
    }                                                    

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o curso do aluno: ");
            String CURSO = scanner.nextLine();
            
            System.out.println("Curso cadastrado com sucesso:");
            System.out.println("Curso: " + CURSO);
        }
    }                                                    

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a serie do aluno: ");
            String SERIE = scanner.nextLine();
            
            System.out.println("Serie cadastrado com sucesso:");
            System.out.println("Serie: " + SERIE);
        }
    }                                                    

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a data de nascimento (no formato AAAA-MM-DD): ");
            String DATADENASCIMENTO = scanner.nextLine();
            LocalDate dataNascimento = LocalDate.parse(DATADENASCIMENTO);
            
            LocalDate hoje = LocalDate.now();
            Period periodo = Period.between(dataNascimento, hoje);
            int idade = periodo.getYears();
            
            if (idade < 18) {
                // Solicita o nome do responsável
                System.out.print("Digite o nome do responsável: ");
                String nomeResponsavel = scanner.nextLine();
                System.out.println("Cadastro realizado com sucesso! Nome do responsável: " + nomeResponsavel);
            } else {
                System.out.println("Cadastro realizado com sucesso!");
            }
        }
    }                                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener((ActionListener) this);
        add(botaoCadastrar);                                  
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton2.addActionListener((ActionEvent evt1) -> {
            jFormattedTextField1.setText("");
            jFormattedTextField2.setText("");
            jFormattedTextField3.setText("");
            jFormattedTextField4.setText("");
        });
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration                   
