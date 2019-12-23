package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.border.BevelBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.sun.xml.internal.ws.policy.sourcemodel.attach.ExternalAttachmentsUnmarshaller;

import dominio.Circuito;
import dominio.GrupoTuristas;
import dominio.Lugar;
import dominio.Usuario;
import javafx.scene.control.RadioButton;

import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.BoxLayout;
//import java.awt.event.*;

public class VentanaPrincipal2 {

	private JFrame frame;
	private JPanel pnInfoUsuario;
	private JPanel pnAreaImagen;
	private JPanel pnHerramientas;
	private JButton btnCerrarSesion;
	private JButton btnAyuda;
	private JLabel lblUltimaConexion;
	private JPanel pnContenidoUsuario;
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JPanel pnImagen;
	private JLabel lblImagen;
	private JPanel pnPrincipal;
	private JTabbedPane tbPestañas;
	private JPanel pnCircuitos;
	private JPanel pnGuias;
	private JPanel pnGrupos;
	private JPanel pnDiseñoRuta;
	private JPanel pnLugares;
	private JPanel pnContratacion;
	private JButton btnContratar;
	private JCheckBox chckbxContratado;
	private JPanel pnBotonesLugares;
	private JButton btnAgregarlugar;
	private JButton btnEliminarlugar;
	private JPanel pnListaLugares;
	private JLabel lblLugaresDeVisita;
	private JScrollPane spnLugares;
	private JList<Lugar> listLugares;
	private JPanel pnInfoCircuito;
	private JPanel pnDatosCircuito;
	private JLabel lblNombreCircuito;
	private JTextField txtfNombreCircuito;
	private JLabel lblPersonasQueLo;
	private JSpinner spinnerPersonasCircuito;
	private JLabel lblPrecio;
	private JTextField txtfPrecioCircuito;
	private JPanel pnEspacio;
	private JPanel pnInciden_Puntos_Opiniones;
	private JPanel pnIncidencias;
	private JPanel pntituloIncidencia;
	private JLabel lblIncidencias;
	private JRadioButton rdbtnSi;
	private JRadioButton rdbtnNo;
	private MiListaJPanel_2 pnListaIncidencia;
	private JPanel pnSugerencias;
	private JLabel lblOpinionesYSugerencias;
	private MiListaJPanel_2 pnListaSugerencias;
	private JPanel pnptosInteres_globales;
	private JLabel lblPuntosDeInteres;
	private MiListaJPanel_2 pnListaptosInteres_globales;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblDireccinDeCorreo;
	private JTextField txtCorreo;
	private MiListaJPanel_1 pnListaGuias;
	private JLabel lblGuiasContratados;
	private JPanel pnIdiomasGuia;
	private JPanel pnInfoGuia;
	private JPanel pnEspacio1;
	private JPanel pnInfoCentral;
	private JPanel pnImagenGuia;
	private JLabel lblImagenGuia;
	private JButton btnSeleccionarGuia;
	private JPanel pnHisRutasGuia;
	private JLabel lblHistorialDeRutas;
	private JScrollPane spnRutasGuia;
	private JList listRutasGuia;
	private JPanel pnListaIntegrantes;
	private JLabel lblIntegrantes;
	private JPanel pnBotonesIntegrantes;
	private JButton btnAgregar_1;
	private JButton btnBorrar_1;
	private JPanel pnInfoGrupo;
	private JPanel pnEspacio2;
	private JPanel pnInfoGrupCentral;
	private JPanel pnInfoGrupo1;
	private JLabel lblNombreGrupo;
	private JTextField txtNombreGrupo;
	private JLabel lblPaisOrigen;
	private JTextField txtPais;
	private JLabel lblLugarDeAlojamiento;
	private JTextField txtAlojamiento;
	private JLabel lblTipologia;
	private JComboBox comboTipGrupo;
	private JLabel lblGua;
	private JComboBox comboGuiaGrupo;
	private JPanel pnInteresesGrupo;
	private JLabel lblIntereses;
	private MiListaJPanel_2 pnRestricciones;
	private JPanel pnTituloRestric;
	private JLabel lblRestricciones;
	private JRadioButton rdbtnSi_1;
	private JRadioButton rdbtnNo_1;
	private JPanel pnInfoGeneral;
	private JTextField txtNombreguia;
	private JLabel lblApellidosGuia;
	private JTextField txtApellidosGuia;
	private JLabel lblCorreoGuia;
	private JTextField txtCorreoguia;
	private JLabel lblNTelefono;
	private JTextField txtNumeroGuia;
	private JLabel lblPrecioHora;
	private JTextField txtPrecioGuia;
	private JLabel lblPuntuacion;
	private JLabel lblDisponibilidadGuia;
	private JTextField txtPuntuacionGuia;
	private JRadioButton rdbtnSi_2;
	private JRadioButton rdbtnNo_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JPanel pnTablaIntegrantes;
	private JPanel pnFotoIntegrante;
	private JScrollPane spnInfoImagenes;
	private JLabel lblFotoSeleccionada;
	private JTextPane txIntegranteSeleccionado;
	private JScrollPane spnTablaIntegrantes;
	private JTable tablaIntegrantes;
	private JButton btnSalir;
	private JPanel pnEspacio3;
	private JPanel pnListaIdioma;
	private JLabel lblIdiomas;
	private boolean lanzadoPago = false;
	private boolean lanzadoLugarInfo = false;
	private boolean lanzadoCreaLugar = false;
	private JPanel pnListaCircuitos;
	private JLabel lblCircuitosContratados;
	private JPanel pnBotonesCircuitosList;
	private JButton btnAniadirCircuito;
	private JButton btnLimpiarCircuito;
	private JScrollPane spnListaCircuito;
	private JList<Circuito> listCircuitos;
	private JPanel pnListaGrupos;
	private JLabel lblGruposTusiticos;
	private JPanel pnBotonesGrupos;
	private JButton btnAniadirGrupo;
	private JButton btnLimpiarGrupo;
	private JScrollPane spnListaGrupos;
	private JList<GrupoTuristas> listGrupos;
	private Usuario user;
	private JButton btnModificar;
	private JButton btnEliminarCircuito;
	private JButton btnModificarGrupo;
	private JButton btnEliminarGrupo;
	private MiModeloJTable modeloTabla;

