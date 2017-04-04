import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class controlCalculator extends JPanel implements ActionListener{

	private JTextField JTnombre,
						JTrfc,
						JTsueldoMensual,
						JTaguinaldo,
						JTprimaVac,
						JTgastosMedicos,
						JTgastosFunerarios,
						JTseguroMedico,
						JTcreditoHipotecario,
						JTdonativos,
						JTcuentaRetiro,
						JTtransporteEscolar,
						JTcolegiaturaTotal;
	
	private String SnivelEducativo;
	
	private JComboBox JCnivelEscolar;
	
	private Calculator2 calcular;
	
	private JLabel 	JLnombre,
					JLrfc,
					JLsueldoMensual,
					JLaguinaldo,
					JLprimaVac,
					JLgastosMedicos,
					JLgastosFunerarios,
					JLseguroMedico,
					JLcreditoHipotecario,
					JLdonativos,
					JLcuentaRetiro,
					JLtransporteEscolar,
					JLcolegiaturaTotal,		
					JLnivelEscolar;
	private JButton ok;
	
	
	
	public controlCalculator(){
		super();
		this.setPreferredSize(new Dimension(310,200));
		this.setBackground(Color.LIGHT_GRAY);
		
		this.JTnombre = new JTextField(15);
		JTnombre.setHorizontalAlignment(JTextField.LEFT);
		this.JLnombre= new JLabel("Nombre:                ");
		this.add(JLnombre);
		this.add(JTnombre);
		
		
		this.JTrfc = new JTextField(15);
		JTrfc.setHorizontalAlignment(JTextField.LEFT);
		this.JLrfc= new JLabel("RFC:                        ");
		this.add(JLrfc);
		this.add(JTrfc);

		this.JTsueldoMensual = new JTextField(15);
		JTsueldoMensual.setHorizontalAlignment(JTextField.LEFT);
		this.JLsueldoMensual = new JLabel("Sueldo Mensual:  ");		
		this.add(JLsueldoMensual);
		this.add(JTsueldoMensual);		
		
		this.JTaguinaldo   = new JTextField(15);
		JTaguinaldo.setHorizontalAlignment(JTextField.LEFT);
		this.JLaguinaldo   = new JLabel("Aguinaldo:             ");
		this.add(JLaguinaldo);
		this.add(JTaguinaldo);
		
		this.JTprimaVac   = new JTextField(15);
		JTprimaVac.setHorizontalAlignment(JTextField.LEFT);
		this.JLprimaVac   = new JLabel("Prima vacacional:");
		this.add(JLprimaVac   );
		this.add(JTprimaVac   );
		
		this.JTgastosMedicos   = new JTextField(15);
		JTgastosMedicos.setHorizontalAlignment(JTextField.LEFT);
		this.JLgastosMedicos   = new JLabel("Gastos Medicos: ");
		this.add(JLgastosMedicos  );
		this.add(JTgastosMedicos  );
		
		this.JTgastosFunerarios   = new JTextField(15);
		JTgastosFunerarios.setHorizontalAlignment(JTextField.LEFT);
		this.JLgastosFunerarios  = new JLabel("Gastos Funerarios:");
		this.add( JLgastosFunerarios);
		this.add( JTgastosFunerarios );
		
		this.JTseguroMedico   = new JTextField(15);
		JTseguroMedico.setHorizontalAlignment(JTextField.LEFT);
		this.JLseguroMedico  = new JLabel("Seguro medico:     ");
		this.add(JLseguroMedico  );
		this.add(JTseguroMedico );
		
	
		this.JTcreditoHipotecario   = new JTextField(15);
		JTcreditoHipotecario.setHorizontalAlignment(JTextField.LEFT);
		this.JLcreditoHipotecario  = new JLabel("Credito Hipotecario  ");
		this.add(JLcreditoHipotecario  );
		this.add(JTcreditoHipotecario );
		
		this.JTdonativos   = new JTextField(15);
		JTdonativos.setHorizontalAlignment(JTextField.LEFT);
		this.JLdonativos  = new JLabel("Donativos:                ");
		this.add(JLdonativos  );
		this.add(JTdonativos );
		
		this.JTcuentaRetiro   = new JTextField(15);
		JTcuentaRetiro.setHorizontalAlignment(JTextField.LEFT);
		this.JLcuentaRetiro  = new JLabel("Aportacion retiro:  ");
		this.add(JLcuentaRetiro  );
		this.add(JTcuentaRetiro );
		
		this.JTtransporteEscolar   = new JTextField(15);
		JTtransporteEscolar.setHorizontalAlignment(JTextField.LEFT);
		this.JLtransporteEscolar  = new JLabel("Transporte escolar:  ");
		this.add(JLtransporteEscolar  );
		this.add(JTtransporteEscolar );
		
		
		this.JLnivelEscolar = new JLabel("Nivel Escolar:");
		this.add(JLnivelEscolar);
		JCnivelEscolar = new JComboBox();
		JCnivelEscolar.addItem("Preescolar");
		JCnivelEscolar.addItem("Primaria");
		JCnivelEscolar.addItem("Secundaria");
		JCnivelEscolar.addItem("Bachillerato/ Preparatoria");
		JCnivelEscolar.addItem("Profesional Tecnico");
		
		JCnivelEscolar.addItemListener( 
				new ItemListener(){
					public void itemStateChanged(ItemEvent e) {
						if(e.getStateChange()== ItemEvent.SELECTED){
								if(JCnivelEscolar.getSelectedIndex()==0){
										SnivelEducativo="PREESCOLAR";
									}
							
								if(JCnivelEscolar.getSelectedIndex()==1){
										SnivelEducativo="PRIMARIA";
									}
								if(JCnivelEscolar.getSelectedIndex()==2){
										SnivelEducativo="SECUNDARIA";
									}
								if(JCnivelEscolar.getSelectedIndex()==3){
										SnivelEducativo="PREPARATORIA";
									}
								if(JCnivelEscolar.getSelectedIndex()==4){
									SnivelEducativo="TECNICO";
									}
						}
						
					}
					
				}
				
				);
		
		
		this.add(JCnivelEscolar);
		
		
		

		this.JTcolegiaturaTotal   = new JTextField(15);
		JTcolegiaturaTotal.setHorizontalAlignment(JTextField.LEFT);
		this.JLcolegiaturaTotal  = new JLabel("Colegiatura Total:  ");
		this.add(JLcolegiaturaTotal  );
		this.add(JTcolegiaturaTotal );
		
		this.ok = new JButton("Aceptar");
		this.add(ok);
		ok.addActionListener(this);
		
		this.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		try{
			if(e.getSource()==ok){
				calcular = new Calculator2(Double.parseDouble(JTaguinaldo.getText()),
										   Double.parseDouble(JTaguinaldo.getText()),
										   Double.parseDouble(JTprimaVac.getText()),
										   Double.parseDouble(JTgastosMedicos.getText()),
										   Double.parseDouble(JTgastosFunerarios.getText()),
										   Double.parseDouble(JTseguroMedico.getText()),
										   Double.parseDouble(JTcreditoHipotecario.getText()),
										   Double.parseDouble(JTdonativos.getText()),
										   Double.parseDouble(JTcuentaRetiro.getText()),
										   Double.parseDouble(JTtransporteEscolar.getText()),
										   Double.parseDouble(JTcolegiaturaTotal.getText()),
										  SnivelEducativo );
				
								JOptionPane.showMessageDialog(null,calcular.toString(), "Resultados", 1);	
								}
							}catch(NumberFormatException error){
									JOptionPane.showMessageDialog(null, "NO SE INTRODUJERON DATOS CORRECTAMENTE Y/O QUEDARON LUGARES EN BLANCO", "ERROR", 1);
				
			}
				
			}
		
	


}
