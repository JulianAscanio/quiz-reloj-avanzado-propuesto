import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RelojController {

    @FXML
    private Button cmdAdelantaMinuto;

    @FXML
    private Button cmdRetrocedeMinuto;

    @FXML
    private Button cmdAdelantaHora;

    @FXML
    private Button cmdRetrocedeHora;

    @FXML
    private Button cmdAdelantaSegundo;

    @FXML
    private Button cmdRetrocedeSegundo;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtAdorno1;

    @FXML
    private TextField txtMinuto;

    @FXML
    private TextField txtAdorno2;

    @FXML
    private TextField txtSegundo;

    @FXML
    private Label lblAdorno;

    private Reloj reloj;

    @FXML
    void adelantarHora() {
        reloj.avanzarHorario();
        actualizarGUI();
    }

    @FXML
    void adelantarMinuto() {
        reloj.avanzarMinutero();
        actualizarGUI();
    }

    @FXML
    void adelantarSegundo() {
        reloj.avanzarSegundero();
        actualizarGUI();
    }

    @FXML
    void retrocederHora() {
        reloj.retrocederHorario();
        actualizarGUI();
    }

    @FXML
    void retrocederMinuto() {
        reloj.retrocederMinutero();
        actualizarGUI();
    }

    @FXML
    void retrocederSegundo() {
        reloj.retrocederSegundero();
        actualizarGUI();
    }

    void actualizarGUI(){
        int h = reloj.getHoras();
        int m = reloj.getMinutos();
        int s = reloj.getSegundos();
        txtHora.setText((h<10?"0":"")+h); 
        txtMinuto.setText((m<10?"0":"")+m); 
        txtSegundo.setText((s<10?"0":"")+s); 
    }

    @FXML
    void initialize() {
        assert cmdAdelantaMinuto != null : "fx:id=\"cmdAdelantaMinuto\" was not injected: check your FXML file 'clock.fxml'.";
        assert cmdRetrocedeMinuto != null : "fx:id=\"cmdRetrocedeMinuto\" was not injected: check your FXML file 'clock.fxml'.";
        assert cmdAdelantaHora != null : "fx:id=\"cmdAdelantaHora\" was not injected: check your FXML file 'clock.fxml'.";
        assert cmdRetrocedeHora != null : "fx:id=\"cmdRetrocedeHora\" was not injected: check your FXML file 'clock.fxml'.";
        assert cmdAdelantaSegundo != null : "fx:id=\"cmdAdelantaSegundo\" was not injected: check your FXML file 'clock.fxml'.";
        assert cmdRetrocedeSegundo != null : "fx:id=\"cmdRetrocedeSegundo\" was not injected: check your FXML file 'clock.fxml'.";
        assert txtHora != null : "fx:id=\"txtHora\" was not injected: check your FXML file 'clock.fxml'.";
        assert txtAdorno1 != null : "fx:id=\"txtAdorno1\" was not injected: check your FXML file 'clock.fxml'.";
        assert txtMinuto != null : "fx:id=\"txtMinuto\" was not injected: check your FXML file 'clock.fxml'.";
        assert txtAdorno2 != null : "fx:id=\"txtAdorno2\" was not injected: check your FXML file 'clock.fxml'.";
        assert txtSegundo != null : "fx:id=\"txtSegundo\" was not injected: check your FXML file 'clock.fxml'.";
        assert lblAdorno != null : "fx:id=\"lblAdorno\" was not injected: check your FXML file 'clock.fxml'.";
        reloj = new Reloj();
        actualizarGUI();
    }

}