	// ArrayList listas
	private ArrayList<Circuito> lista_circuitos;
	private ArrayList<GrupoTuristas> lista_grupos;
	private ArrayList<Lugar> lista_lugares;
	private ArrayList<String> lista_idiomas;
	private ArrayList<String> lista_incidencias;
	private ArrayList<String> lista_restricciones;
	private ArrayList<String> lista_ptosInteres;
	private ArrayList<String> lista_sugerencias;


	// Inicializar listas circuitos
	String[] restricciones = new String[] { "Prohibido a menores de 18 años", "Prohibido animales", "Prohibido fumar",
			"Prohibido el uso de télefonos móviles" };
	String[] ptosInteres_globales = new String[] { "Restaurantes alredor catedral", "Asador Maripili",
			"Teatro municipal", "Coliseum", "Parque turístico", "Área de acampada", "Piscina municipal" };
	String[] sugerencias = new String[] { "Ruta muy entretenida", "Guía muy simpático", "Visitar el museo municipal",
			"La catedral es impresionante" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal2 window = new VentanaPrincipal2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnInfoUsuario = new JPanel();
		pnInfoUsuario.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnInfoUsuario.setPreferredSize(new Dimension(200, 10));
		frame.getContentPane().add(pnInfoUsuario, BorderLayout.WEST);
		pnInfoUsuario.setLayout(new BorderLayout(0, 0));

		pnAreaImagen = new JPanel();
		pnAreaImagen.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		pnInfoUsuario.add(pnAreaImagen, BorderLayout.NORTH);
		pnAreaImagen.setLayout(new BorderLayout(0, 0));

		pnImagen = new JPanel();
		pnAreaImagen.add(pnImagen, BorderLayout.NORTH);

		lblImagen = new JLabel("");
		lblImagen.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblImagen
				.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/perfiles/user.png")));
		pnImagen.add(lblImagen);

		lblUltimaConexion = new JLabel("Ultima conexion");
		lblUltimaConexion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUltimaConexion.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnInfoUsuario.add(lblUltimaConexion, BorderLayout.SOUTH);

		pnContenidoUsuario = new JPanel();
		pnInfoUsuario.add(pnContenidoUsuario, BorderLayout.CENTER);
		pnContenidoUsuario.setLayout(new GridLayout(6, 1, 0, 0));

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		pnContenidoUsuario.add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setEditable(false);
		txtUsuario.setPreferredSize(new Dimension(6, 5));
		txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		pnContenidoUsuario.add(txtUsuario);
		txtUsuario.setColumns(10);

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		pnContenidoUsuario.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		pnContenidoUsuario.add(txtNombre);
		txtNombre.setColumns(10);

		lblDireccinDeCorreo = new JLabel("Dirección de correo");
		lblDireccinDeCorreo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDireccinDeCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		pnContenidoUsuario.add(lblDireccinDeCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setEditable(false);
		txtCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		pnContenidoUsuario.add(txtCorreo);
		txtCorreo.setColumns(10);

		pnHerramientas = new JPanel();
		pnHerramientas.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		FlowLayout fl_pnHerramientas = (FlowLayout) pnHerramientas.getLayout();
		fl_pnHerramientas.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(pnHerramientas, BorderLayout.NORTH);

		btnAyuda = new JButton("");
		btnAyuda.setIcon(
				new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/info-32.png")));
		pnHerramientas.add(btnAyuda);
		btnAyuda.setBorderPainted(false);
		btnAyuda.setContentAreaFilled(false);

		btnCerrarSesion = new JButton("Cerrar Sesión");
		btnCerrarSesion.addActionListener(new BtnCerrarSesionActionListener());

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new BtnSalirActionListener());
		pnHerramientas.add(btnSalir);
		pnHerramientas.add(btnCerrarSesion);

		pnPrincipal = new JPanel();
		frame.getContentPane().add(pnPrincipal, BorderLayout.CENTER);
		pnPrincipal.setLayout(new BorderLayout(0, 0));

		tbPestañas = new JTabbedPane(JTabbedPane.TOP);
		pnPrincipal.add(tbPestañas, BorderLayout.CENTER);

		pnCircuitos = new JPanel();
		tbPestañas.addTab("Circuitos", null, pnCircuitos, null);
		pnCircuitos.setLayout(new BorderLayout(0, 0));

		pnListaCircuitos = new JPanel();
		pnListaCircuitos.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnCircuitos.add(pnListaCircuitos, BorderLayout.WEST);
		pnListaCircuitos.setLayout(new BorderLayout(0, 0));

		lblCircuitosContratados = new JLabel("Circuitos contratados:");
		pnListaCircuitos.add(lblCircuitosContratados, BorderLayout.NORTH);

		pnBotonesCircuitosList = new JPanel();
		pnBotonesCircuitosList.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnListaCircuitos.add(pnBotonesCircuitosList, BorderLayout.SOUTH);

		btnAniadirCircuito = new JButton("Añadir");
		pnBotonesCircuitosList.add(btnAniadirCircuito);

		btnLimpiarCircuito = new JButton("Limpiar");
		btnLimpiarCircuito.addActionListener(new BtnLimpiarCircuitoActionListener());

		btnModificar = new JButton("Modificar");
		btnModificar.setEnabled(false);
		pnBotonesCircuitosList.add(btnModificar);
		pnBotonesCircuitosList.add(btnLimpiarCircuito);

		btnEliminarCircuito = new JButton("Eliminar");
		btnEliminarCircuito.setEnabled(false);
		pnBotonesCircuitosList.add(btnEliminarCircuito);

		spnListaCircuito = new JScrollPane();
		pnListaCircuitos.add(spnListaCircuito, BorderLayout.CENTER);

		listCircuitos = new JList<Circuito>();
		listCircuitos.setModel(new AbstractListModel() {
			String[] values = new String[] { "Circuito 1" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		spnListaCircuito.setViewportView(listCircuitos);

		pnLugares = new MiJPanel(new JLabel());
		pnLugares.setPreferredSize(new Dimension(320, 10));
		pnLugares.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnCircuitos.add(pnLugares, BorderLayout.EAST);
		pnLugares.setLayout(new BorderLayout(0, 0));

		pnContratacion = new JPanel();
		pnContratacion.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnLugares.add(pnContratacion, BorderLayout.SOUTH);

		btnContratar = new JButton("Contratar");
		btnContratar.addActionListener(new BtnContratarActionListener());
		btnContratar.setIcon(new ImageIcon(
				VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/shopping-cart x16.png")));
		pnContratacion.add(btnContratar);

		chckbxContratado = new JCheckBox("Contratado");
		chckbxContratado.setEnabled(false);
		pnContratacion.add(chckbxContratado);

		pnBotonesLugares = new JPanel();
		pnLugares.add(pnBotonesLugares, BorderLayout.EAST);
		pnBotonesLugares.setLayout(new GridLayout(0, 1, 0, 0));

		btnAgregarlugar = new JButton("");
		btnAgregarlugar.addActionListener(new BtnAgregarlugarActionListener());
		btnAgregarlugar.setIcon(
				new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/plus-24.png")));
		btnAgregarlugar.setBorderPainted(false);
		btnAgregarlugar.setContentAreaFilled(false);
		pnBotonesLugares.add(btnAgregarlugar);

		btnEliminarlugar = new JButton("");
		btnEliminarlugar.setIcon(
				new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/iconos/remove-24.png")));
		btnEliminarlugar.setBorderPainted(false);
		btnEliminarlugar.setContentAreaFilled(false);
		pnBotonesLugares.add(btnEliminarlugar);

		pnListaLugares = new JPanel();
		pnLugares.add(pnListaLugares, BorderLayout.CENTER);
		pnListaLugares.setLayout(new BorderLayout(0, 0));

		lblLugaresDeVisita = new JLabel("Lugares de visita:");
		pnListaLugares.add(lblLugaresDeVisita, BorderLayout.NORTH);

		spnLugares = new JScrollPane();
		pnListaLugares.add(spnLugares, BorderLayout.CENTER);

		listLugares = new JList<Lugar>();
		listLugares.addMouseListener(new ListLugaresMouseListener());
		listLugares.setModel(new AbstractListModel() {
			String[] values = new String[] { "Lugar 1" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		spnLugares.setViewportView(listLugares);

		pnInfoCircuito = new JPanel();
		pnCircuitos.add(pnInfoCircuito, BorderLayout.CENTER);
		pnInfoCircuito.setLayout(new BorderLayout(0, 0));

		pnDatosCircuito = new JPanel();
		pnInfoCircuito.add(pnDatosCircuito, BorderLayout.NORTH);
		GridBagLayout gbl_pnDatosCircuito = new GridBagLayout();
		gbl_pnDatosCircuito.columnWidths = new int[] { 101, 101, 101, 0 };
		gbl_pnDatosCircuito.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_pnDatosCircuito.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0 };
		gbl_pnDatosCircuito.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnDatosCircuito.setLayout(gbl_pnDatosCircuito);

		lblNombreCircuito = new JLabel("Nombre circuito:");
		GridBagConstraints gbc_lblNombreCircuito = new GridBagConstraints();
		gbc_lblNombreCircuito.anchor = GridBagConstraints.EAST;
		gbc_lblNombreCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCircuito.gridx = 0;
		gbc_lblNombreCircuito.gridy = 1;
		pnDatosCircuito.add(lblNombreCircuito, gbc_lblNombreCircuito);

		txtfNombreCircuito = new JTextField();
		GridBagConstraints gbc_txtfNombreCircuito = new GridBagConstraints();
		gbc_txtfNombreCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_txtfNombreCircuito.gridwidth = 2;
		gbc_txtfNombreCircuito.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfNombreCircuito.gridx = 1;
		gbc_txtfNombreCircuito.gridy = 1;
		pnDatosCircuito.add(txtfNombreCircuito, gbc_txtfNombreCircuito);
		txtfNombreCircuito.setColumns(10);

		lblPersonasQueLo = new JLabel("Personas que lo han realizado:");
		GridBagConstraints gbc_lblPersonasQueLo = new GridBagConstraints();
		gbc_lblPersonasQueLo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonasQueLo.gridx = 0;
		gbc_lblPersonasQueLo.gridy = 2;
		pnDatosCircuito.add(lblPersonasQueLo, gbc_lblPersonasQueLo);

		spinnerPersonasCircuito = new JSpinner();
		spinnerPersonasCircuito.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinnerPersonasCircuito = new GridBagConstraints();
		gbc_spinnerPersonasCircuito.anchor = GridBagConstraints.WEST;
		gbc_spinnerPersonasCircuito.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerPersonasCircuito.gridx = 1;
		gbc_spinnerPersonasCircuito.gridy = 2;
		pnDatosCircuito.add(spinnerPersonasCircuito, gbc_spinnerPersonasCircuito);

		lblPrecio = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrecio.gridx = 0;
		gbc_lblPrecio.gridy = 3;
		pnDatosCircuito.add(lblPrecio, gbc_lblPrecio);

		txtfPrecioCircuito = new JTextField();
		GridBagConstraints gbc_txtfPrecioCircuito = new GridBagConstraints();
		gbc_txtfPrecioCircuito.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtfPrecioCircuito.insets = new Insets(0, 0, 0, 5);
		gbc_txtfPrecioCircuito.gridx = 1;
		gbc_txtfPrecioCircuito.gridy = 3;
		pnDatosCircuito.add(txtfPrecioCircuito, gbc_txtfPrecioCircuito);
		txtfPrecioCircuito.setColumns(10);

		pnEspacio = new JPanel();
		pnEspacio.setPreferredSize(new Dimension(10, 42));
		pnInfoCircuito.add(pnEspacio, BorderLayout.SOUTH);

		pnInciden_Puntos_Opiniones = new JPanel();
		pnInfoCircuito.add(pnInciden_Puntos_Opiniones, BorderLayout.CENTER);
		pnInciden_Puntos_Opiniones.setLayout(new BorderLayout(0, 0));

		pnIncidencias = new JPanel();
		pnInciden_Puntos_Opiniones.add(pnIncidencias, BorderLayout.NORTH);
		pnIncidencias.setLayout(new BorderLayout(0, 0));

		pntituloIncidencia = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pntituloIncidencia.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		pnIncidencias.add(pntituloIncidencia, BorderLayout.NORTH);

		lblIncidencias = new JLabel("Incidencias:");
		lblIncidencias.setHorizontalTextPosition(SwingConstants.CENTER);
		pntituloIncidencia.add(lblIncidencias);

		rdbtnSi = new JRadioButton("Si");
		buttonGroup_2.add(rdbtnSi);
		pntituloIncidencia.add(rdbtnSi);

		rdbtnNo = new JRadioButton("No");
		buttonGroup_2.add(rdbtnNo);
		pntituloIncidencia.add(rdbtnNo);

		pnListaIncidencia = new MiListaJPanel_2();
		pnListaIncidencia.getBtnAniadir().addActionListener(new PnListaIncidenciaBtnAniadirActionListener());
		pnIncidencias.add(pnListaIncidencia, BorderLayout.SOUTH);

		pnSugerencias = new JPanel();
		pnInciden_Puntos_Opiniones.add(pnSugerencias, BorderLayout.SOUTH);
		pnSugerencias.setLayout(new BorderLayout(0, 0));

		lblOpinionesYSugerencias = new JLabel("Opiniones y sugerencias:");
		pnSugerencias.add(lblOpinionesYSugerencias, BorderLayout.NORTH);

		pnListaSugerencias = new MiListaJPanel_2();
		pnSugerencias.add(pnListaSugerencias, BorderLayout.SOUTH);

		pnptosInteres_globales = new JPanel();
		pnInciden_Puntos_Opiniones.add(pnptosInteres_globales, BorderLayout.CENTER);
		pnptosInteres_globales.setLayout(new BorderLayout(0, 0));

		lblPuntosDeInteres = new JLabel("Puntos de interes:");
		pnptosInteres_globales.add(lblPuntosDeInteres, BorderLayout.NORTH);

		pnListaptosInteres_globales = new MiListaJPanel_2();
		pnptosInteres_globales.add(pnListaptosInteres_globales, BorderLayout.CENTER);

		pnGuias = new JPanel();
		pnGuias.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tbPestañas.addTab("Guías", null, pnGuias, null);
		pnGuias.setLayout(new BorderLayout(0, 0));

		pnListaGuias = new MiListaJPanel_1();
		pnListaGuias.getBtnLimpiar().addActionListener(new PnListaGuiasBtnLimpiarActionListener());
		pnListaGuias.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnGuias.add(pnListaGuias, BorderLayout.WEST);
		// pnListaGuias.setLayout(new BorderLayout(0, 0));

		lblGuiasContratados = new JLabel("Guías Contratados:");
		pnListaGuias.add(lblGuiasContratados, BorderLayout.NORTH);

		pnIdiomasGuia = new JPanel();
		pnIdiomasGuia.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnGuias.add(pnIdiomasGuia, BorderLayout.EAST);
		pnIdiomasGuia.setLayout(new BorderLayout(0, 0));

		lblIdiomas = new JLabel("Idiomas:");
		pnIdiomasGuia.add(lblIdiomas, BorderLayout.NORTH);

		pnEspacio3 = new JPanel();
		pnEspacio3.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		pnEspacio3.setPreferredSize(new Dimension(10, 36));
		pnIdiomasGuia.add(pnEspacio3, BorderLayout.SOUTH);

		pnListaIdioma = new MiListaJPanel_2();
		pnIdiomasGuia.add(pnListaIdioma, BorderLayout.CENTER);

		pnInfoGuia = new JPanel();
		pnGuias.add(pnInfoGuia, BorderLayout.CENTER);
		pnInfoGuia.setLayout(new BorderLayout(0, 0));

		pnEspacio1 = new JPanel();
		pnEspacio1.setPreferredSize(new Dimension(10, 38));
		pnInfoGuia.add(pnEspacio1, BorderLayout.SOUTH);

		pnInfoCentral = new JPanel();
		pnInfoGuia.add(pnInfoCentral, BorderLayout.CENTER);
		pnInfoCentral.setLayout(new BorderLayout(0, 0));

		pnImagenGuia = new JPanel();
		pnImagenGuia.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		pnInfoCentral.add(pnImagenGuia, BorderLayout.NORTH);

		lblImagenGuia = new JLabel("");
		lblImagenGuia.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblImagenGuia
				.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/perfiles/user.png")));
		pnImagenGuia.add(lblImagenGuia);

		btnSeleccionarGuia = new JButton("Seleccionar");
		btnSeleccionarGuia.addActionListener(new BtnSeleccionarGuiaActionListener());
		pnImagenGuia.add(btnSeleccionarGuia);

		pnHisRutasGuia = new JPanel();
		pnHisRutasGuia.setPreferredSize(new Dimension(10, 160));
		pnInfoCentral.add(pnHisRutasGuia, BorderLayout.SOUTH);
		pnHisRutasGuia.setLayout(new BorderLayout(0, 0));

		lblHistorialDeRutas = new JLabel("Historial de rutas:");
		pnHisRutasGuia.add(lblHistorialDeRutas, BorderLayout.NORTH);

		spnRutasGuia = new JScrollPane();
		spnRutasGuia.setPreferredSize(new Dimension(10, 60));
		pnHisRutasGuia.add(spnRutasGuia, BorderLayout.CENTER);

		listRutasGuia = new JList();
		spnRutasGuia.setViewportView(listRutasGuia);

		pnInfoGeneral = new JPanel();
		pnInfoCentral.add(pnInfoGeneral, BorderLayout.CENTER);
		GridBagLayout gbl_pnInfoGeneral = new GridBagLayout();
		gbl_pnInfoGeneral.columnWidths = new int[] { 0, 74, 27, 101 };
		gbl_pnInfoGeneral.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 30, 0, 0 };
		gbl_pnInfoGeneral.columnWeights = new double[] { 0.0, 0.0, 0.0 };
		gbl_pnInfoGeneral.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0 };
		pnInfoGeneral.setLayout(gbl_pnInfoGeneral);

		JLabel lblNombreGuia = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombreGuia = new GridBagConstraints();
		gbc_lblNombreGuia.anchor = GridBagConstraints.EAST;
		gbc_lblNombreGuia.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreGuia.gridx = 1;
		gbc_lblNombreGuia.gridy = 1;
		pnInfoGeneral.add(lblNombreGuia, gbc_lblNombreGuia);

		txtNombreguia = new JTextField();
		GridBagConstraints gbc_txtNombreguia = new GridBagConstraints();
		gbc_txtNombreguia.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreguia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreguia.gridx = 2;
		gbc_txtNombreguia.gridy = 1;
		pnInfoGeneral.add(txtNombreguia, gbc_txtNombreguia);
		txtNombreguia.setColumns(10);

		lblApellidosGuia = new JLabel("Apellidos:");
		GridBagConstraints gbc_lblApellidosGuia = new GridBagConstraints();
		gbc_lblApellidosGuia.anchor = GridBagConstraints.EAST;
		gbc_lblApellidosGuia.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidosGuia.gridx = 1;
		gbc_lblApellidosGuia.gridy = 2;
		pnInfoGeneral.add(lblApellidosGuia, gbc_lblApellidosGuia);

		txtApellidosGuia = new JTextField();
		GridBagConstraints gbc_txtApellidosGuia = new GridBagConstraints();
		gbc_txtApellidosGuia.gridwidth = 2;
		gbc_txtApellidosGuia.insets = new Insets(0, 0, 5, 0);
		gbc_txtApellidosGuia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidosGuia.gridx = 2;
		gbc_txtApellidosGuia.gridy = 2;
		pnInfoGeneral.add(txtApellidosGuia, gbc_txtApellidosGuia);
		txtApellidosGuia.setColumns(10);

		lblCorreoGuia = new JLabel("Correo:");
		GridBagConstraints gbc_lblCorreoGuia = new GridBagConstraints();
		gbc_lblCorreoGuia.anchor = GridBagConstraints.EAST;
		gbc_lblCorreoGuia.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoGuia.gridx = 1;
		gbc_lblCorreoGuia.gridy = 3;
		pnInfoGeneral.add(lblCorreoGuia, gbc_lblCorreoGuia);

		txtCorreoguia = new JTextField();
		GridBagConstraints gbc_txtCorreoguia = new GridBagConstraints();
		gbc_txtCorreoguia.gridwidth = 2;
		gbc_txtCorreoguia.insets = new Insets(0, 0, 5, 0);
		gbc_txtCorreoguia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCorreoguia.gridx = 2;
		pnInfoGeneral.add(txtCorreoguia, gbc_txtCorreoguia);
		txtCorreoguia.setColumns(10);

		lblNTelefono = new JLabel("Nº Teléfono:");
		GridBagConstraints gbc_lblNTelefono = new GridBagConstraints();
		gbc_lblNTelefono.anchor = GridBagConstraints.EAST;
		gbc_lblNTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblNTelefono.gridx = 1;
		gbc_lblNTelefono.gridy = 4;
		pnInfoGeneral.add(lblNTelefono, gbc_lblNTelefono);

		txtNumeroGuia = new JTextField();
		GridBagConstraints gbc_txtNumeroGuia = new GridBagConstraints();
		gbc_txtNumeroGuia.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumeroGuia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumeroGuia.gridx = 2;
		gbc_txtNumeroGuia.gridy = 4;
		pnInfoGeneral.add(txtNumeroGuia, gbc_txtNumeroGuia);
		txtNumeroGuia.setColumns(10);

		lblPrecioHora = new JLabel("Precio / Hora:");
		GridBagConstraints gbc_lblPrecioHora = new GridBagConstraints();
		gbc_lblPrecioHora.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioHora.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioHora.gridx = 1;
		gbc_lblPrecioHora.gridy = 5;
		pnInfoGeneral.add(lblPrecioHora, gbc_lblPrecioHora);

		txtPrecioGuia = new JTextField();
		GridBagConstraints gbc_txtPrecioGuia = new GridBagConstraints();
		gbc_txtPrecioGuia.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioGuia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioGuia.gridx = 2;
		gbc_txtPrecioGuia.gridy = 5;
		pnInfoGeneral.add(txtPrecioGuia, gbc_txtPrecioGuia);
		txtPrecioGuia.setColumns(10);

		lblPuntuacion = new JLabel("Puntuación:");
		GridBagConstraints gbc_lblPuntuacion = new GridBagConstraints();
		gbc_lblPuntuacion.anchor = GridBagConstraints.EAST;
		gbc_lblPuntuacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntuacion.gridx = 1;
		gbc_lblPuntuacion.gridy = 6;
		pnInfoGeneral.add(lblPuntuacion, gbc_lblPuntuacion);

		txtPuntuacionGuia = new JTextField();
		GridBagConstraints gbc_txtPuntuacionGuia = new GridBagConstraints();
		gbc_txtPuntuacionGuia.insets = new Insets(0, 0, 5, 5);
		gbc_txtPuntuacionGuia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPuntuacionGuia.gridx = 2;
		gbc_txtPuntuacionGuia.gridy = 6;
		pnInfoGeneral.add(txtPuntuacionGuia, gbc_txtPuntuacionGuia);
		txtPuntuacionGuia.setColumns(10);

		lblDisponibilidadGuia = new JLabel("Disponibilidad:");
		GridBagConstraints gbc_lblDisponibilidadGuia = new GridBagConstraints();
		gbc_lblDisponibilidadGuia.anchor = GridBagConstraints.EAST;
		gbc_lblDisponibilidadGuia.insets = new Insets(0, 0, 5, 5);
		gbc_lblDisponibilidadGuia.gridx = 1;
		gbc_lblDisponibilidadGuia.gridy = 7;
		pnInfoGeneral.add(lblDisponibilidadGuia, gbc_lblDisponibilidadGuia);

		rdbtnSi_2 = new JRadioButton("Sí");
		buttonGroup.add(rdbtnSi_2);
		GridBagConstraints gbc_rdbtnSi_2 = new GridBagConstraints();
		gbc_rdbtnSi_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnSi_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnSi_2.gridx = 2;
		gbc_rdbtnSi_2.gridy = 7;
		pnInfoGeneral.add(rdbtnSi_2, gbc_rdbtnSi_2);

		rdbtnNo_2 = new JRadioButton("No");
		buttonGroup.add(rdbtnNo_2);
		GridBagConstraints gbc_rdbtnNo_2 = new GridBagConstraints();
		gbc_rdbtnNo_2.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNo_2.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNo_2.gridx = 3;
		gbc_rdbtnNo_2.gridy = 7;
		pnInfoGeneral.add(rdbtnNo_2, gbc_rdbtnNo_2);

		pnGrupos = new JPanel();
		tbPestañas.addTab("Grupos", null, pnGrupos, null);
		pnGrupos.setLayout(new BorderLayout(0, 0));

		pnListaGrupos = new JPanel();
		pnListaGrupos.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnGrupos.add(pnListaGrupos, BorderLayout.WEST);
		pnListaGrupos.setLayout(new BorderLayout(0, 0));

		lblGruposTusiticos = new JLabel("Grupos tuísticos (4 - 20 personas):");
		pnListaGrupos.add(lblGruposTusiticos, BorderLayout.NORTH);

		pnBotonesGrupos = new JPanel();
		pnBotonesGrupos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnListaGrupos.add(pnBotonesGrupos, BorderLayout.SOUTH);

		btnAniadirGrupo = new JButton("Añadir");
		pnBotonesGrupos.add(btnAniadirGrupo);

		btnLimpiarGrupo = new JButton("Limpiar");
		btnLimpiarGrupo.addActionListener(new BtnLimpiarGruposActionListener());

		btnModificarGrupo = new JButton("Modificar");
		btnModificarGrupo.setEnabled(false);
		pnBotonesGrupos.add(btnModificarGrupo);
		pnBotonesGrupos.add(btnLimpiarGrupo);

		btnEliminarGrupo = new JButton("Eliminar");
		btnEliminarGrupo.setEnabled(false);
		pnBotonesGrupos.add(btnEliminarGrupo);

		spnListaGrupos = new JScrollPane();
		pnListaGrupos.add(spnListaGrupos, BorderLayout.CENTER);

		listGrupos = new JList<GrupoTuristas>();
		spnListaGrupos.setViewportView(listGrupos);

		pnListaIntegrantes = new JPanel();
		pnListaIntegrantes.setPreferredSize(new Dimension(550, 10));
		pnListaIntegrantes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnGrupos.add(pnListaIntegrantes, BorderLayout.EAST);
		pnListaIntegrantes.setLayout(new BorderLayout(0, 0));

		lblIntegrantes = new JLabel("Integrantes:");
		pnListaIntegrantes.add(lblIntegrantes, BorderLayout.NORTH);

		pnBotonesIntegrantes = new JPanel();
		pnListaIntegrantes.add(pnBotonesIntegrantes, BorderLayout.SOUTH);

		btnAgregar_1 = new JButton("Agregar");
		btnAgregar_1.addActionListener(new BtnAgregar_1ActionListener());
		btnAgregar_1.setIcon(null);
		pnBotonesIntegrantes.add(btnAgregar_1);

		btnBorrar_1 = new JButton("Borrar");
		btnBorrar_1.addActionListener(new BtnBorrar_1ActionListener());
		btnBorrar_1.setIcon(null);
		pnBotonesIntegrantes.add(btnBorrar_1);

		pnTablaIntegrantes = new JPanel();
		pnListaIntegrantes.add(pnTablaIntegrantes, BorderLayout.CENTER);
		pnTablaIntegrantes.setLayout(new BorderLayout(0, 0));

		pnFotoIntegrante = new JPanel();
		pnTablaIntegrantes.add(pnFotoIntegrante, BorderLayout.SOUTH);
		pnFotoIntegrante.setLayout(new BorderLayout(0, 0));

		spnInfoImagenes = new JScrollPane();
		pnFotoIntegrante.add(spnInfoImagenes, BorderLayout.CENTER);

		txIntegranteSeleccionado = new JTextPane();
		txIntegranteSeleccionado.setEditable(false);
		spnInfoImagenes.setViewportView(txIntegranteSeleccionado);

		lblFotoSeleccionada = new JLabel("\r\n");
		lblFotoSeleccionada
				.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/presentacion/imagenes/perfiles/user.png")));
		pnFotoIntegrante.add(lblFotoSeleccionada, BorderLayout.WEST);

		spnTablaIntegrantes = new JScrollPane();
		pnTablaIntegrantes.add(spnTablaIntegrantes, BorderLayout.CENTER);

		tablaIntegrantes = new JTable();
		tablaIntegrantes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		spnTablaIntegrantes.setViewportView(tablaIntegrantes);

		// Se lleva a cabo la creacion del modelo de tabla
		crear_miModeloTabla();

		pnInfoGrupo = new JPanel();
		pnGrupos.add(pnInfoGrupo, BorderLayout.CENTER);
		pnInfoGrupo.setLayout(new BorderLayout(0, 0));

		pnEspacio2 = new JPanel();
		pnEspacio2.setPreferredSize(new Dimension(10, 42));
		pnInfoGrupo.add(pnEspacio2, BorderLayout.SOUTH);

		pnInfoGrupCentral = new JPanel();
		pnInfoGrupo.add(pnInfoGrupCentral, BorderLayout.CENTER);
		pnInfoGrupCentral.setLayout(new BorderLayout(0, 0));

		pnInfoGrupo1 = new JPanel();
		pnInfoGrupCentral.add(pnInfoGrupo1, BorderLayout.NORTH);
		GridBagLayout gbl_pnInfoGrupo1 = new GridBagLayout();
		gbl_pnInfoGrupo1.columnWidths = new int[] { 125, 101, 0, 0, 0 };
		gbl_pnInfoGrupo1.rowHeights = new int[] { 0, 0, 0, 30, 0, 0, 0 };
		gbl_pnInfoGrupo1.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0 };
		gbl_pnInfoGrupo1.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnInfoGrupo1.setLayout(gbl_pnInfoGrupo1);

		lblNombreGrupo = new JLabel("Nombre grupo:");
		GridBagConstraints gbc_lblNombreGrupo = new GridBagConstraints();
		gbc_lblNombreGrupo.anchor = GridBagConstraints.EAST;
		gbc_lblNombreGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreGrupo.gridx = 0;
		gbc_lblNombreGrupo.gridy = 1;
		pnInfoGrupo1.add(lblNombreGrupo, gbc_lblNombreGrupo);

		txtNombreGrupo = new JTextField();
		GridBagConstraints gbc_txtNombreGrupo = new GridBagConstraints();
		gbc_txtNombreGrupo.gridwidth = 2;
		gbc_txtNombreGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreGrupo.gridx = 1;
		gbc_txtNombreGrupo.gridy = 1;
		pnInfoGrupo1.add(txtNombreGrupo, gbc_txtNombreGrupo);
		txtNombreGrupo.setColumns(10);

		lblPaisOrigen = new JLabel("Pais origen:");
		GridBagConstraints gbc_lblPaisOrigen = new GridBagConstraints();
		gbc_lblPaisOrigen.anchor = GridBagConstraints.EAST;
		gbc_lblPaisOrigen.insets = new Insets(0, 0, 5, 5);
		gbc_lblPaisOrigen.gridx = 0;
		gbc_lblPaisOrigen.gridy = 2;
		pnInfoGrupo1.add(lblPaisOrigen, gbc_lblPaisOrigen);

		txtPais = new JTextField();
		GridBagConstraints gbc_txtPais = new GridBagConstraints();
		gbc_txtPais.insets = new Insets(0, 0, 5, 5);
		gbc_txtPais.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPais.gridx = 1;
		gbc_txtPais.gridy = 2;
		pnInfoGrupo1.add(txtPais, gbc_txtPais);
		txtPais.setColumns(10); //

		lblLugarDeAlojamiento = new JLabel("Alojamiento:");
		GridBagConstraints gbc_lblLugarDeAlojamiento = new GridBagConstraints();
		gbc_lblLugarDeAlojamiento.anchor = GridBagConstraints.EAST;
		gbc_lblLugarDeAlojamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblLugarDeAlojamiento.gridx = 0;
		gbc_lblLugarDeAlojamiento.gridy = 3;
		pnInfoGrupo1.add(lblLugarDeAlojamiento, gbc_lblLugarDeAlojamiento);

		txtAlojamiento = new JTextField();
		GridBagConstraints gbc_txtAlojamiento = new GridBagConstraints();
		gbc_txtAlojamiento.insets = new Insets(0, 0, 5, 5);
		gbc_txtAlojamiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAlojamiento.gridx = 1;
		gbc_txtAlojamiento.gridy = 3;
		pnInfoGrupo1.add(txtAlojamiento, gbc_txtAlojamiento);
		txtAlojamiento.setColumns(10);

		lblTipologia = new JLabel("Tipología:");
		GridBagConstraints gbc_lblTipologia = new GridBagConstraints();
		gbc_lblTipologia.anchor = GridBagConstraints.EAST;
		gbc_lblTipologia.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipologia.gridx = 0;
		gbc_lblTipologia.gridy = 4;
		pnInfoGrupo1.add(lblTipologia, gbc_lblTipologia);

		comboTipGrupo = new JComboBox();
		comboTipGrupo.setModel(
				new DefaultComboBoxModel(new String[] { "", "Cultural", "Natural", "Gastronómico", "Reunión" }));
		GridBagConstraints gbc_comboTipGrupo = new GridBagConstraints();
		gbc_comboTipGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_comboTipGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboTipGrupo.gridx = 1;
		gbc_comboTipGrupo.gridy = 4;
		pnInfoGrupo1.add(comboTipGrupo, gbc_comboTipGrupo);

		lblGua = new JLabel("Guía:");
		GridBagConstraints gbc_lblGua = new GridBagConstraints();
		gbc_lblGua.anchor = GridBagConstraints.EAST;
		gbc_lblGua.insets = new Insets(0, 0, 5, 5);
		gbc_lblGua.gridx = 0;
		gbc_lblGua.gridy = 5;
		pnInfoGrupo1.add(lblGua, gbc_lblGua);

		comboGuiaGrupo = new JComboBox();
		GridBagConstraints gbc_comboGuiaGrupo = new GridBagConstraints();
		gbc_comboGuiaGrupo.insets = new Insets(0, 0, 5, 5);
		gbc_comboGuiaGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboGuiaGrupo.gridx = 1;
		gbc_comboGuiaGrupo.gridy = 5;
		pnInfoGrupo1.add(comboGuiaGrupo, gbc_comboGuiaGrupo);

		pnInteresesGrupo = new MiListaJPanel_2();
		pnInfoGrupCentral.add(pnInteresesGrupo, BorderLayout.SOUTH);

		lblIntereses = new JLabel("Intereses:");
		pnInteresesGrupo.add(lblIntereses, BorderLayout.NORTH);

		pnRestricciones = new MiListaJPanel_2();
		pnInfoGrupCentral.add(pnRestricciones, BorderLayout.CENTER);

		pnTituloRestric = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pnTituloRestric.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		pnRestricciones.add(pnTituloRestric, BorderLayout.NORTH);

		lblRestricciones = new JLabel("Restricciones: ");
		pnTituloRestric.add(lblRestricciones);

		rdbtnSi_1 = new JRadioButton("Sí");
		buttonGroup_1.add(rdbtnSi_1);
		pnTituloRestric.add(rdbtnSi_1);

		rdbtnNo_1 = new JRadioButton("No");
		buttonGroup_1.add(rdbtnNo_1);
		pnTituloRestric.add(rdbtnNo_1);

		pnDiseñoRuta = new JPanel();
		tbPestañas.addTab("Diseño Ruta", null, pnDiseñoRuta, null);

		// mostrar_usuario();
		/*
		 * String[] k = { "Alto", "Bajo" }; VentanaLista vl = new VentanaLista(k);
		 * vl.setVisible(true);
		 */

	}

	///////////////////////////////////////// Métodos basicos
	///////////////////////////////////////// /////////////////////////////////////////////////////

	private void crear_miModeloTabla() {
		modeloTabla = new MiModeloJTable();
		tablaIntegrantes.setModel(modeloTabla);
		tablaIntegrantes.setRowHeight(50);
		TableColumn columnaFoto = tablaIntegrantes.getColumnModel().getColumn(4);
		columnaFoto.setCellEditor(new MiColumnaFotoEditor());

		ListSelectionModel rowSM = tablaIntegrantes.getSelectionModel();
		rowSM.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				ListSelectionModel lsm = (ListSelectionModel) e.getSource();
				if (!lsm.isSelectionEmpty()) {
					modeloTabla = (MiModeloJTable) tablaIntegrantes.getModel();
					int n = tablaIntegrantes.getSelectedRow();
					if (n != -1) {
						String contenido = "Nombre :" + modeloTabla.getValueAt(n, 0) + ":\nApellidos: "
								+ modeloTabla.getValueAt(n, 1) + "\nEdad: " + modeloTabla.getValueAt(n, 2)
								+ "\nNº teléfono: " + modeloTabla.getValueAt(n, 3) + "\n";
						txIntegranteSeleccionado.setText(contenido);
						lblFotoSeleccionada.setIcon((ImageIcon) modeloTabla.getValueAt(n, 4));
					}
				}
			}
		});
	}

	// Metodos Limpieza
	private void limpiar_circuitos() {
		txtfNombreCircuito.setText("");
		spinnerPersonasCircuito.setValue(0);
		txtfPrecioCircuito.setText("");
		rdbtnSi.setSelected(false);
		rdbtnNo.setSelected(false);
		btnContratar.setEnabled(true);
		chckbxContratado.setSelected(false);
		buttonGroup_2.setSelected(rdbtnNo.getModel(), false);

		// TRATAMIENTO DE LISTAS
	}

	private void limpiar_guias() {
		txtNombreguia.setText("");
		txtApellidosGuia.setText("");
		txtCorreoguia.setText("");
		txtPrecioGuia.setText("");
		txtPuntuacionGuia.setText("");
		txtNumeroGuia.setText("");
		rdbtnNo_2.setSelected(false);
		rdbtnSi_2.setSelected(false);

		// TRATAMIENTO DE LISTAS
	}

	private void limpiar_grupos() {
		txtNombreGrupo.setText("");
		txtPais.setText("");
		txtAlojamiento.setText("");
		comboTipGrupo.setSelectedIndex(-1);
		comboGuiaGrupo.setSelectedIndex(-1);
		rdbtnNo_1.setSelected(false);
		rdbtnSi_1.setSelected(false);

		// TRATAMIENTO DE LISTA
	}

	private void mostrar_usuario() {

		txtUsuario.setText(user.getUsuario());
		txtNombre.setText(user.getNombre());
		txtCorreo.setText(user.getCorreo());
		lblUltimaConexion.setText(user.getUltima_conexion());
		// lblImagen.setIcon((new
		// ImageIcon(VentanaPrincipal.class.getResource(user.getImagen()))));

	}

	private void aniadirCircuito() {
		Circuito circuito = null;
		if (!camposCircuito()) {
			JOptionPane.showMessageDialog(null, "Existencia de ampos vacíos, revise los datos introducidos.", "",
					JOptionPane.ERROR_MESSAGE);
		}

		else {
			circuito = new Circuito(txtfNombreCircuito.getText(),  (Integer)spinnerPersonasCircuito.getValue(), Double.parseDouble(txtfPrecioCircuito.getText()), lista_incidencias, lista_ptosInteres, lista_sugerencias, lista_lugares, chckbxContratado.isSelected());

		}

	}

	private boolean camposCircuito() {
		return (txtfNombreCircuito != null || txtfPrecioCircuito != null || !lista_lugares.isEmpty()
				|| !(lista_ptosInteres.isEmpty()) || (!rdbtnNo.isSelected() && !rdbtnSi.isSelected()));
	}

//////////////////////////////////////////Metodos ActionListener (Acciones Botones) //////////////////////////////////////

	public JFrame getFrame() {
		return frame;
	}

	private class BtnCerrarSesionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaLogin ventana_login = new VentanaLogin();
			frame.dispose();
			ventana_login.getFrmAccesoManchatours().setVisible(true);

		}

	}

	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
		}
	}

	private class BtnSeleccionarGuiaActionListener implements ActionListener {
		private ImageIcon imagen;

		public void actionPerformed(ActionEvent e) {
			JFileChooser seleccionar = new JFileChooser();
			int vDevuelto = seleccionar.showOpenDialog(frame);
			if (vDevuelto == JFileChooser.APPROVE_OPTION) {
				File archivo = seleccionar.getSelectedFile();
				imagen = new ImageIcon(archivo.getAbsolutePath());
				lblImagenGuia.setIcon(imagen);
			}

		}
	}

	private class BtnAgregar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modeloTabla = (MiModeloJTable) tablaIntegrantes.getModel();
			Object[] nuevaFila = { "", "", "", "", new ImageIcon(
					getClass().getClassLoader().getResource("presentacion/imagenes/iconos/userApp.png")) };
			modeloTabla.aniadeFila(nuevaFila);
			modeloTabla.fireTableDataChanged();

		}
	}

	private class BtnBorrar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			modeloTabla = (MiModeloJTable) tablaIntegrantes.getModel();
			int n = tablaIntegrantes.getSelectedRow();
			if (n != -1)
				modeloTabla.eliminaFila(tablaIntegrantes.getSelectedRow());
			modeloTabla.fireTableDataChanged();
			txIntegranteSeleccionado.setText("");
			lblFotoSeleccionada.setIcon(null);
		}
	}

	private class BtnContratarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
// if (!lanzadoPago) {
			VentanaPago ventana_pago = new VentanaPago(btnContratar, chckbxContratado, txtfNombreCircuito.getText(),
					0.00, null);
			ventana_pago.getFrmPasarelaDePago().setVisible(true);
// lanzadoPago = true;
// }
		}
	}

	private class ListLugaresMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (!lanzadoLugarInfo) {
				VentanaLugar ventana_lugar = new VentanaLugar();
				ventana_lugar.getFrmLugarVisita().setVisible(true);
				lanzadoLugarInfo = true;
			}
		}
	}

	private class BtnAgregarlugarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaLugar ventana_lugar;
			ventana_lugar = new VentanaLugar();
			ventana_lugar.getFrmLugarVisita().setVisible(true);
			ventana_lugar.getPnPrincipal().getBtnAceptar().setText("Guardar");
			lanzadoCreaLugar = true;
		}
	}

	private class BtnLimpiarCircuitoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			limpiar_circuitos();
		}
	}

	private class PnListaGuiasBtnLimpiarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			limpiar_guias();
		}
	}

	private class BtnLimpiarGruposActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			limpiar_grupos();
		}
	}

	private class PnListaIncidenciaBtnAniadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			VentanaLista vl = new VentanaLista(restricciones, pnRestricciones.getList());
			vl.setVisible(true);
		}
	}

}
